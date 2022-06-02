public class Rank  extends Suit {
    String nominal;

    public Rank(String suit, String nominal) {
        super(suit);
        this.nominal= nominal;
    }

    @Override
    public String toString() {
        return super.toString()+"Значение - "+this.nominal;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof  Rank){
            Rank o = (Rank) obj;
            return o.suit ==this.suit && o.nominal == this.nominal;
        }
        return false;
    }
}
