public class Nguoi {
    private String ten;
    private int tuoi;
    private String ngheNghiep;
    private String soCMND;

    public Nguoi(String ten, int tuoi, String ngheNghiep, String soCMND) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
    }

    public Nguoi() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return  ", Tên : "+ten+
                ", Tuổi : " +tuoi +
                ", Nghề nghiệp : "+ngheNghiep+
                ", Số CMND : "+soCMND;
    }
}
