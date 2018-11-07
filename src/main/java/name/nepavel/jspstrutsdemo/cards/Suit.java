package name.nepavel.jspstrutsdemo.cards;

/**
 * Created by pavel.krizhanovskiy on 12.08.2016.
 */
public enum Suit {
    HEARTS {
        @Override
        public String view() {
            return "\u2662";
        }
    }, DIAMONDS {
        @Override
        public String view() {
            return "\u2663";
        }
    }, SPADES {
        @Override
        public String view() {
            return "\u2660";
        }
    }, CLUBS {
        @Override
        public String view() {
            return "\u2661";
        }
    };

    abstract String view();
}
