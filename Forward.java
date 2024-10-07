public class Forward  extends Player  {
    private int goal ;
    private int assists ;
    private float dribblingSuccessRate ;


    public Forward(
            String name, int age, String nationality, int shirtNumber, int numberOfAppearances,
            double baseSalary, double marketValue, int goal, int assists, float dribblingSuccessRate
    ) {
        super(name, age, nationality, shirtNumber, numberOfAppearances, baseSalary, marketValue);
        this.goal = goal ;
        this.assists = assists ;
        this.dribblingSuccessRate = dribblingSuccessRate;

    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public float getDribblingSuccessRate() {
        return dribblingSuccessRate;
    }

    public void setDribblingSuccessRate(float dribblingSuccessRate) {
        this.dribblingSuccessRate = dribblingSuccessRate;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    @Override
    public double salaryCalculation() {
        Config config = new Config();
        if (goal > 15){
            return getBaseSalary() + config.performanceBonus +config.appearancesBonus * getNumberOfAppearances() +config.housingAllowance  ;
        }
        else {
            return getBaseSalary() + config.appearancesBonus *getNumberOfAppearances() + config.housingAllowance;
        }
    }

    @Override
    public boolean parameter() {
        System.out.println("Forward Parameters:");
        System.out.println("Goals: " + goal);
        System.out.println("Assists: " + assists);
        System.out.println("Dribbling Success Rate: " + dribblingSuccessRate + "%");
        return false;
    }
}
