public class SinhVien {
    private String hoTen;
    private int tuoi;
    private String lop;

    public SinhVien(String hoTen, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public SinhVien() {
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", lop='" + lop + '\'' +
                '}';
    }
}
