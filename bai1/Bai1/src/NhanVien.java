public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NhanVien() {
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                " Công việc : " + congViec +
                ", Họ tên : " + super.getHoTen() +
                ", Tuổi : " + super.getTuoi() +
                ", Giới tính : " + super.getGioiTinh() +
                ", Địa chỉ : " + super.getDiaChi() +
                '}';
    }
}



