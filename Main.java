import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();
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
            System.out.println("9.Thêm trận đấu ");
            System.out.println("10.Hien thi thông tin trận đấu ");
            System.out.println("11.Xóa trận đấu");
            System.out.println("12.Tìm trận");
            System.out.println("13.Đọc file dữ liệu trận đấu");
            System.out.println("14.Đọc file dữ liệu trận đấu ");

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
            if(choice == 9){
                team.addAMatch();
            }
            if(choice == 10){
                team.DisplayMatchesInformation();
            }
            if(choice == 11){
                team.RemoveMatch();
            }
            if(choice == 12){
                team.SeachMatch();
            }
            if(choice == 13){
                team.writeMatchToFile();
            }
            if(choice == 14){
                team.readMatchFromFile();
            }

            else if (choice == 0){
                break;
            }
        }
    }
}