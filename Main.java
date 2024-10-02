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
            System.out.println("===========================================");
            int choice = scanner.nextInt();
            if(choice == 1){
                team.addAPlayer();

            }
            if(choice == 4){
                team.calculateSalary();
            }
            else if (choice == 0){
                break;
            }
        }
    }
}