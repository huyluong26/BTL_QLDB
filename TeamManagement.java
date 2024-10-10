import java.util.*;
import java.io.*;

public class TeamManagement {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Match> matches = new ArrayList<>();
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
    public void addAMatch() {
        try {
            System.out.println("Nhập vào ngày diễn ra trận đấu :");
            String dateOfMatch = scanner.nextLine();
            System.out.println("Nhập vào tên đội nhà: ");
            String homeTeam = scanner.nextLine();
            System.out.println("Nhập vào tên đội đối thủ: ");
            String awayTeam = scanner.nextLine();
            System.out.println("Nhập vào số bàn thắng của" + homeTeam + ":");
            int homeScore = scanner.nextInt();
            System.out.println("Nhập vào số bàn thắng của" + awayTeam + ":");
            int awayScore = scanner.nextInt();
            String nameGK, nameLB, nameLCB, nameRCB, nameRB, nameLCM, nameRCM, nameCM, nameST, nameRW, nameLW;
            DisplayInformation();
            System.out.println("====== Nhập vào đội hình ra sân ======");
            System.out.println("Nhập vào mã thủ môn:");
            String playerID = scanner.nextLine();
            scanner.nextLine();
            String ID = playerID.replaceAll("\\s+", "").toLowerCase();
                for (Player player : players) {
                    if (player.getPlayerID().equalsIgnoreCase(ID)) {
                        nameGK = player.getName();
                    } else {
                        throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                    }
                }
            System.out.println("Nhập vào mã hậu vệ cánh trái:");
            String playerID1 = scanner.nextLine();
            scanner.nextLine();
            String ID1 = playerID1.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID1)) {
                    nameLB= player.getName();
                }
                else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã hậu vệ cánh phải:");
            String playerID2 = scanner.nextLine();
            scanner.nextLine();
            String ID2 = playerID2.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID2)) {
                    nameRB= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã trung vệ trái:");
            String playerID3 = scanner.nextLine();
            scanner.nextLine();
            String ID3 = playerID3.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID3)) {
                    nameLCB= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã trung vệ phải:");
            String playerID4 = scanner.nextLine();
            scanner.nextLine();
            String ID4 = playerID4.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID4)) {
                    nameRCB= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã tiền vệ trái:");
            String playerID5 = scanner.nextLine();
            scanner.nextLine();
            String ID5 = playerID5.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID5)) {
                    nameLCM= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã tiền vệ phải:");
            String playerID6 = scanner.nextLine();
            scanner.nextLine();
            String ID6 = playerID6.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID6)) {
                    nameRCM= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã tiền vệ trung tâm:");
            String playerID7 = scanner.nextLine();
            scanner.nextLine();
            String ID7 = playerID7.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID7)) {
                    nameCM= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã tiền đạo cánh phải:");
            String playerID8 = scanner.nextLine();
            scanner.nextLine();
            String ID8 = playerID8.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID8)) {
                    nameRW= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã tiền đạo cánh trái:");
            String playerID9 = scanner.nextLine();
            scanner.nextLine();
            String ID9 = playerID9.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID9)) {
                    nameLW= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }
            System.out.println("Nhập vào mã tiền đạo cắm:");
            String playerID10 = scanner.nextLine();
            scanner.nextLine();
            String ID10 = playerID10.replaceAll("\\s+", "").toLowerCase();
            for (Player player : players) {
                if (player.getPlayerID().equalsIgnoreCase(ID10)) {
                    nameST= player.getName();
                }else {
                    throw new IllegalArgumentException("Mã cầu thủ không hợp lệ");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void writeMatchToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("matches.dat", true))) {
            outputStream.writeObject(matches);
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
            System.out.println("Khong the mo file de ghi!");
            e.printStackTrace();
        }
    }

    public void readMatchFromFile() {
        matches.clear(); // Xóa danh sách hiện tại trước khi đọc từ file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("matches.dat"))) {
            while (true) {
                try {
                    @SuppressWarnings("unchecked")
                    List<Match> sv = (List<Match>) inputStream.readObject();
                    matches.addAll(sv);
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

    public void DisplayMatchesInformation(){
        if (matches.isEmpty()) {
            System.out.println("Danh sách thông tin trận đấu rỗng!");
            return;
        }
        for (Match match : matches) {
            System.out.println(match.toString());

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
