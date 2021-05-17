import java.util.Arrays;
import java.util.Scanner;

public class HoGiaDinh{
    private Nguoi[] nguois;
    private String diaChi;
    private int thanhVien=0;
    public HoGiaDinh(Nguoi[] nguois,String diaChi) {
        this.nguois = nguois;
        this.diaChi = diaChi;
    }
    public HoGiaDinh(){}

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Nguoi[] getNguois() {
        return nguois;
    }

    public void setNguois(Nguoi[] nguois) {
        this.nguois = nguois;
    }
    public void themThanhVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên : ");
        String ten = sc.nextLine();
        System.out.println("Nhập tuổi : ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nghề nghiệp : ");
        String ngheNghiep = sc.nextLine();
        System.out.println("Nhập số CMND : ");
        int soCMND = sc.nextInt();
        sc.nextLine();
        this.nguois[thanhVien] = new Nguoi(ten,tuoi,ngheNghiep,soCMND);
    }

    @Override
    public String toString() {
        return "Hộ gia đình : {" +
                "  Số thành viên trong gia đình : " + nguois.length +
                ", Địa chỉ : " + diaChi +
                '}';
    }
}
