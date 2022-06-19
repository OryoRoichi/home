public class Triangle extends Figure {

    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        super(3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle has {" +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", angleCount=" + angleCount +
                '}';
    }

    @Override
    public int Squere() {
        return SquereThreeSidesAndPerimetr((this.Perimeter()) / 2, this.sideA, this.sideB, this.sideC);
    }

    public int Perimeter() {
        return this.sideB + this.sideC + this.sideA;
    }

    private int SquereThreeSidesAndPerimetr(float halfperimetr, int sideA, int sideB, int sideC) {
        return (int) Math.sqrt(halfperimetr * (halfperimetr - sideA) * (halfperimetr - sideB) * (halfperimetr - sideC));
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
