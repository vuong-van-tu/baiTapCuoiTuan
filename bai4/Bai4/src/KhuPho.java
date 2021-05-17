import java.util.Scanner;

public class KhuPho {
    private HoGiaDinh[] hoGiaDinhs ;
    private int soHoGiaDinh=0;
    public KhuPho(HoGiaDinh[] hoGiaDinhs) {
        this.hoGiaDinhs = hoGiaDinhs;
    }
    public KhuPho(){}
    public HoGiaDinh[] getHoGiaDinhs() {
        return hoGiaDinhs;
    }

    public void setHoGiaDinhs(HoGiaDinh[] hoGiaDinhs) {
        this.hoGiaDinhs = hoGiaDinhs;
    }
    public void themHoGiaDinh(Nguoi[] nguois){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập địa chỉ : ");
        String diaChi = sc.nextLine();
        this.hoGiaDinhs[soHoGiaDinh] = new HoGiaDinh(nguois,diaChi);
    }
}
