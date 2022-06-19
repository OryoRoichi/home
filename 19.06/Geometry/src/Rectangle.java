public class Rectangle extends Figure {

    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        super(4);
    }

    @Override
    public String toString() {
        return "Rectangle has{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", angleCount=" + angleCount +
                '}';
    }

    @Override
    public int Perimeter() {
        return this.sideA * 2 + this.sideB * 2;
    }

    @Override
    public int Squere() {
        return this.sideB * this.sideA;
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
