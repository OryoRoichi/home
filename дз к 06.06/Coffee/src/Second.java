public class Second extends Dishes {
    public Second(String name, int cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "������ "+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
