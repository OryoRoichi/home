public class Circle extends Figure {
    int radius;

    public Circle(int radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle has {" +
                "Radius=" + radius +
                ", angleCount=" + angleCount +
                '}';
    }

    @Override
    public int Perimeter() {
        return (int) (2 * Math.PI * this.radius);
    }

    @Override
    public int Squere() {
        return (int) (Math.PI * Math.pow(this.radius, 2));
    }

    public Figure transform(Figure obj) {
        if (obj instanceof Triangle) {
            this.triangle = new Triangle(((Triangle) obj).sideA, ((Triangle) obj).sideB, ((Triangle) obj).sideC);
            return this.triangle;
        }
        if (obj instanceof Rectangle) {
            this.rectangle = new Rectangle(((Rectangle) obj).sideA, ((Rectangle) obj).sideB);
            return this.rectangle;
        }
        if (obj instanceof Circle) {
            this.circle = new Circle(((Circle) obj).radius);
            return this.circle;
        }
        if (obj instanceof Trapezoid) {
            this.trapezoid = new Trapezoid(((Trapezoid) obj).topSideA, ((Trapezoid) obj).bottomSideB,
                    ((Trapezoid) obj).leftSideC, ((Trapezoid) obj).raightSideD);
            return this.trapezoid;
        }
        return null;
    }
}
