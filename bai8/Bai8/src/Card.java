public class Card {
    private String maPhieuMuon;
    private int ngayMuon;
    private int hanTra;
    private int soHieuSach;

    public Card(String maPhieuMuon, int ngayMuon, int hanTra, int soHieuSach) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return "Card{" +
                "maPhieuMuon='" + maPhieuMuon + '\'' +
                ", ngayMuon=" + ngayMuon +
                ", hanTra=" + hanTra +
                ", soHieuSach=" + soHieuSach +
                '}';
    }
}
