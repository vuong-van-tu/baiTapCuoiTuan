import java.util.Arrays;
import java.util.Scanner;

public class KhuPho {
    private HoGiaDinh[] hoGiaDinhs;
    int index;

    public KhuPho() {
        this.hoGiaDinhs = new HoGiaDinh[100];
        this.index = 0;
    }

    public void themHoGiaDinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thành viên trong gia đình :");
        int soThanhVien = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String diaChi = sc.nextLine();
        hoGiaDinhs[index] = new HoGiaDinh(soThanhVien,diaChi);
        hoGiaDinhs[index].setThanhVien();
        index++;

    }
    public void hienThi(){
        for (int i = 0; i < index; i++) {
            System.out.println(hoGiaDinhs[i]);
            hoGiaDinhs[i].getThanhVien();
            System.out.println("==================");
        }
    }


}

