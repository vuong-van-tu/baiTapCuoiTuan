public class CongNhan extends CanBo {

    private int level;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int level) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.level = level;
    }

    public CongNhan() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                " Cấp độ : " + level +
                ", Họ tên : " + super.getHoTen() +
                ", Tuổi : " + super.getTuoi() +
                ", Giới tính : " + super.getGioiTinh() +
                ", Địa chỉ : " + super.getDiaChi() +
                '}';
    }
}


