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
        if (choice == 1){
            System.out.println("Nhập vào tên cầu thủ: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Nhập vào tuổi cầu thủ: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào quốc tịch: ");
            String nationality = scanner.nextLine();
            System.out.println("Nhập vào số áo thi đấu: ");
            int shirtNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào số lần ra sân: ");
            int numberOfAppearances = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tên mức lương của cầu thủ: ");
            double baseSalary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Nhập vào giá trị chuyển nhượng: ");
            double marketValue = scanner.nextDouble();
            scanner.nextLine();
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


        }
    }
    public void calculateSalary() {
        double totalSalary = 0;
        for (Player player : players) { // Duyệt qua tất cả cầu thủ
            totalSalary += player.salaryCalculation(); // Tính tổng lương cho tất cả cầu thủ
        }
        System.out.println("Tổng lương của cầu thủ trên một tuần là : " + totalSalary);
    }
}
