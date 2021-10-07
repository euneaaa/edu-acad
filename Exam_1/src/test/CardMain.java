package test;

public class CardMain {
    public static void main(String[] args) {
        String[] patters = {"spade", "heart", "diamond", "clover"};
        Card[] cards = new Card[52];
        int sum = 0;
        for (int i = 0; i < patters.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String value = null;
                switch (z) {
                    case 1:
                        value = "A";
                        break;
                    case 11:
                        value = "J";
                        break;
                    case 12:
                        value = "Q";
                        break;
                    case 13:
                        value = "K";
                        break;
                    default:
                        value = String.valueOf(z);
                }
                Card c = new Card(patters[i], value);
                cards[sum] = c;
                sum++;
            }
        }
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }
}
