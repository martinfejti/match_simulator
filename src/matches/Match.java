package matches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

import seasons.Season;
import seasons.SerieA2006Season;
import teams.Player;
import teams.Team;

public class Match {

    public static void main(String[] args) {

        /*
        Team manCity = MatchSimulation.createManCity();
        Team manUnited = MatchSimulation.createManUnited();
        Team liverpool = MatchSimulation.createLiverpool();
        Team chelsea = MatchSimulation.createChelsea();
        */
        Team milan = SerieA2006Season.createMilan();
        Team juventus = SerieA2006Season.createJuventus();
        Team inter = SerieA2006Season.createInternazionale();
        Team roma = SerieA2006Season.createRoma();
        Team lazio = SerieA2006Season.createLazio();
        Team fiorentia = SerieA2006Season.createFiorentina();
        Team siena = SerieA2006Season.createSiena();
        Team parma = SerieA2006Season.createParma();
        Team sampdoria = SerieA2006Season.createSampdoria();
        Team lecce = SerieA2006Season.createLecce();
        Team palermo = SerieA2006Season.createPalermo();
        Team udinese = SerieA2006Season.createUdinese();
        Team chievo = SerieA2006Season.createChievo();
        Team reggina = SerieA2006Season.createReggina();
        Team cagliari = SerieA2006Season.createCagliari();
        Team messina = SerieA2006Season.createMessina();
        Team livorno = SerieA2006Season.createLivorno();
        Team empoli = SerieA2006Season.createEmpoli();
        Team treviso = SerieA2006Season.createTreviso();
        Team ascoli = SerieA2006Season.createAscoli();
        /*
        Team manCity2 = MatchSimulation.createManCity2();
        Team manUnited2 = MatchSimulation.createManUnited2();
        Team liverpool2 = MatchSimulation.createLiverpool2();
        Team chelsea2 = MatchSimulation.createChelsea2();
        
        Team manCity3 = MatchSimulation.createManCity3();
        Team manUnited3 = MatchSimulation.createManUnited3();
        Team liverpool3 = MatchSimulation.createLiverpool3();
        Team chelsea3 = MatchSimulation.createChelsea3();
        
        Team manCity4 = MatchSimulation.createManCity4();
        Team manUnited4 = MatchSimulation.createManUnited4();
        Team liverpool4 = MatchSimulation.createLiverpool4();
        Team chelsea4 = MatchSimulation.createChelsea4();
        
        Team manCity5 = MatchSimulation.createManCity5();
        Team manUnited5 = MatchSimulation.createManUnited5();
        Team liverpool5 = MatchSimulation.createLiverpool5();
        Team chelsea5 = MatchSimulation.createChelsea5();
        */
        List<Team> teamListForResults = new ArrayList<>();
        teamListForResults.add(milan);
        teamListForResults.add(juventus);
        teamListForResults.add(inter);
        teamListForResults.add(roma);
        teamListForResults.add(lazio);
        teamListForResults.add(fiorentia);
        teamListForResults.add(siena);
        teamListForResults.add(parma);
        teamListForResults.add(sampdoria);
        teamListForResults.add(palermo);
        teamListForResults.add(lecce);
        teamListForResults.add(udinese);
        teamListForResults.add(chievo);
        teamListForResults.add(reggina);
        teamListForResults.add(cagliari);
        teamListForResults.add(messina);
        teamListForResults.add(livorno);
        teamListForResults.add(empoli);
        teamListForResults.add(treviso);
        teamListForResults.add(ascoli);
        /*
        teamListForResults.add(manCity2);
        teamListForResults.add(manUnited2);
        teamListForResults.add(liverpool2);
        teamListForResults.add(chelsea2);
        teamListForResults.add(manCity3);
        teamListForResults.add(manUnited3);
        teamListForResults.add(liverpool3);
        teamListForResults.add(chelsea3);
        teamListForResults.add(manCity4);
        teamListForResults.add(manUnited4);
        teamListForResults.add(liverpool4);
        teamListForResults.add(chelsea4);
        teamListForResults.add(manCity5);
        teamListForResults.add(manUnited5);
        teamListForResults.add(liverpool5);
        teamListForResults.add(chelsea5);
        
        Season season = Season.createSeasonWith20Teams("PL teszt 2020", manCity, manUnited, liverpool, chelsea, manCity2, manUnited2, liverpool2, chelsea2, manCity3, manUnited3, liverpool3, chelsea3,
                manCity4, manUnited4, liverpool4, chelsea4, manCity5, manUnited5, liverpool5, chelsea5);
        */
        // Season season = Season.createSeasonWith4Teams("PL teszt 2020", milan, juventus, inter, fiorentia);
        Season season = Season.createSeasonWith20Teams("Serie A 2005/2006", milan, juventus, inter, roma, lazio, fiorentia, siena, parma, sampdoria, palermo, lecce, udinese, chievo, reggina, cagliari, messina, livorno, empoli, treviso, ascoli);
        
        Season.getMatches()
            .stream()
            .forEach(match -> MatchSimulation.simulateMatch(match));
        
        System.out.println("\n");
        teamListForResults
            .stream()
            .sorted(Comparator.comparing(Team::getPoints).reversed())
            .forEach(team -> System.out.println(team.getName() + " - " + team.getPoints() + " - LG: " + team.getScoredGoals() + " - KG: " + team.getConcededGoals() + " M: " + team.getMatchesPlayed()));
        
        System.out.println("\nGollovolista:");
        teamListForResults
                .stream()
                .flatMap(team -> team.getListOfPlayers().stream())
                .sorted(Comparator.comparing(Player::getGoals).reversed())
                .filter(player -> player.getGoals() > 0)
                //.filter(player -> player.getPosition().equals("DEF"))
                .forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getGoals()));
        
        System.out.println("\nGollovolista - vedok:");
        teamListForResults
                .stream()
                .flatMap(team -> team.getListOfPlayers().stream())
                .sorted(Comparator.comparing(Player::getGoals).reversed())
                .filter(player -> player.getGoals() > 0)
                .filter(player -> player.getPosition().equals("DEF"))
                .forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getGoals()));
                
        
        
    }

    
}
