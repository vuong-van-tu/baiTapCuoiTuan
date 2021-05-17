import java.util.Scanner;

public class TuyenSinh {
    Scanner sc = new Scanner(System.in);
    private SinhVien [] thiSinh ;
    private int index;

    public TuyenSinh(int size) {
        this.thiSinh = new SinhVien[size];
        this.index = 0 ;
    }
    public TuyenSinh(){}

    public int getIndex() {
        return index;
    }

    public void themThiSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Menu============");
        System.out.println("1. Khối A");
        System.out.println("2. Khối B");
        System.out.println("3. Khối C");
        System.out.print("Nhập lựa chọn :");
        int luaChon = sc.nextInt();
        sc.nextLine();
        switch (luaChon){
            case 1:
                System.out.print("Nhập số báo danh : ");
                int soBaoDanh = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập tên : ");
                String ten = sc.nextLine();
                System.out.print("Nhập địa chỉ : ");
                String diaChi = sc.nextLine();
                System.out.print("Nhập mức ưu tiên : ");
                float mucUuTien = sc.nextFloat();
                this.thiSinh[index]  = new SinhVienA(soBaoDanh,ten,diaChi,mucUuTien);
                index++;
                break;
            case 2:
                System.out.print("Nhập số báo danh : ");
                int soBaoDanh1 = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập tên : ");
                String ten1 = sc.nextLine();
                System.out.print("Nhập địa chỉ : ");
                String diaChi1 = sc.nextLine();
                System.out.print("Nhập mức ưu tiên : ");
                float mucUuTien1 = sc.nextFloat();
                this.thiSinh[index]=new SinhVienB(soBaoDanh1,ten1,diaChi1,mucUuTien1);
                index++;
                break;
            case 3:
                System.out.print("Nhập số báo danh : ");
                int soBaoDanh2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập tên : ");
                String ten2 = sc.nextLine();
                System.out.print("Nhập địa chỉ : ");
                String diaChi2 = sc.nextLine();
                System.out.print("Nhập mức ưu tiên : ");
                float mucUuTien2 = sc.nextFloat();
                this.thiSinh[index] = new SinhVienC(soBaoDanh2,ten2,diaChi2,mucUuTien2);
                index++;
                break;
        }



    }
    public void hienThi(){
        for (int i = 0; i < index; i++) {
            System.out.println(thiSinh[i]);
        }
    }
    public void timKiemThiSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số báo danh của thí sinh cần tìm: ");
        int soBaoDanh = sc.nextInt();
        boolean find = false;
        int indexOf = -1;
        for (int i = 0; i < index; i++) {
            if (soBaoDanh==thiSinh[i].getSoBaoDanh()){
                find = true;
                indexOf = i ;
            }
        }
        if (find){
            System.out.println("Tìm thấy : "+thiSinh[indexOf]);
        }else {
            System.out.println("Không tìm thấy thí sinh!");
        }
    }
}
