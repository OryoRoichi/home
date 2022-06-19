public abstract class Figure implements Countable, Transformable {
    int angleCount;
    Triangle triangle;
    Rectangle rectangle;
    Circle circle;
    Trapezoid trapezoid;
    public Figure(int angleCount) {
        this.angleCount = angleCount;
    }

    @Override
    public String toString() {
        return "has " + angleCount +
                " angles ";
    }
}
