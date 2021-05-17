import java.util.Scanner;

public class QuanLyCanBo {
    Scanner sc = new Scanner(System.in);
    private CanBo[] danhSach;
    private int index;

    public QuanLyCanBo(int size) {
        this.danhSach = new CanBo[size];
        this.index = 0;
    }
    public QuanLyCanBo(){
    }
    public int getIndex(){
        return index;
    }
    public void timCanBo(){
        System.out.println("Nhập tên cán bộ muốn tìm :");
        String name = sc.nextLine();
        boolean find = false;
        int indexOf = -1;
        for (int i = 0; i < index; i++) {
            if (name.equals(danhSach[i].getHoTen())){
                find = true;
                indexOf = i;
                break;
            }
        }
        if (find){
            System.out.println("Tìm thấy "+danhSach[indexOf]);
        }else {
            System.out.println("Không tìm thấy!");
        }
    }
    public void themCanBo(int phanTu) {
        switch (phanTu){
            case 1:
                System.out.print("Nhập tên : ");
                String ten = sc.nextLine();
                System.out.print("Nhập tuổi : ");
                int tuoi = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập giới tính:");
                String gioiTinh = sc.nextLine();
                System.out.print("Nhập địa chỉ : ");
                String diaChi = sc.nextLine();
                System.out.print("Nhập cấp độ: ");
                int capDo = sc.nextInt();
                sc.nextLine();
                this.danhSach[index] = new CongNhan(ten,tuoi,gioiTinh,diaChi,capDo);
                index++;
                break;
            case 2:
                System.out.print("Nhập tên : ");
                String ten1 = sc.nextLine();
                System.out.print("Nhập tuổi : ");
                int tuoi1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập giới tính : ");
                String gioiTinh1 = sc.nextLine();
                System.out.print("Nhập địa chỉ : ");
                String diaChi1 = sc.nextLine();
                System.out.print("Nhập ngành đào tạo : ");
                String nganhDaoTao = sc.nextLine();
                this.danhSach[index]= new KySu(ten1,tuoi1,gioiTinh1,diaChi1,nganhDaoTao);
                index++;
                break;
            case 3:
                System.out.print("Nhập tên : ");
                String ten2 = sc.nextLine();
                System.out.print("Nhập tuổi : ");
                int tuoi2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập giới tính : ");
                String gioiTinh2 = sc.nextLine();
                System.out.print("Nhập địa chỉ : ");
                String diaChi2 = sc.nextLine();
                System.out.print("Nhập công việc : ");
                String congViec = sc.nextLine();
                this.danhSach[index] = new NhanVien(ten2,tuoi2,gioiTinh2,diaChi2,congViec);
                index++;
                break;
        }
    }
    public void hienThiCanBo(){
        for (int i = 0; i < index; i++) {
            System.out.println(danhSach[i]);
        }
    }
}

