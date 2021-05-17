public class TaiLieu {
    private  String tenNhaXuatBan;
    private  String maTaiLieu;
    private  int soBanPhatHanh;

    public TaiLieu(String tenNhaXuatBan, String maTaiLieu, int soBanPhatHanh) {
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.maTaiLieu = maTaiLieu;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu() {
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return
                ", Tên nhà xuất bản :" + tenNhaXuatBan +
                ", Mã tài liệu : " + maTaiLieu +
                ", Số bản phát hành : " + soBanPhatHanh
                ;
    }
}
