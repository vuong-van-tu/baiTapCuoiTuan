public class SinhVienA extends SinhVien{
    private final String monToan = "Toán";
    private final String monLy = "Lý";
    private final String monHoa = "Hóa";

    public SinhVienA(int soBaoDanh, String ten, String diaChi, float mucUuTien) {
        super(soBaoDanh, ten, diaChi, mucUuTien);
    }

    public SinhVienA() {
    }

    @Override
    public String toString() {
        return "SinhVienA{" +
                "Khối thi : "+monToan+
                ", "+monLy+
                ", "+monHoa+
                super.toString()+
                '}';
    }
}
