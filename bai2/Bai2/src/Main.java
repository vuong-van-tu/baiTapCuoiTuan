import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng danh sách : ");
        int size = sc.nextInt();
        QuanLyTaiLieu ql = new QuanLyTaiLieu(size);
        while (true){
            System.out.println("===========Menu==========");
            System.out.println("1. Thêm tài liệu ");
            System.out.println("2. Xóa tài liệu ");
            System.out.println("3. Hiển thị tài liệu ");
            System.out.println("4. Tìm kiếm tài liệu(theo loại) ");
            System.out.println("0. Thoát ");
            System.out.print("Lựa chọn :");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("=======Menu=======");
                    System.out.println("Danh sách tài liệu");
                    System.out.println("1. Sách");
                    System.out.println("2. Tạp chí");
                    System.out.println("3. Báo");
                    System.out.print("Lựa chọn :");
                    int option = sc.nextInt();
                    ql.themTaiLieu(option);
                    break;
                case 2:
                    ql.xoaTaiLieu();
                    break;
                case 3:
                    ql.hienThiTaiLieu();
                    break;
                case 4:
                    ql.timTaiLieu();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}
