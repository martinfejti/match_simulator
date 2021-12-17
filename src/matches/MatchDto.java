package matches;

import java.util.ArrayList;
import java.util.List;

import teams.Team;

public class MatchDto {

    private int id;
    private int matchweekNumber;
    private int serialNumber; // fordulon belul hanyadik meccs, for now ignoralom
    private Team homeTeam; // maybee team dto here
    private Team awayTeam; // maybee team dto here
    private int homeTeamGoals; // goal dto // kesobb goal dto, meg kell irni, masreszt utanajarni, hogy a korkoros hivatkozas beanek kozt mekkora gond
    private int awayTeamGoals; // goal dto
    private int homeTeamBigChances;
    private int awayTeamBigChances;
    private int homeTeamSmallChances;
    private int awayTeamSmallChances;
    
    public MatchDto(int matchweekNumber, Team homeTeam, Team awayTeam) {
        super();
        this.matchweekNumber = matchweekNumber;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamGoals = 0;
        this.awayTeamGoals = 0;
        this.homeTeamBigChances = 0;
        this.awayTeamBigChances = 0;
        this.homeTeamSmallChances = 0;
        this.awayTeamSmallChances = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatchweekNumber() {
        return matchweekNumber;
    }

    public void setMatchweekNumber(int matchweekNumber) {
        this.matchweekNumber = matchweekNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(int homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(int awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public int getHomeTeamBigChances() {
        return homeTeamBigChances;
    }

    public void setHomeTeamBigChances(int homeTeamBigChances) {
        this.homeTeamBigChances = homeTeamBigChances;
    }

    public int getAwayTeamBigChances() {
        return awayTeamBigChances;
    }

    public void setAwayTeamBigChances(int awayTeamBigChances) {
        this.awayTeamBigChances = awayTeamBigChances;
    }

    public int getHomeTeamSmallChances() {
        return homeTeamSmallChances;
    }

    public void setHomeTeamSmallChances(int homeTeamSmallChances) {
        this.homeTeamSmallChances = homeTeamSmallChances;
    }

    public int getAwayTeamSmallChances() {
        return awayTeamSmallChances;
    }

    public void setAwayTeamSmallChances(int awayTeamSmallChances) {
        this.awayTeamSmallChances = awayTeamSmallChances;
    }
    
}
