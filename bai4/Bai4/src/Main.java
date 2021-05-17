import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhuPho khuPho = new KhuPho();
        Scanner sc = new Scanner(System.in);
        while (true){
            display();
            System.out.println("Nhập lựa chọn ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    khuPho.themHoGiaDinh();
                    break;
                case 2:
                    khuPho.hienThi();
                    break;
            }
        }

    }
    public static void display(){
        System.out.println("Menu");
        System.out.println("1. Thêm hộ dân mới");
        System.out.println("2. Hiện thị khu phố");
        System.out.println("0. Thoat");
    }
}
