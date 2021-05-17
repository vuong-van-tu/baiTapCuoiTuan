import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách phần tử~~");
        int size = sc.nextInt();
        QuanLyCanBo ql= new QuanLyCanBo(size);
        while (true){
            hienThi();
            System.out.println("Nhập lựa chọn:");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("=====Danh sách cán bộ========");
                    System.out.println("1. Thêm công nhân ");
                    System.out.println("2. Thêm kỹ sư");
                    System.out.println("3. Thêm nhân viên");
                    int phanTu = sc.nextInt();
                    ql.themCanBo(phanTu);
                    break;
                case 2:
                    ql.timCanBo();
                    break;
                case 3:
                    ql.hienThiCanBo();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
    public static void hienThi(){
        System.out.println("==================Menu===============");
        System.out.println("1. Thêm mới cán bộ");
        System.out.println("2. Tìm kiếm theo tên");
        System.out.println("3. Hiển thị thông tin danh sách cán bộ");
        System.out.println("0. Thoát");
    }

}
