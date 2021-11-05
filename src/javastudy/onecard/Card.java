package javastudy.onecard;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String patten;
    private String value;

    public void card(String patten,String value){
        this.patten = patten;
        this.value = value;
    }

    public void carddeck(){
        String[] pat = {"spa","dia","clo","hart"};
        List<Card> cards = new ArrayList<>();
        for(int i = 0; i<pat.length; i++){
            for(int j = 1; j<=13; j++){
                String value = String.valueOf(j);
                Card c = new Card();
                c.card(pat[i],value);
                cards.add(c);
            }
        }
    }
}
