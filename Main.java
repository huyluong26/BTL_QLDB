import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeamManagement team = new TeamManagement();
        while (true) {
            System.out.println("=====================Menu==================");
            System.out.println("1.Thêm cầu thủ");
            System.out.println("2.Bán cầu thủ");
            System.out.println("3.Hiển thị thông tin cầu thủ");
            System.out.println("4.Tính lương cầu thủ");
            System.out.println("5.Tìm kiếm cầu thủ");
            System.out.println("6.Ghi file lữu diệu");
            System.out.println("7.Đọc file dữ liệu");
            System.out.println("8.Thêm thông tin trận đấu");
            System.out.println("9.Hiển thị thông tin trận đấu");
            System.out.println("10.Ghi thông tin trận đấu vào file lữu diệu");
            System.out.println("11.Đọc thông tin trận đấu ở file dữ liệu");
            System.out.println("===========================================");
            int choice = scanner.nextInt();
            if(choice == 1){
                team.addAPlayer();
            }
            if(choice == 2){
                team.RemovePlayer();
            }
            if(choice == 3){
                team.DisplayInformation();
            }
            if(choice == 4){
                team.calculateSalary();
            }
            if(choice == 5 ){
                team.SeachPlayer();
            }
            if(choice == 6){
                team.writeToFile();
            }
            if(choice == 7){
                team.readFromFile();
            }
            if(choice == 8){
                team.addAMatch();
            }
            if(choice == 9){
                team.DisplayMatchesInformation();
            }
            if(choice == 10){
                team.writeMatchToFile();
            }
            if(choice == 11){
                team.readMatchFromFile();
            }
            else if (choice == 0){
                break;
            }
        }
    }
}