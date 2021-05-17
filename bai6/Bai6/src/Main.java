public class Main {
    public static void main(String[] args) {
        Lop lop = new Lop();
        HocSinh hocSinh1 = new HocSinh("abc",20,"hn");
        lop.themHocSinh(hocSinh1);
        HocSinh hocSinh2 = new HocSinh("abc",30,"hn");
        lop.themHocSinh(hocSinh2);
        HocSinh hocSinh3 = new HocSinh("abcd",20,"htay");
        lop.themHocSinh(hocSinh3);
        lop.hienThiHocSinhTheoTuoi(20);
        System.out.println("=================");
        System.out.println(lop.soLuongHocSinhTheoTuoiVaQueQuan(20,"hn"));

    }
}
