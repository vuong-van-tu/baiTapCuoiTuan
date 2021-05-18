public class QuanLyGiaoVien {
    private GiaoVien[] giaoViens = new GiaoVien[100];
    private int luongCung;
    private int luongThuong;
    private int tienPhat;
    private int luongThuc;
    private int index;

    public QuanLyGiaoVien(GiaoVien[] giaoVien, int luongCung, int luongThuong, int tienPhat, int luongThuc) {
        this.giaoViens = giaoVien;
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.luongThuc = luongThuc;
    }

    public GiaoVien[] getGiaoVien() {
        return giaoViens;
    }

    public void setGiaoVien(GiaoVien[] giaoVien) {
        this.giaoViens = giaoVien;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        this.luongThuong = luongThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getLuongThuc() {
        return luongThuc;
    }

    public void setLuongThuc(int luongThuc) {
        this.luongThuc = luongThuc;
    }
    public QuanLyGiaoVien(){}
    public void themGiaoVien(GiaoVien giaoVien){
            giaoViens[index] = giaoVien;
            index++;
    }
    public void hienThi(){
        for (int i = 0; i < index; i++) {
            System.out.println(giaoViens[i]);
        }
    }
    public void xoaGiaoVien(String maGiaoVien){
        boolean find = false;
        int indexOf = -1;
        for (int i = 0; i < index; i++) {
            if (maGiaoVien.equals(giaoViens[i].getMaSoGiaoVien())){
                find = true;
                indexOf = i;
                break;
            }
        }
        if (find){
            giaoViens[indexOf]=null;
            for (int i = indexOf; i < index; i++) {
                giaoViens[i]=giaoViens[i+1];
                giaoViens[i+1]=null;
            }
            index -=1;
        }else {
            System.out.println("Không tìm thấy giáo viên");
        }
        hienThi();
    }

    public int luong(int luongCung,int luongThuong, int tienPhat){
        luongThuc = luongCung+luongThuong-tienPhat;
        return luongThuc;
    }
}
