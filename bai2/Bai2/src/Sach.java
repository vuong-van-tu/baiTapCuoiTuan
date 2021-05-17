public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String tenNhaXuatBan, String maTaiLieu, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(tenNhaXuatBan, maTaiLieu, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach() {
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sách{" +
                " Tên tác giả : " + tenTacGia + '\'' +
                ", Số trang : " + soTrang +
                super.toString()+
                '}';
    }
}
