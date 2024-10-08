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
            System.out.println("6.Ghi file lữu diệu");
            System.out.println("7.Đọc file dữ liệu");
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
            else if (choice == 0){
                break;
            }
        }
    }
}