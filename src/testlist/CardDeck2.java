package testlist;

import testlist.Card;

public class CardDeck2 {
    public static void main(String[] args) {
        int sum =0;
        String[] patters = {"스페이드","하트","클럽","다이아몬드"};
        Card[] cards = new Card[52];
        for(int i=0; i<patters.length; i++) {
            for(int z=1;z<=13; z++){
                String number = null;
                switch (z){
                    case 1:
                        number = "A"; break;
                    case 11:
                        number = "J"; break;
                    case 12:
                        number = "Q"; break;
                    case 13:
                        number = "K"; break;
                    default:
                        number = String.valueOf(z);

                }
                Card c = new Card(patters[i],number);
                cards[sum]= c;
                sum+=1;
            }
        }
        for(int i=0; i<cards.length; i++){
            System.out.println(cards[i]);
        }
    }
}

