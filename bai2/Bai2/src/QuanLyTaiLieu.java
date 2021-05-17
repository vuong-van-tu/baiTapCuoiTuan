import java.util.Scanner;

public class QuanLyTaiLieu {
    private TaiLieu[] thuVien;
    private int index;

    QuanLyTaiLieu(int size) {
        this.thuVien = new TaiLieu[size];
        this.index = 0;
    }

    public int index() {
        return index;
    }

    public void themTaiLieu(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.print("Nhập tên nhà xuất bản : ");
                String tenNhaXuatBan = sc.nextLine();
                System.out.print("Nhập mã tài liệu :");
                String maTaiLieu = sc.nextLine();
                System.out.print("Nhập số bản phát hành :");
                int soBanPhatHanh = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập tên tác giả :");
                String tenTacGia = sc.nextLine();
                System.out.print("Nhập số trang : ");
                int soTrang = sc.nextInt();
                sc.nextLine();
                this.thuVien[index] = new Sach(tenNhaXuatBan, maTaiLieu, soBanPhatHanh, tenTacGia, soTrang);
                index++;
                break;
            case 2:
                System.out.print("Nhập tên nhà xuất bản : ");
                String tenNhaXuatBan1 = sc.nextLine();
                System.out.print("Nhập mã tài liệu :");
                String maTaiLieu1 = sc.nextLine();
                System.out.print("Nhập số bản phát hành :");
                int soBanPhatHanh1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập số phát hành : ");
                int soPhatHanh = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập tháng phát hành : ");
                int thangPhatHanh = sc.nextInt();
                sc.nextLine();
                this.thuVien[index] = new TapChi(tenNhaXuatBan1, maTaiLieu1, soBanPhatHanh1, soPhatHanh, thangPhatHanh);
                index++;
                break;
            case 3:
                System.out.print("Nhập tên nhà xuất bản : ");
                String tenNhaXuatBan2 = sc.nextLine();
                System.out.print("Nhập mã tài liệu :");
                String maTaiLieu2 = sc.nextLine();
                System.out.print("Nhập số bản phát hành :");
                int soBanPhatHanh2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập ngày phát hành :");
                int ngayPhatHanh = sc.nextInt();
                sc.nextLine();
                this.thuVien[index] = new Bao(tenNhaXuatBan2, maTaiLieu2, soBanPhatHanh2, ngayPhatHanh);
                index++;
                break;
        }
    }
    public void timTaiLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=========Menu=========");
        System.out.println("1. Sách ");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Chọn loại muốn tìm : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                boolean kiemTraSach = false;
                for (int i = 0; i < index; i++) {
                    if(thuVien[i] instanceof Sach){
                        System.out.println(thuVien[i]);
                        kiemTraSach = true;
                    }
                }
                if (!kiemTraSach){
                    System.out.println("Không có tài liệu sách !!!");
                }
                break;
            case 2:
                boolean kiemTraTapChi = false;
                for (int i = 0; i < index; i++) {
                    if(thuVien[i] instanceof TapChi){
                        System.out.println(thuVien[i]);
                        kiemTraTapChi = true;
                    }
                }
                if (!kiemTraTapChi){
                    System.out.println("Không có tài liệu tạp chí !!!");
                }
                break;
            case 3:
                boolean kiemTraBao = false;
                for (int i = 0; i < index; i++) {
                    if(thuVien[i] instanceof Bao){
                        System.out.println(thuVien[i]);
                        kiemTraBao = true;
                    }
                }
                if (!kiemTraBao){
                    System.out.println("Không có tài liệu báo !!!");
                }
                break;
        }
    }
    public void hienThiTaiLieu(){
        for (int i = 0; i < index; i++) {
            System.out.println(thuVien[i]);
        }
    }
    public void xoaTaiLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã tài liệu của tài liệu muốn xóa : ");
        String maTaiLieu = sc.nextLine();
        boolean find = false;
        int indexOfSearch = -1;
        for (int i = 0; i < index; i++) {
            if (maTaiLieu.equals(thuVien[i].getMaTaiLieu())){
                find = true;
                indexOfSearch = i;
                break;
            }
        }
        if (find){
            thuVien[indexOfSearch]=null;
            for (int i = indexOfSearch; i < index; i++) {
                thuVien[i] = thuVien[i+1];
                thuVien[i+1]=null;
            }
            index-=1;
        }else {
            System.out.println("Không tìm thấy tài liệu ở trong thư viện !");
        }
        System.out.println("Thư viện sau khi xóa : ");
        hienThiTaiLieu();
    }

}
