public class Main {
    public static void main(String[] args) {
        QuanLyCard ql = new QuanLyCard();
        ql.themCard(new Card("abc1",17,5,301));
        ql.delete("abc1");
        ql.hienThi();
    }
}
