import java.util.*;
import java.io.*;

public class Team {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Player> players = new ArrayList<>();
    public void addAPlayer() {
        try {
            System.out.println("Nhập vào mã cầu thủ :");
            String playerID = scanner.nextLine();
            System.out.println("Nhập vào tên cầu thủ: ");
            String name = scanner.nextLine();
            System.out.println("Nhập vào tuổi cầu thủ: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào quốc tịch: ");
            String nationality = scanner.nextLine();
            System.out.println("Nhập vào số áo thi đấu: ");
            int shirtNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào vị trí thi đấu:");
            String position = scanner.nextLine();
            System.out.println("Nhập vào số lần ra sân: ");
            int numberOfAppearances = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào tên mức lương của cầu thủ: ");
            double baseSalary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Nhập vào giá trị chuyển nhượng: ");
            double marketValue = scanner.nextDouble();
            scanner.nextLine();

            String pst = position.replaceAll("\\s+", "").toLowerCase();

            if ("tiendao".equalsIgnoreCase(pst)) {
                System.out.println("Nhập vào số bàn thắng : ");
                int goal = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập vào số kiến tạo : ");
                int assists = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập vào tỷ lệ rê bóng thành công : ");
                float dribblingSuccessRate = scanner.nextFloat();
                scanner.nextLine();

                Forward newPlayer = new Forward(playerID, name, age, nationality, position, shirtNumber,
                        numberOfAppearances, baseSalary, marketValue, goal, assists, dribblingSuccessRate);
                players.add(newPlayer);
                System.out.println("Thêm thành công");

            } else if ("tienve".equalsIgnoreCase(pst)) {
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
                        playerID, name, age, nationality, position, shirtNumber, numberOfAppearances,
                        baseSalary, marketValue, goal, assists, passingAccuracy);
                players.add(newPlayer);
                System.out.println("Thêm thành công");

            } else if ("hauve".equalsIgnoreCase(pst)) {
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
                        playerID, name, age, nationality, position, shirtNumber, numberOfAppearances,
                        baseSalary, marketValue, interceptions, aerialAbility, tackles);
                players.add(newPlayer);
                System.out.println("Thêm thành công");

            } else if ("thumon".equalsIgnoreCase(pst)) {
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
                        playerID, name, age, nationality, position, shirtNumber, numberOfAppearances,
                        baseSalary, marketValue, saves, shotStoppingAbility, penaltySavePercentage);
                players.add(newPlayer);
                System.out.println("Thêm thành công");
            } else {
                throw new IllegalArgumentException("Vị trí thi đấu không hợp lệ!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Định dạng dữ liệu không hợp lệ. Vui lòng nhập đúng kiểu dữ liệu!");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi trong quá trình nhập liệu. Vui lòng thử lại.");
            e.printStackTrace();
        }
    }

    public void DisplayInformation(){
        if (players.isEmpty()) {
            System.out.println("Danh sach cầu thủ rỗng!");
            return;
        }
        System.out.printf("%-20s %-15s %-20s %-15s %-15s %-20s %-25s %-20s %-20s\n"
                ,"Mã cầu thủ", "Số áo","Tên cầu thủ", "Tuổi", "Quốc tịch","Vị trí thi đấu", "Giá trị chuyển nhượng","Số lần ra sân","Lương mỗi tuần ");
        System.out.printf("%-20s %-15s %-20s %-15s %-15s %-20s %-25s %-20s %-20s\n","----------", "-----", "-----------", "----",
                "---------","---------------",  "---------------------", "-------------", "--------------");
        for (Player player : players) {
            System.out.println(player.toString());

        }
    }

    public void writeToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("player.dat", true))) {
            outputStream.writeObject(players);
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
            System.out.println("Khong the mo file de ghi!");
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        players.clear(); // Xóa danh sách hiện tại trước khi đọc từ file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("player.dat"))) {
            while (true) {
                try {
                    @SuppressWarnings("unchecked")
                    List<Player> sv = (List<Player>) inputStream.readObject();
                    players.addAll(sv);
                } catch (EOFException e) {
                    break; // Kết thúc tệp
                }
            }
            System.out.println("Doc file thanh cong!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Khong the mo file de doc!");
            e.printStackTrace();
        }
    }

    public void RemovePlayer() {
        try {
            System.out.println("Nhập vào mã cầu thủ cần bán: ");
            String playerID = scanner.nextLine();
            boolean playerFound = false;
            Player playerToRemove = null;
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(playerID)) {
                    playerToRemove = player; // Lưu lại cầu thủ cần xóa
                    playerFound = true;
                    break;
                }
            }
            if (playerFound && playerToRemove != null) {
                players.remove(playerToRemove);
                System.out.println("Cầu thủ " + playerID + " đã được bán.");
            } else {
                System.out.println("Cầu thủ " + playerID + " không tồn tại trong đội.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Dữ liệu nhập vào không hợp lệ. Vui lòng thử lại.");
            scanner.nextLine();  // Xóa dòng nhập sai

        } catch (ConcurrentModificationException e) {
            System.out.println("Lỗi: Có sự thay đổi đồng thời khi xóa cầu thủ. Vui lòng thử lại.");

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi. Vui lòng thử lại.");
            e.printStackTrace();
        }
    }


    public void calculateSalary() {
        try {
            System.out.println("Nhập vào mã cầu thủ cần tính lương: ");
            String playerID = scanner.nextLine();
            double totalSalary = 0;
            boolean playerFound = false;
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(playerID)) {
                    // Tính toán lương dựa trên phương thức salaryCalculation của cầu thủ
                    totalSalary = player.salaryCalculation();
                    playerFound = true;
                    break;
                }
            }
            if (playerFound) {
                System.out.println("Tổng lương của cầu thủ " + playerID + " trên một tuần là: " + totalSalary);
            } else {
                System.out.println("Cầu thủ " + playerID + " không tồn tại trong đội.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Dữ liệu nhập vào không hợp lệ. Vui lòng thử lại.");
            scanner.nextLine();

        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi không xác định. Vui lòng thử lại.");
            e.printStackTrace();
        }
    }


    public void SeachPlayer() {
        try {
            System.out.println("Nhập vào mã cầu thủ cần tìm:");
            String name = scanner.nextLine();  // Đầu vào có thể gây ra lỗi nếu scanner gặp vấn đề
            double totalSalary = 0;
            boolean playerFound = false;
            if (players.isEmpty()) {
                throw new Exception("Danh sách cầu thủ đang trống.");
            }
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(name)) {
                    System.out.println(player.toString());
                    System.out.println("==========Thông số===============");
                    System.out.println(player.parameter());
                    System.out.println("=================================");

                    playerFound = true;
                    break;
                }
            }
            if (playerFound) {
                System.out.println(name + " đã được tìm thấy.");
            } else {
                System.out.println("Cầu thủ " + name + " không tồn tại trong đội.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Đầu vào không hợp lệ. Vui lòng nhập mã cầu thủ đúng định dạng.");
            scanner.nextLine();
        } catch (NullPointerException e) {
            System.out.println("Lỗi: Không thể tìm kiếm cầu thủ vì có dữ liệu bị thiếu.");
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }




}
