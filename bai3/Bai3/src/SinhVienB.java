public class SinhVienB extends SinhVien{
    private final String monToan = "Toán";
    private final String monHoa = "Hóa";
    private final String monSinh = "Sinh";

    public SinhVienB(int soBaoDanh, String ten, String diaChi, float mucUuTien) {
        super(soBaoDanh, ten, diaChi, mucUuTien);
    }

    public SinhVienB() {
    }

    @Override
    public String toString() {
        return "SinhVienB{" +
                "Khối thi : "+monToan+
                ", "+monHoa+
                ", "+monSinh+
                super.toString()+
                '}';
    }
}
