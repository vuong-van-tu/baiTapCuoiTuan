import java.util.Arrays;
import java.util.Scanner;

public class HoGiaDinh{
    private Nguoi[] nguois;
    private String diaChi;
    private int soThanhVien;
    public HoGiaDinh(int soThanhVien,String diaChi) {
        this.soThanhVien = soThanhVien;
        this.diaChi = diaChi;
        this.nguois = new Nguoi[soThanhVien];
    }
    public HoGiaDinh(){}

    public void getThanhVien(){
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println(nguois[i]);
        }
    }
    public String getDiaChi() {
        return diaChi;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setThanhVien(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Thành viên thứ "+(i+1));
            System.out.println("Nhập Tên : ");
            String ten = sc.nextLine();
            System.out.println("Nhập tuổi : ");
            int tuoi = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập nghề nghiệp : ");
            String ngheNghiep = sc.nextLine();
            System.out.println("Nhập số CMND : ");
            String soCMND = sc.nextLine();

            this.nguois[i] = new Nguoi(ten,tuoi,ngheNghiep,soCMND);
        }
    }


    @Override
    public String toString() {
        return "Hộ gia đình : {" +
                "  Số thành viên trong gia đình : " + nguois.length +
                ", Địa chỉ : " + diaChi +
                '}';
    }
}
