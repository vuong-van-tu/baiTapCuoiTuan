public class Lop {
    private HocSinh[] hocSinhs = new HocSinh[1000];
    private int n = 0;


    public Lop() {
    }

    public Lop(HocSinh[] hocSinh) {
        this.hocSinhs = hocSinh;
    }

    public void themHocSinh(HocSinh hocSinh) {
        this.hocSinhs[n] = hocSinh;
        n++;
    }
    public void hienThiHocSinhTheoTuoi(int tuoi) {
        for (int i = 0; i < n; i++) {
            if (hocSinhs[i].getTuoi()==tuoi){
                System.out.println(hocSinhs[i]);
            }
        }
    }
    public int soLuongHocSinhTheoTuoiVaQueQuan(int tuoi, String queQuan){
        int index=0;
        for (int i = 0; i <n ; i++) {
            if (hocSinhs[i].getTuoi()==tuoi&&queQuan.equals(hocSinhs[i].getQueQuan())){
                index++;
            }
        }
        return index;
    }

}
