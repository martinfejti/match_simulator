package matches;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import teams.Player;
import teams.Team;

public class MatchSimulation {

    public static void simulateMatch(MatchDto match) {

        List<String> goalscorers = new ArrayList<>();
        
        /*
        System.out.println("Started...");
        
        System.out.println("Teams created.");
        
        System.out.println("Home Team: " + match.getHomeTeam().getName());
        for (int i = 0; i < match.getHomeTeam().getListOfPlayers().size(); i++) {
            System.out.println("\n" + match.getHomeTeam().getListOfPlayers().get(i).getPlayerName());
        }
        
        System.out.println("Away Team: " + match.getAwayTeam().getName());
        for (int i = 0; i < match.getAwayTeam().getListOfPlayers().size(); i++) {
            System.out.println("\n" + match.getAwayTeam().getListOfPlayers().get(i).getPlayerName());
        }
        */
        
        //Collect data for the match
        double homeTeamForwardsAvg = getTeamForwardsAvg(match.getHomeTeam());
        double homeTeamMidfieldersAvg = getTeamMidfieldersAvg(match.getHomeTeam());
        double homeTeamDefendersAvg = getTeamDefendersAvg(match.getHomeTeam());
        double homeTeamAvg = (homeTeamForwardsAvg + homeTeamMidfieldersAvg + homeTeamDefendersAvg) / 3; // doesnt contain keeper!!! later...
        
        double awayTeamForwardsAvg = getTeamForwardsAvg(match.getAwayTeam());
        double awayTeamMidfieldersAvg = getTeamMidfieldersAvg(match.getAwayTeam());
        double awayTeamDefendersAvg = getTeamDefendersAvg(match.getAwayTeam());
        double awayTeamAvg = (awayTeamForwardsAvg + awayTeamMidfieldersAvg + awayTeamDefendersAvg)/3;
        
        System.out.println("\nHomeTeam Attributes: ");
        System.out.println("Forward AVG: " + homeTeamForwardsAvg);
        System.out.println("Midfielders AVG: " + homeTeamMidfieldersAvg);
        System.out.println("Defenders AVG: " + homeTeamDefendersAvg);
        System.out.println("OVERALL AVG: " + homeTeamAvg);
        
        System.out.println("\nAwayTeam Attributes: ");
        System.out.println("Forward AVG: " + awayTeamForwardsAvg);
        System.out.println("Midfielders AVG: " + awayTeamMidfieldersAvg);
        System.out.println("Defenders AVG: " + awayTeamDefendersAvg);
        System.out.println("OVERALL AVG: " + awayTeamAvg);
        
        // Keepers
        double homeKeeperSavingBonus = calculateKeeperSavingBonus(match.getHomeTeam());
        double awayKeeperSavingBonus = calculateKeeperSavingBonus(match.getAwayTeam());
        System.out.println("Hazai kapus bónusz: " + homeKeeperSavingBonus);
        System.out.println("Vendég kapus bónusz: " + awayKeeperSavingBonus);
        
        // Chances
//        int numberOfBigHomeTeamChances = calculateNumberOfBigChances(homeTeamForwardsAvg, homeTeamMidfieldersAvg, homeTeamDefendersAvg);
//        int numberOfSmallHomeTeamChances = calculateNumberOfSmallChances(homeTeamForwardsAvg, homeTeamMidfieldersAvg, homeTeamDefendersAvg);
        
        int numberOfBigHomeTeamChances = calculateNumberOfBigChances(homeTeamAvg, awayTeamAvg);
        int numberOfSmallHomeTeamChances = calculateNumberOfSmallChances(homeTeamAvg, awayTeamAvg);
        
       // int numberOfBigAwayTeamChances = calculateNumberOfBigChances(awayTeamForwardsAvg, awayTeamMidfieldersAvg, awayTeamDefendersAvg);
       // int numberOfSmallAwayTeamChances = calculateNumberOfSmallChances(awayTeamForwardsAvg, awayTeamMidfieldersAvg, awayTeamDefendersAvg);
        
        int numberOfBigAwayTeamChances = calculateNumberOfBigChances(awayTeamAvg, homeTeamAvg);
        int numberOfSmallAwayTeamChances = calculateNumberOfSmallChances(awayTeamAvg, homeTeamAvg);
        
        System.out.println("HomeTeam big chances: " + numberOfBigHomeTeamChances + ", small chances: " + numberOfSmallHomeTeamChances);
        System.out.println("AwayTeam big chances: " + numberOfBigAwayTeamChances + ", small chances: " + numberOfSmallAwayTeamChances);
        
        // Handle Chances
        int numberOfHomeTeamGoals = simulateChances(numberOfBigHomeTeamChances, match.getHomeTeam(), true, homeKeeperSavingBonus, goalscorers); 
        numberOfHomeTeamGoals += simulateChances(numberOfSmallHomeTeamChances, match.getHomeTeam(), false, homeKeeperSavingBonus, goalscorers);
        
        int numberOfAwayTeamGoals = simulateChances(numberOfBigAwayTeamChances, match.getAwayTeam(), true, awayKeeperSavingBonus, goalscorers);
        numberOfAwayTeamGoals += simulateChances(numberOfSmallAwayTeamChances, match.getAwayTeam(), false, awayKeeperSavingBonus, goalscorers);
        
        System.out.println("\nEredmény: " + match.getHomeTeam().getName() + " " + numberOfHomeTeamGoals + " - " + match.getAwayTeam().getName() + " " + numberOfAwayTeamGoals);
        System.out.println("Gólszerzõk: ");
        for (int i = 0; i < goalscorers.size(); i++) {
            System.out.println(goalscorers.get(i));
        }
        
        // pontok kezelese
        if (numberOfHomeTeamGoals > numberOfAwayTeamGoals) {
            match.getHomeTeam().addThreePoints();
        } else if (numberOfAwayTeamGoals > numberOfHomeTeamGoals) {
            match.getAwayTeam().addThreePoints();
        } else if (numberOfHomeTeamGoals == numberOfAwayTeamGoals) {
            match.getHomeTeam().addOnePoint();
            match.getAwayTeam().addOnePoint();
        }
        
        // golok kezelese
        match.setHomeTeamGoals(numberOfHomeTeamGoals);
        match.setAwayTeamGoals(numberOfAwayTeamGoals);
        
        match.getHomeTeam().setScoredGoals(numberOfHomeTeamGoals);
        match.getHomeTeam().setConcededGoals(numberOfAwayTeamGoals);
        
        match.getAwayTeam().setScoredGoals(numberOfAwayTeamGoals);
        match.getAwayTeam().setConcededGoals(numberOfHomeTeamGoals);
        
        // meccsek novelese
        match.getHomeTeam().increaseMatchedPlayed();
        match.getAwayTeam().increaseMatchedPlayed();
        
    }

    public static Team createManCity() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Ederson", "GKP", 88, 0, 0);
        
        Player def1 = new Player("Walker", "DEF", 83, 0.51, 0.69);
        Player def2 = new Player("García", "DEF", 81, 0.29, 0.38);
        Player def3 = new Player("Laporte", "DEF", 97, 0.45, 0.47);
        Player def4 = new Player("Cancelo", "DEF", 88, 0.58, 0.68);
        
        Player mid1 = new Player("Rodri", "MID", 85, 0.64, 0.76);
        Player mid2 = new Player("De Bruyne", "MID", 91, 0.82, 0.90);
        Player mid3 = new Player("Silva", "MID", 93, 0.72, 0.73);
        
        Player for1 = new Player("Foden", "FOR", 86, 0.79, 0.80);
        Player for2 = new Player("Agüero", "FOR", 90, 0.94, 0.84);
        Player for3 = new Player("Sterling", "FOR", 88, 0.85, 0.79);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester City", playerList);
    }
    /*
    public static Team createManUnited() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("De Gea", "GKP", 0, 41, 88, 0, 0);
        
        Player def1 = new Player("Wan-Bisakka", "DEF", 35, 62, 82, 0.68, 0.44);
        Player def2 = new Player("Maguire", "DEF", 15, 57, 83, 0.48, 0.52);
        Player def3 = new Player("Lindelöf", "DEF", 14, 50, 81, 0.42, 0.52);
        Player def4 = new Player("Shaw", "DEF", 33, 59, 80, 0.44, 0.54);
        
        Player mid1 = new Player("Fred", "MID", 83, 80, 82, 0.69, 0.70);
        Player mid2 = new Player("Pogba", "MID", 90, 87, 89, 0.75, 0.82);
        Player mid3 = new Player("Fernandes", "MID", 97, 86, 93, 0.77, 0.89);
        
        Player for1 = new Player("Greenwood", "FOR", 74, 62, 37, 0.74, 0.73);
        Player for2 = new Player("Martial", "FOR", 83, 56, 18, 0.82, 0.77);
        Player for3 = new Player("Rashford", "FOR", 84, 67, 40, 0.83, 0.81);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester United", playerList);
    }
    
    public static Team createLiverpool() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Allison", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Arnold", "DEF", 40, 65, 85, 0.56, 0.70);
        Player def2 = new Player("Gomez", "DEF", 13, 45, 82, 0.26, 0.26);
        Player def3 = new Player("Van Dijk", "DEF", 18, 51, 91, 0.52, 0.64);
        Player def4 = new Player("Robertson", "DEF", 37, 63, 86, 0.57, 0.65);
        
        Player mid1 = new Player("Henderson", "MID", 87, 85, 85, 69, 0.72);
        Player mid2 = new Player("Thiago", "MID", 98, 86, 96, 0.63, 0.65);
        Player mid3 = new Player("Wijnaldum", "MID", 95, 85, 90, 0.74, 0.71);
        
        Player for1 = new Player("Salah", "FOR", 90, 65, 40, 0.90, 0.84);
        Player for2 = new Player("Firmino", "FOR", 88, 58, 20, 0.84, 0.79);
        Player for3 = new Player("Mane", "FOR", 90, 68, 41, 0.90, 0.78);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Liverpool", playerList);
    }
    
    public static Team createChelsea() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Mendy", "GKP", 0, 20, 76, 0, 0);
        
        Player def1 = new Player("James", "DEF", 18, 31, 73, 0.41, 0.36);
        Player def2 = new Player("Thiago Silva", "DEF", 7, 28, 72, 0.35, 0.55);
        Player def3 = new Player("Christensen", "DEF", 7, 25, 71, 0.30, 0.36);
        Player def4 = new Player("Chillwell", "DEF", 17, 29, 72, 0.59, 0.60);
        
        Player mid1 = new Player("Jorginho", "MID", 42, 71, 71, 0.56, 0.68);
        Player mid2 = new Player("Kante", "MID", 45, 73, 45, 0.66, 0.69);
        Player mid3 = new Player("Kovacic", "MID", 48, 77, 47, 0.69, 0.64);
        
        Player for1 = new Player("Mount", "FOR", 74, 31, 19, 0.71, 0.62);
        Player for2 = new Player("Werner", "FOR", 76, 28, 9, 0.76, 0.68);
        Player for3 = new Player("Hudson-Odoi", "FOR", 80, 33, 20, 0.8, 0.64);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Chelsea", playerList);
    }
    */
    private static double getTeamForwardsAvg(Team team) {
        double teamForwardsAvgSum = 0;
        int numberOfForwards = 0;
        
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals("FOR")) {
                teamForwardsAvgSum += team.getListOfPlayers().get(i).getOverall();
                numberOfForwards++;
            }
        }
        
        return teamForwardsAvgSum/numberOfForwards;
    }
    
    private static double getTeamMidfieldersAvg(Team team) {
        double teamMidfieldersAvgSum = 0;
        int numberOfMidfielders = 0;
        
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals("MID")) {
                teamMidfieldersAvgSum += team.getListOfPlayers().get(i).getOverall();
                numberOfMidfielders++;
            }
        }
        
        return teamMidfieldersAvgSum/numberOfMidfielders;
    }
    
    private static double getTeamDefendersAvg(Team team) {
        double teamDefendersAvgSum = 0;
        int numberOfDefenders = 0;
        
        for (int i = 0; i < team.getListOfPlayers().size(); i++) {
            if (team.getListOfPlayers().get(i).getPosition().equals("DEF")) {
                teamDefendersAvgSum += team.getListOfPlayers().get(i).getOverall();
                numberOfDefenders++;
            }
        }
        
        return teamDefendersAvgSum/numberOfDefenders;
    }
    
    private static int calculateNumberOfBigChances(double forAvg, double midAvg, double defAvg) {
        
        int numberOfBigChances = 1;
        
        if (forAvg >= 90) {
            numberOfBigChances += 2;
        } else if (forAvg > 80 && forAvg < 90) {
            numberOfBigChances += 1;
        }
        
        if (midAvg >= 90) {
            numberOfBigChances += 2;
        } else if (midAvg > 80 && midAvg < 90) {
            numberOfBigChances += 1;
        }
        
        if (defAvg >= 95) {
            numberOfBigChances += 1;
        }
        
        
        
        // int numberOfBigChances = 3;
        return numberOfBigChances;
    }
    
    // dinamikusabb megoldas
    private static int calculateNumberOfBigChances(double homeTeamAvg, double awayTeamAvg) {
        
        int numberOfBigChances = 1;
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 5) {
            numberOfBigChances += 2;
        }
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 15 && Math.abs(homeTeamAvg - awayTeamAvg) > 5) {
            numberOfBigChances++;
        }
        
        if ((homeTeamAvg - awayTeamAvg) > 15) {
            numberOfBigChances += 2;
        }
        
        return numberOfBigChances;
    }
    
    private static int calculateNumberOfSmallChances(double forAvg, double midAvg, double defAvg) {
        int numberOfSmallChances = 3;
        
        if (forAvg >= 90) {
            numberOfSmallChances += 3;
        } else if (forAvg >= 80 && forAvg < 90) {
            numberOfSmallChances += 2;
        } else if (forAvg >= 70 && forAvg < 80) {
            numberOfSmallChances += 1;
        }
        
        if (midAvg >= 90) {
            numberOfSmallChances += 2;
        } else if (midAvg >= 80 && midAvg < 90) {
            numberOfSmallChances += 1;
        }
        
        if (defAvg >= 90) {
            numberOfSmallChances += 1;
        }
        
        //int numberOfSmallChances = 5;
        return numberOfSmallChances;
    }
    
    // dinamikusabb megoldas
    private static int calculateNumberOfSmallChances(double homeTeamAvg, double awayTeamAvg) {
        int numberOfSmalllChances = 2;
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 5) {
            numberOfSmalllChances += 2;
        }
        
        if (Math.abs(homeTeamAvg - awayTeamAvg) <= 15 && Math.abs(homeTeamAvg - awayTeamAvg) > 5) {
            numberOfSmalllChances += 1;
        }
        
        if ((homeTeamAvg - awayTeamAvg) > 15) {
            numberOfSmalllChances += 3;
        }
        
        return numberOfSmalllChances;
    }
    
    private static int simulateChances(int numberOfChances, Team team, boolean isBigChance, double keeperSavingBonus, List<String> goalscorers) {
        List<Player> playersToHaveChance = new ArrayList<Player>();
        int numberOfGoals = 0;
        
        for (int i = 0; i < numberOfChances; i++) {
            double valueForDecidingWhichPositionHasTheChance = Math.random();
            if (valueForDecidingWhichPositionHasTheChance <= 0.6) {
                // A striker will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals("FOR")) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.6 && valueForDecidingWhichPositionHasTheChance <= 0.9) {
                // A midfielder will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals("MID")) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            } else if (valueForDecidingWhichPositionHasTheChance > 0.9) {
                // A defender will have the chance
                for (int j = 0; j < team.getListOfPlayers().size(); j++) {
                    if (team.getListOfPlayers().get(j).getPosition().equals("DEF")) {
                        playersToHaveChance.add(team.getListOfPlayers().get(j));
                    }
                }
            }

            // Goalscoring mechanism
            if (isGoalScored(playersToHaveChance, team, isBigChance, keeperSavingBonus, goalscorers)) {
                numberOfGoals++;
            }
            
            playersToHaveChance.clear();
        }
        
        return numberOfGoals;
    }
    
    private static boolean isGoalScored(List<Player> playersToHaveChance, Team team, boolean isBigChance, double keeperSavingBonus, List<String> goalscorers) {
        int numberOfPlayersWhoHaveChance = playersToHaveChance.size();
        Random ran = new Random();
        double strikerAdHocBonus = Math.random()/10;
        double keeperAdHocBonus = Math.random()/10;
        
        int index = ran.nextInt(numberOfPlayersWhoHaveChance);
        System.out.println("\nGolhelyzetbe kerult: " + playersToHaveChance.get(index).getPlayerName());
        
        if (isBigChance) { // TODO itt annak erdekeben hogy a magasabb atlagu jatekosok elonye meglegyen, be lehetne vinni az OVERALL-t a helyzet szammal kepzett atlagba, es az vmivel igazsagosabb lenne
            if (Math.random() <=
                    playersToHaveChance.get(index).getChanceOfScoringFromBigOpportunity()
                    + (playersToHaveChance.get(index).getOverall()/1000)
                    + strikerAdHocBonus
                    - keeperAdHocBonus
                    - keeperSavingBonus) {
                System.out.println("Gólt szerzett ziccerbõl: " + playersToHaveChance.get(index).getPlayerName());
                goalscorers.add(playersToHaveChance.get(index).getPlayerName());
                playersToHaveChance.get(index).increaseGoals(); // gólok tárolása
                return true;
            } else {
                System.out.println("Ziccer kimaradt: " + playersToHaveChance.get(index).getPlayerName());
                return false;
            }            
        } else {
            if (Math.random() <=
                    playersToHaveChance.get(index).getChanceOfScoringFromSmallOpportunity()
                    + (playersToHaveChance.get(index).getOverall()/1000)
                    + strikerAdHocBonus
                    - keeperAdHocBonus
                    - (1.5 * keeperSavingBonus)) {
                System.out.println("Gólt szerzett kis helyzetbõl: " + playersToHaveChance.get(index).getPlayerName());
                goalscorers.add(playersToHaveChance.get(index).getPlayerName());
                playersToHaveChance.get(index).increaseGoals(); // gólok tárolása
                return true;
            } else {
                System.out.println("Kis helyzet kimaradt: " + playersToHaveChance.get(index).getPlayerName());
                return false;
            } 
        }
    }
    
    private static double calculateKeeperSavingBonus(Team homeTeam) {
        Player keeper = new Player();
        for (int i = 0; i < homeTeam.getListOfPlayers().size(); i++) {
            if (homeTeam.getListOfPlayers().get(i).getPosition().equals("GKP")) {
                keeper = homeTeam.getListOfPlayers().get(i);
                System.out.println("Kapus neve: " + keeper.getPlayerName());                
            }
        }
        
        /*
        if (keeper.getDefendingValue() >= 90) {
            return 0.15;
        } else if (keeper.getDefendingValue() >= 80 && keeper.getDefendingValue() < 90) {
            return 0.1;
        } else if (keeper.getDefendingValue() >= 70 && keeper.getDefendingValue() < 80) {
            return 0.05;
        } else if (keeper.getDefendingValue() < 70) {
            return 0;
        } else {
            System.out.println("HIBA!!! Kapus értéke túl nagy vagy túl alacsony!");
            return 0;
        } */
        return keeper.getOverall()/200; // egyelore jo igy sztem, 90nes kapusnal ziccer 0,45, kis helyzet 0,67 korul van
    }
    /*
    public static Team createManCity2() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Ederson2", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Walker2", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("García2", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Laporte2", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Cancelo2", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Rodri2", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("De Bruyne2", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Silva2", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Foden2", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Agüero2", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Sterling2", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester City2", playerList);
    }
    
    public static Team createManUnited2() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("De Gea2", "GKP", 0, 41, 92, 0, 0);
        
        Player def1 = new Player("Wan-Bisakka2", "DEF", 35, 62, 88, 0.1, 0.02);
        Player def2 = new Player("Maguire2", "DEF", 15, 57, 88, 0.3, 0.05);
        Player def3 = new Player("Lindelöf2", "DEF", 14, 50, 86, 0.2, 0.04);
        Player def4 = new Player("Shaw2", "DEF", 33, 59, 85, 0.2, 0.1);
        
        Player mid1 = new Player("Fred2", "MID", 83, 90, 82, 0.3, 0.2);
        Player mid2 = new Player("Pogba2", "MID", 90, 88, 89, 0.4, 0.55);
        Player mid3 = new Player("Fernandes2", "MID", 97, 88, 93, 0.5, 0.6);
        
        Player for1 = new Player("Greenwood2", "FOR", 87, 62, 37, 0.4, 0.4);
        Player for2 = new Player("Martial2", "FOR", 94, 56, 18, 0.55, 0.40);
        Player for3 = new Player("Rashford2", "FOR", 93, 67, 40, 0.65, 0.3);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester United2", playerList);
    }
    
    public static Team createLiverpool2() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Allison2", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Arnold2", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("Gomez2", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Van Dijk2", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Robertson2", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Henderson2", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("Thiago2", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Wijnaldum2", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Salah2", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Firmino2", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Mane2", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Liverpool2", playerList);
    }
    
    public static Team createChelsea2() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Mendy2", "GKP", 0, 20, 46, 0, 0);
        
        Player def1 = new Player("James2", "DEF", 18, 31, 44, 0.05, 0.01);
        Player def2 = new Player("Thiago Silva2", "DEF", 7, 28, 44, 0.15, 0.025);
        Player def3 = new Player("Christensen2", "DEF", 7, 25, 43, 0.1, 0.02);
        Player def4 = new Player("Chillwell2", "DEF", 17, 29, 43, 0.1, 0.05);
        
        Player mid1 = new Player("Jorginho2", "MID", 42, 45, 41, 0.15, 0.1);
        Player mid2 = new Player("Kante2", "MID", 45, 44, 45, 0.2, 0.27);
        Player mid3 = new Player("Kovacic2", "MID", 48, 44, 47, 0.25, 0.3);
        
        Player for1 = new Player("Mount2", "FOR", 44, 31, 19, 0.2, 0.2);
        Player for2 = new Player("Werner2", "FOR", 47, 28, 9, 0.28, 0.2);
        Player for3 = new Player("Hudson-Odoi2", "FOR", 46, 33, 20, 0.32, 0.15);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Chelsea2", playerList);
    }
    
    public static Team createManCity3() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Ederson3", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Walker3", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("García3", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Laporte3", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Cancelo3", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Rodri3", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("De Bruyne3", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Silva3", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Foden3", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Agüero3", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Sterling3", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester City3", playerList);
    }
    
    public static Team createManUnited3() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("De Gea3", "GKP", 0, 41, 92, 0, 0);
        
        Player def1 = new Player("Wan-Bisakka3", "DEF", 35, 62, 88, 0.1, 0.02);
        Player def2 = new Player("Maguire3", "DEF", 15, 57, 88, 0.3, 0.05);
        Player def3 = new Player("Lindelöf3", "DEF", 14, 50, 86, 0.2, 0.04);
        Player def4 = new Player("Shaw3", "DEF", 33, 59, 85, 0.2, 0.1);
        
        Player mid1 = new Player("Fred3", "MID", 83, 90, 82, 0.3, 0.2);
        Player mid2 = new Player("Pogba3", "MID", 90, 88, 89, 0.4, 0.55);
        Player mid3 = new Player("Fernandes3", "MID", 97, 88, 93, 0.5, 0.6);
        
        Player for1 = new Player("Greenwood3", "FOR", 87, 62, 37, 0.4, 0.4);
        Player for2 = new Player("Martial3", "FOR", 94, 56, 18, 0.55, 0.40);
        Player for3 = new Player("Rashford3", "FOR", 93, 67, 40, 0.65, 0.3);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester United3", playerList);
    }
    
    public static Team createLiverpool3() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Allison3", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Arnold3", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("Gomez3", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Van Dijk3", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Robertson3", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Henderson3", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("Thiago3", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Wijnaldum3", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Salah3", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Firmino3", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Mane3", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Liverpool3", playerList);
    }
    
    public static Team createChelsea3() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Mendy3", "GKP", 0, 20, 46, 0, 0);
        
        Player def1 = new Player("James3", "DEF", 18, 31, 44, 0.05, 0.01);
        Player def2 = new Player("Thiago Silva3", "DEF", 7, 28, 44, 0.15, 0.025);
        Player def3 = new Player("Christensen3", "DEF", 7, 25, 43, 0.1, 0.02);
        Player def4 = new Player("Chillwell3", "DEF", 17, 29, 43, 0.1, 0.05);
        
        Player mid1 = new Player("Jorginho3", "MID", 42, 45, 41, 0.15, 0.1);
        Player mid2 = new Player("Kante3", "MID", 45, 44, 45, 0.2, 0.27);
        Player mid3 = new Player("Kovacic3", "MID", 48, 44, 47, 0.25, 0.3);
        
        Player for1 = new Player("Mount3", "FOR", 44, 31, 19, 0.2, 0.2);
        Player for2 = new Player("Werner3", "FOR", 47, 28, 9, 0.28, 0.2);
        Player for3 = new Player("Hudson-Odoi3", "FOR", 46, 33, 20, 0.32, 0.15);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Chelsea3", playerList);
    }
    
    public static Team createManCity4() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Ederson4", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Walker4", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("García4", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Laporte4", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Cancelo4", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Rodri4", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("De Bruyne4", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Silva4", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Foden4", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Agüero4", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Sterling4", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester City4", playerList);
    }
    
    public static Team createManUnited4() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("De Gea4", "GKP", 0, 41, 92, 0, 0);
        
        Player def1 = new Player("Wan-Bisakka4", "DEF", 35, 62, 88, 0.1, 0.02);
        Player def2 = new Player("Maguire4", "DEF", 15, 57, 88, 0.3, 0.05);
        Player def3 = new Player("Lindelöf4", "DEF", 14, 50, 86, 0.2, 0.04);
        Player def4 = new Player("Shaw4", "DEF", 33, 59, 85, 0.2, 0.1);
        
        Player mid1 = new Player("Fred4", "MID", 83, 90, 82, 0.3, 0.2);
        Player mid2 = new Player("Pogba4", "MID", 90, 88, 89, 0.4, 0.55);
        Player mid3 = new Player("Fernandes4", "MID", 97, 88, 93, 0.5, 0.6);
        
        Player for1 = new Player("Greenwood4", "FOR", 87, 62, 37, 0.4, 0.4);
        Player for2 = new Player("Martial4", "FOR", 94, 56, 18, 0.55, 0.40);
        Player for3 = new Player("Rashford4", "FOR", 93, 67, 40, 0.65, 0.3);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester United4", playerList);
    }
    
    public static Team createLiverpool4() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Allison4", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Arnold4", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("Gomez4", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Van Dijk4", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Robertson4", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Henderson4", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("Thiago4", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Wijnaldum4", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Salah4", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Firmino4", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Mane4", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Liverpool4", playerList);
    }
    
    public static Team createChelsea4() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Mendy4", "GKP", 0, 20, 46, 0, 0);
        
        Player def1 = new Player("James4", "DEF", 18, 31, 44, 0.05, 0.01);
        Player def2 = new Player("Thiago Silva4", "DEF", 7, 28, 44, 0.15, 0.025);
        Player def3 = new Player("Christensen4", "DEF", 7, 25, 43, 0.1, 0.02);
        Player def4 = new Player("Chillwell4", "DEF", 17, 29, 43, 0.1, 0.05);
        
        Player mid1 = new Player("Jorginho4", "MID", 42, 45, 41, 0.15, 0.1);
        Player mid2 = new Player("Kante4", "MID", 45, 44, 45, 0.2, 0.27);
        Player mid3 = new Player("Kovacic4", "MID", 48, 44, 47, 0.25, 0.3);
        
        Player for1 = new Player("Mount4", "FOR", 44, 31, 19, 0.2, 0.2);
        Player for2 = new Player("Werner4", "FOR", 47, 28, 9, 0.28, 0.2);
        Player for3 = new Player("Hudson-Odoi4", "FOR", 46, 33, 20, 0.32, 0.15);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Chelsea4", playerList);
    }
    
    public static Team createManCity5() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Ederson5", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Walker5", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("García5", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Laporte5", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Cancelo5", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Rodri5", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("De Bruyne5", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Silva5", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Foden5", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Agüero5", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Sterling5", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester City5", playerList);
    }
    
    public static Team createManUnited5() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("De Gea5", "GKP", 0, 41, 92, 0, 0);
        
        Player def1 = new Player("Wan-Bisakka5", "DEF", 35, 62, 88, 0.1, 0.02);
        Player def2 = new Player("Maguire5", "DEF", 15, 57, 88, 0.3, 0.05);
        Player def3 = new Player("Lindelöf5", "DEF", 14, 50, 86, 0.2, 0.04);
        Player def4 = new Player("Shaw5", "DEF", 33, 59, 85, 0.2, 0.1);
        
        Player mid1 = new Player("Fred5", "MID", 83, 90, 82, 0.3, 0.2);
        Player mid2 = new Player("Pogba5", "MID", 90, 88, 89, 0.4, 0.55);
        Player mid3 = new Player("Fernandes5", "MID", 97, 88, 93, 0.5, 0.6);
        
        Player for1 = new Player("Greenwood5", "FOR", 87, 62, 37, 0.4, 0.4);
        Player for2 = new Player("Martial5", "FOR", 94, 56, 18, 0.55, 0.40);
        Player for3 = new Player("Rashford5", "FOR", 93, 67, 40, 0.65, 0.3);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Manchester United5", playerList);
    }
    
    public static Team createLiverpool5() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Allison5", "GKP", 0, 45, 90, 0, 0);
        
        Player def1 = new Player("Arnold5", "DEF", 40, 65, 90, 0.2, 0.05);
        Player def2 = new Player("Gomez5", "DEF", 13, 45, 84, 0.1, 0.01);
        Player def3 = new Player("Van Dijk5", "DEF", 18, 51, 93, 0.3, 0.07);
        Player def4 = new Player("Robertson5", "DEF", 37, 63, 88, 0.2, 0.04);
        
        Player mid1 = new Player("Henderson5", "MID", 87, 89, 95, 0.2, 0.25);
        Player mid2 = new Player("Thiago5", "MID", 98, 97, 96, 0.4, 0.65);
        Player mid3 = new Player("Wijnaldum5", "MID", 95, 93, 90, 0.35, 0.25);
        
        Player for1 = new Player("Salah5", "FOR", 90, 65, 40, 0.35, 0.4);
        Player for2 = new Player("Firmino5", "FOR", 97, 58, 20, 0.7, 0.5);
        Player for3 = new Player("Mane5", "FOR", 94, 68, 41, 0.4, 0.4);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Liverpool5", playerList);
    }
    
    public static Team createChelsea5() {
        List<Player> playerList = new ArrayList<Player>();
        
        Player keeper = new Player("Mendy5", "GKP", 0, 20, 46, 0, 0);
        
        Player def1 = new Player("James5", "DEF", 18, 31, 44, 0.05, 0.01);
        Player def2 = new Player("Thiago Silva5", "DEF", 7, 28, 44, 0.15, 0.025);
        Player def3 = new Player("Christensen5", "DEF", 7, 25, 43, 0.1, 0.02);
        Player def4 = new Player("Chillwell5", "DEF", 17, 29, 43, 0.1, 0.05);
        
        Player mid1 = new Player("Jorginho5", "MID", 42, 45, 41, 0.15, 0.1);
        Player mid2 = new Player("Kante5", "MID", 45, 44, 45, 0.2, 0.27);
        Player mid3 = new Player("Kovacic5", "MID", 48, 44, 47, 0.25, 0.3);
        
        Player for1 = new Player("Mount5", "FOR", 44, 31, 19, 0.2, 0.2);
        Player for2 = new Player("Werner5", "FOR", 47, 28, 9, 0.28, 0.2);
        Player for3 = new Player("Hudson-Odoi5", "FOR", 46, 33, 20, 0.32, 0.15);
        
        playerList.add(keeper);
        playerList.add(def1);
        playerList.add(def2);
        playerList.add(def3);
        playerList.add(def4);
        playerList.add(mid1);
        playerList.add(mid2);
        playerList.add(mid3);
        playerList.add(for1);
        playerList.add(for2);
        playerList.add(for3);
        
        return new Team("Chelsea5", playerList);
    }
    */
}
