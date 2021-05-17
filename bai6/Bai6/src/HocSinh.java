//Để quản lý hồ sơ học sinh của trường THPT nhà trường cần các thông tin sau: Lớp,  và các thông tin về cá nhân của mỗi học sinh.
//
//        Mỗi học sinh có các thông tin sau: Họ tên, tuổi, quê quán.
//
//        Yêu cầu 1: Xây dựng HocSinh để quản lý thông tin của mỗi học sinh.
//
//        Yêu cầu 2: Xây dựng các phương thức thêm, hiển thị thông tin của mỗi học sinh.
//
//        Yêu cầu 3: Cài đặt chương trình có các chức năng sau:
//
//        Thêm học sinh mới.
//        Hiện thị các học sinh 20 tuổi.
//        Cho biết số lượng các học sinh có tuổi là 23 và quê ở DN.

public class HocSinh {
    private String hoTen;
    private int tuoi;
    private String queQuan;

    public HocSinh(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }
    public HocSinh(){}

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

    @Override
    public String toString() {
        return "HocSinh{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
