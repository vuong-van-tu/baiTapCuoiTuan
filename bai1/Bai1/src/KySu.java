public class KySu extends CanBo{

        private String nganhDaoTao;

        public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
            super(hoTen, tuoi, gioiTinh, diaChi);
            this.nganhDaoTao = nganhDaoTao;
        }

        public KySu() {
        }

        public String getNganhDaoTao() {
            return nganhDaoTao;
        }

        public void setNganhDaoTao(String nganhDaoTao) {
            this.nganhDaoTao = nganhDaoTao;
        }

        @Override
        public String toString() {
            return "KySu{" +
                    " Ngành đào tạo : " + nganhDaoTao +
                    ", Họ tên : " + super.getHoTen() +
                    ", Tuổi : " + super.getTuoi() +
                    ", Giới tính : " + super.getGioiTinh() +
                    ", Địa chỉ : " + super.getDiaChi() +
                    '}';
        }
    }


