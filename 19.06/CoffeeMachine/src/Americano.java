public class Americano extends Coffee
{
    public Americano() {
        super(20, 22);
    }

    @Override
    public String toString() {
        return "Americano"+super.toString();
    }
}
