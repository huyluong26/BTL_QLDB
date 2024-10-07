abstract public class Player {
    private String name ;
    private int age ;
    private String nationality;
    private int shirtNumber;
    private int numberOfAppearances;
    private double baseSalary ;
    private double marketValue ;

    public Player(String name, int age, String nationality, int shirtNumber, int numberOfAppearances, double baseSalary, double marketValue) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.shirtNumber = shirtNumber;
        this.numberOfAppearances = numberOfAppearances;
        this.baseSalary = baseSalary;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getNumberOfAppearances() {
        return numberOfAppearances;
    }

    public void setNumberOfAppearances(int numberOfAppearances) {
        this.numberOfAppearances = numberOfAppearances;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    abstract public double salaryCalculation() ;


    abstract public void parameter() ;

    @Override
    public String toString() {
        return "Player{" +
                "  shirtNumber=" + shirtNumber +
                "  name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", numberOfAppearances=" + numberOfAppearances +
                ", baseSalary=" + baseSalary +
                ", marketValue=" + marketValue +
                '}';
    }
}
