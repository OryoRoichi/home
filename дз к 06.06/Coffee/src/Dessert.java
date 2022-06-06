public class Dessert extends Dishes {

    public Dessert(String name, int cost) {
        super(name, cost);
    }
    @Override
    public String toString() {
        return "Дисерт"+super.toString();
    }
}
