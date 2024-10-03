
public abstract class Match {
    //Attributes
    private int matchId;
    private String opponentName;
    private String dateOfMatch;
    private int numberOfGoals;
    private int goalsConceded;
    private String result;
    Player [] players;

    //Constructor
    public Match(int matchId, String opponentName, String dateOfMatch, int numberOfGoals, int goalsConceded, String result) {
        this.matchId = matchId;
        this.opponentName = opponentName;
        this.dateOfMatch = dateOfMatch;
        this.numberOfGoals = numberOfGoals;
        this.goalsConceded = goalsConceded;
        this.result = result;

    }
    //Getter và Setter

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }

    public String getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(String dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
