import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();
        while (true) {
            System.out.println("=====================Quản lý đội bóng ==================");
            System.out.println("1.Quản lý cầu thủ ");
            System.out.println("2.Quản lý trận đấu ");
            System.out.println("3.Thông kê ");
            System.out.println("0.Thoát");
            System.out.println("========================================================");
            int choices = scanner.nextInt();
            if (choices == 1) {
                while (true) {
                    System.out.println("=====================Menu==================");
                    System.out.println("1.Thêm cầu thủ");
                    System.out.println("2.Bán cầu thủ");
                    System.out.println("3.Hiển thị thông tin cầu thủ");
                    System.out.println("4.Tính lương cầu thủ");
                    System.out.println("5.Tìm kiếm cầu thủ");
                    System.out.println("6.Sắp xếp theo lương");
                    System.out.println("7.Ghi file lữu diệu");
                    System.out.println("8.Đọc file dữ liệu");
                    System.out.println("0.Thoát");
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
                    if(choice == 7){
                        team.writeToFile();
                    }
                    if(choice == 6){
                        team.sortPlayersBySalary();
                    }
                    if(choice == 8){
                        team.readFromFile();
                    }
                    else if (choice == 0){
                        break;
                    }
                }
            }
            if(choices == 0){
                break;
            }

        }
    }
}