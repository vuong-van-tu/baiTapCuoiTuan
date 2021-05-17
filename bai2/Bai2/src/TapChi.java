public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String tenNhaXuatBan, String maTaiLieu, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(tenNhaXuatBan, maTaiLieu, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi() {
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Tạp chí {" +
                " Số phát hành : " + soPhatHanh +
                ", Tháng phát hành : " + thangPhatHanh +
                super.toString()+
                '}';
    }
}
