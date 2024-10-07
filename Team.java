import java.util.Scanner;
import java.util.ArrayList;
public class Team {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Player> players = new ArrayList<>();
    public void addAPlayer(){
        System.out.println("Nhập vào vị trí thi đấu của cầu thủ :");
        System.out.println("1.Tiền đạo");
        System.out.println("2.Tiền vệ");
        System.out.println("3.Hậu vệ");
        System.out.println("4.Thủ môn");
        int choice = scanner.nextInt();

            System.out.println("Nhập vào số áo thi đấu: ");
            int shirtNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tên cầu thủ: ");
            String name = scanner.nextLine();
            System.out.println("Nhập vào tuổi cầu thủ: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào quốc tịch: ");
            String nationality = scanner.nextLine();
            System.out.println("Nhập vào số lần ra sân: ");
            int numberOfAppearances = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tên mức lương của cầu thủ: ");
            double baseSalary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Nhập vào giá trị chuyển nhượng: ");
            double marketValue = scanner.nextDouble();
            scanner.nextLine();
        if (choice == 1){
            System.out.println("Nhập vào số bàn thắng : ");
            int goal = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào số kiến tạo : ");
            int assists = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tỷ lệ rê bóng thành công : ");
            float dribblingSuccessRate = scanner.nextFloat();
            scanner.nextLine();

            Forward newPlayer = new Forward(
                    name,  age, nationality, shirtNumber, numberOfAppearances,
                    baseSalary, marketValue, goal, assists, dribblingSuccessRate );
            players.add(newPlayer);
            System.out.println("Thêm thành công");


        }else if (choice == 2){
            System.out.println("Nhập vào số bàn thắng : ");
            int goal = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào số kiến tạo : ");
            int assists = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tỷ lệ chuyền bóng thành công : ");
            float passingAccuracy = scanner.nextFloat();
            scanner.nextLine();

            Midfielder newPlayer = new Midfielder(
                    name,  age, nationality, shirtNumber, numberOfAppearances,
                    baseSalary, marketValue, goal, assists, passingAccuracy );
            players.add(newPlayer);
            System.out.println("Thêm thành công");
        }else if (choice == 3){
            System.out.println("Nhập vào số lần truy cản : ");
            int interceptions = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tỷ lệ tranh chấp bóng bổng thành công : ");
            float aerialAbility = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Nhập vào tỷ lệ tắc bóng thành công : ");
            float tackles = scanner.nextFloat();
            scanner.nextLine();

            Defender newPlayer = new Defender(
                    name,  age, nationality, shirtNumber, numberOfAppearances,
                    baseSalary, marketValue, interceptions, aerialAbility, tackles );
            players.add(newPlayer);
            System.out.println("Thêm thành công");
        }else if (choice == 4){
            System.out.println("Nhập vào Số lần cản phá : ");
            int saves = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tỷ lệ cản phá thành công : ");
            float shotStoppingAbility = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Nhập vào tỷ lệ bắt luân lưu thành công : ");
            float penaltySavePercentage = scanner.nextFloat();
            scanner.nextLine();

            Goalkeeper newPlayer = new Goalkeeper(
                    name,  age, nationality, shirtNumber, numberOfAppearances,
                    baseSalary, marketValue, saves, shotStoppingAbility, penaltySavePercentage );
            players.add(newPlayer);
            System.out.println("Thêm thành công");
        }
    }
    public void DisplayInformation(){
        for (Player player : players) {
            System.out.println("==============Thông tin cầu thủ==================");
            System.out.println(player.toString());
            System.out.println("=================================================");

        }
        }
    public void calculateSalary() {
        System.out.println("Nhập vào tên cầu thủ cần tính lương");
        String name = scanner.nextLine();
        double totalSalary = 0;
        boolean playerFound = false;

        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                totalSalary = player.salaryCalculation();
                playerFound = true;
                break;
            }
        }

        if (playerFound) {
            System.out.println("Tổng lương của cầu thủ " + name + " trên một tuần là : " + totalSalary);
        } else {
            System.out.println("Cầu thủ " + name + " không tồn tại trong đội.");
        }
    }

}
