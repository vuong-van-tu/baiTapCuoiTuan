public class SinhVien {
    private int soBaoDanh;
    private String ten;
    private String diaChi;
    private float mucUuTien;

    public SinhVien(int soBaoDanh, String ten, String diaChi, float mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.ten = ten;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }
    public SinhVien(){}

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(float mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return
                " Số báo danh : " + soBaoDanh +
                ", Tên : " + ten +
                ", Địa chỉ : " + diaChi +
                ", Mức ưu tiên : " + mucUuTien
                ;
    }
}
