public class Suit extends  Card{
    String suit;
    public Suit(String suit) {
        this.suit=suit;
    }

    @Override
    public String toString() {
        return super.toString()+"Масть - "+this.suit+" ";
    }

    public boolean equals(Object obj) {
        if( obj instanceof  Suit){
            Suit o = (Suit) obj;
            return o.suit ==this.suit ;
        }
        return false;
    }
}
