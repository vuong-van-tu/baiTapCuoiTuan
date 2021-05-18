public class GiaoVien {
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private String maSoGiaoVien;
    private int luong;

    public GiaoVien(String hoTen, int tuoi, String queQuan, String maSoGiaoVien) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSoGiaoVien = maSoGiaoVien;
    }

    public GiaoVien() {
    }
    public GiaoVien(int luong){
        this.luong = luong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaSoGiaoVien() {
        return maSoGiaoVien;
    }

    public void setMaSoGiaoVien(String maSoGiaoVien) {
        this.maSoGiaoVien = maSoGiaoVien;
    }


    @Override
    public String toString() {
        return "GiaoVien{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", maSoGiaoVien='" + maSoGiaoVien + '\'' +
                '}';
    }
}
