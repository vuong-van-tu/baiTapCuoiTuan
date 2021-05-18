public class Main {
    public static void main(String[] args) {
        QuanLyGiaoVien ql = new QuanLyGiaoVien();
        GiaoVien cb1 = new GiaoVien("abc",54,"hn","1231a");
        ql.themGiaoVien(cb1);
        GiaoVien cb2 = new GiaoVien("abdc",34,"hn","1234a");
        ql.themGiaoVien(cb2);
        ql.hienThi();
        System.out.println("=================================");
        System.out.println("Sau khi xóa :");
        ql.xoaGiaoVien("1231a");
        cb1 = new GiaoVien(ql.luong(10000,3000,1000));
        System.out.print("Lương cán bộ 1 : ");
        System.out.println(cb1.getLuong()+" VNĐ");
    }
}
