package name.nepavel.jspstrutsdemo.cards;

/**
 * Created by pavel.krizhanovskiy on 12.08.2016.
 */
public class Card implements Comparable<Card> {
    private Suit suit;
    private int nominal;

    /**
     * Создает карту по переданным масти и номиналу
     *
     * @param suit    Масть
     * @param nominal Номинал. 1 - туз, 2-10 - цифры, 11-13 - валет-король
     */
    public Card(Suit suit, int nominal) {
        if (suit == null) {
            throw new IllegalArgumentException("Масть не может быть null!");
        }
        if (nominal < 1 || nominal > 13) {
            throw new IllegalArgumentException("Номинал не может быть меньше 1 или больше 13!");
        }

        this.suit = suit;
        this.nominal = nominal;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getNominal() {
        return nominal;
    }

    @Override
    public String toString() {
        String nominalRepresentation = "";
        switch (nominal) {
            case 1:
                nominalRepresentation = "A";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                nominalRepresentation = String.valueOf(nominal);
                break;
            case 11:
                nominalRepresentation = "J";
                break;
            case 12:
                nominalRepresentation = "Q";
                break;
            case 13:
                nominalRepresentation = "K";
                break;
        }
        return nominalRepresentation + suit.view();
    }

    public int compareTo(Card o) {
        return getNominal() - o.getNominal() != 0
                ? getNominal() - o.getNominal()
                : getSuit().ordinal() - o.getSuit().ordinal();
    }
}
