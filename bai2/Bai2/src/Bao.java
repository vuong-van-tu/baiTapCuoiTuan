public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao(String tenNhaXuatBan, String maTaiLieu, int soBanPhatHanh,int ngayPhatHanh) {
        super(tenNhaXuatBan, maTaiLieu, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "Ngày phát hành :" + ngayPhatHanh +
                super.toString()+
                '}';
    }
}
