import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thí sinh cho danh sách : ");
        int size = sc.nextInt();
        TuyenSinh ts = new TuyenSinh(size);
        while (true){
            hienThi();
            System.out.println("Nhập lựa chọn :");
            int luaChon = sc.nextInt();
            switch (luaChon){
                case 1 :
                    ts.themThiSinh();
                    break;
                case 2:
                    ts.hienThi();
                    break;
                case 3:
                    ts.timKiemThiSinh();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void hienThi(){
        System.out.println("=========Menu==========");
        System.out.println("1. Thêm thí sinh");
        System.out.println("2. Hiển thị thông tin và khối thi");
        System.out.println("3. Tìm kiếm theo số báo danh");
        System.out.println("0. Thoát");
    }
}
