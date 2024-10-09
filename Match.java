// Lớp Match - lớp cha  
public class Match {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }




    public void displayResult() {
        System.out.println("Match Result: " + homeTeam + " " + homeScore + " - " + awayScore + " " + awayTeam);
        if(homeScore > awayScore) {
            System.out.println("Thắng");
        } else if (awayScore > homeScore) {
            System.out.println("Thua");
        }else {
            System.out.println("Hoà");
        }
    }

    // Getter methods  
    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }
    //Setter methods
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setHomeScore(int homeScore) {
            checkScore(homeScore);
            this.homeScore = homeScore;

    }

    public void setAwayScore(int awayScore) {
        if(this.awayScore < 0){
            throw new IllegalArgumentException("Số bàn thắng không thể nhỏ hơn 0!");
        }
        this.awayScore = awayScore;
    }
    //Exceptions methods
    public void checkScore(int homeScore) throws InvalidException {
        if (homeScore < 0) {
            throw new InvalidScoreException("Số bàn thắng không hợp lệ");
        }
    }
}





// Lớp UclMatch - thừa kế từ Match  
class UclMatch extends Match {
    private String stadium;

    public UclMatch(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        super(homeTeam, awayTeam, homeScore, awayScore);

    }

    @Override
    public void displayResult() {
        super.displayResult();
        System.out.println("Stadium: " + stadium);
    }
}

// Lớp EplMatch - thừa kế từ Match  
class EplMatch extends Match {
    private String referee;

    public EplMatch(String homeTeam, String awayTeam, int homeScore, int awayScore, String referee) {
        super(homeTeam, awayTeam, homeScore, awayScore);
        this.referee = referee;
    }

    @Override
    public void displayResult() {
        super.displayResult();
        System.out.println("Referee: " + referee);
    }
}


