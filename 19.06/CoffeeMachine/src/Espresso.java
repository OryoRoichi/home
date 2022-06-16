public class Espresso extends Coffee{
    public Espresso() {
        super(100, 22 );
    }

    @Override
    public String toString() {
        return  "Espresso "+super.toString();
    }
}
