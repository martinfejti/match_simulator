package teams;

public class Player {

    private String playerName;
    
    private String position;
    
    private double overall;
    
    private double chanceOfScoringFromBigOpportunity;
    private double chanceOfScoringFromSmallOpportunity;
    
    private int goals;
    
    public Player(String playerName, String position, double overall, double chanceOfScoringFromBigOpportunity,
            double chanceOfScoringFromSmallOpportunity) {
        super();
        this.playerName = playerName;
        this.position = position;
        this.overall = overall;
        this.chanceOfScoringFromBigOpportunity = chanceOfScoringFromBigOpportunity;
        this.chanceOfScoringFromSmallOpportunity = chanceOfScoringFromSmallOpportunity;
        this.goals = 0;
    }
    
    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getOverall() {
        return overall;
    }

    public void setOverall(double overall) {
        this.overall = overall;
    }

    public double getChanceOfScoringFromBigOpportunity() {
        return chanceOfScoringFromBigOpportunity;
    }

    public void setChanceOfScoringFromBigOpportunity(double chanceOfScoringFromBigOpportunity) {
        this.chanceOfScoringFromBigOpportunity = chanceOfScoringFromBigOpportunity;
    }

    public double getChanceOfScoringFromSmallOpportunity() {
        return chanceOfScoringFromSmallOpportunity;
    }

    public void setChanceOfScoringFromSmallOpportunity(double chanceOfScoringFromSmallOpportunity) {
        this.chanceOfScoringFromSmallOpportunity = chanceOfScoringFromSmallOpportunity;
    }

    public int getGoals() {
        return goals;
    }
    
    public void increaseGoals() {
        this.goals += 1;
    }
}


