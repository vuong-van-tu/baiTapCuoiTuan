public class SinhVienC extends SinhVienA{
    private final String monVan = "Văn";
    private final String monSu = "Sử";
    private final String monDia = "Địa";

    public SinhVienC(int soBaoDanh, String ten, String diaChi, float mucUuTien) {
        super(soBaoDanh, ten, diaChi, mucUuTien);
    }

    public SinhVienC() {
    }

    @Override
    public String toString() {
        return "SinhVienB{" +
                "Khối thi : "+monVan+
                ", "+monSu+
                ", "+monDia+
                super.toString()+
                '}';
    }
}
