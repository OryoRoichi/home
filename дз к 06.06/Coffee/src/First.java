public class First extends Dishes{
    public First(String name, int cost) {
        super(name, cost);
    }

    @Override
    public String toString() {
        return "Первое"+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
