package teams;

import java.util.List;

public class Team {

    private int points = 0;
    private String name;
    private List<Player> listOfPlayers;
    private int scoredGoals;
    private int concededGoals;
    private int matchesPlayed;
    
    public Team(String name, List<Player> listOfPlayers) {
        this.points = 0;
        this.name = name;
        this.listOfPlayers = listOfPlayers;
        this.scoredGoals = 0;
        this.concededGoals = 0;
        this.matchesPlayed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    public void setListOfPlayers(List<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public void addThreePoints() {
        this.points += 3;
    }
    
    public void addOnePoint() {
        this.points += 1;
    }
    
    public int getScoredGoals() {
        return this.scoredGoals;
    }
    
    public int getConcededGoals() {
        return this.concededGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals += scoredGoals;
    }

    public void setConcededGoals(int concededGoals) {
        this.concededGoals += concededGoals;
    }
    
    /* TOOD ezek akkor kellenek majd, ha a GoalDto letrejon minden golnal, es azt setelem a csapat goljainak listjaba, egyelõre csak a szamot irom be
    public void increaseScoredGoals() {
        this.scoredGoals += 1;
    }
    
    public void increaseConcededGoals() {
        this.concededGoals += 1;
    }*/ 
    
    public int getMatchesPlayed() {
        return this.matchesPlayed;
    }
    
    public void increaseMatchedPlayed() {
        this.matchesPlayed++;
    }
    
    
}
