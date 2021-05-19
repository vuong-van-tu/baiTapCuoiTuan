import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuanLyCard {
    private List<Card> cards;
    public QuanLyCard(){
        this.cards = new ArrayList<>();
    }
    public void themCard(Card card){
        this.cards.add(card);
    }
    public boolean delete(String id) {
        Card card = this.cards.stream().filter(t -> t.getMaPhieuMuon().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.cards.remove(card);
        return true;
    }
    public void hienThi(){
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
