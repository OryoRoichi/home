public class Trapezoid extends  Figure{

    int topSideA;
    int bottomSideB;
    int leftSideC;
    int raightSideD;


    public Trapezoid(int topSideA, int bottomSideB, int leftSideC, int raightSideD) {
        super(4);
        this.bottomSideB=bottomSideB;
        this.topSideA=topSideA;
        this.leftSideC=leftSideC;
        this.raightSideD=raightSideD;

    }

    @Override
    public String toString() {
        return "Trapezoid has {" +
                "topSideA=" + topSideA +
                ", bottomSideB=" + bottomSideB +
                ", leftSideC=" + leftSideC +
                ", raightSideD=" + raightSideD +
                ", angleCount=" + angleCount +
                '}';
    }

    @Override
    public int Perimeter() {
        return this.raightSideD+this.leftSideC+this.topSideA+this.bottomSideB;
    }

    @Override
    public int Squere() {
        double squere=0;
        squere=  ((topSideA+bottomSideB)/2)*
                (Math.sqrt(Math.pow(leftSideC,2)-(
                        ((Math.pow(bottomSideB-topSideA,2)+Math.pow(leftSideC,2)-Math.pow(raightSideD,2))
                                /(2*(bottomSideB-topSideA))))));
        return (int) squere;
    }

    public Figure transform(Figure obj) {
        if (obj instanceof  Triangle){
            this.triangle = new Triangle(((Triangle) obj).sideA, ((Triangle) obj).sideB, ((Triangle) obj).sideC);
            return this.triangle;
        }
        if (obj instanceof  Rectangle){
            this.rectangle = new Rectangle(((Rectangle) obj).sideA, ((Rectangle) obj).sideB);
            return this.rectangle;
        }
        if (obj instanceof  Circle){
            this.circle = new Circle(((Circle) obj).radius);
            return this.circle;
        }
        if (obj instanceof  Trapezoid){
            this.trapezoid = new Trapezoid(((Trapezoid) obj).topSideA,((Trapezoid) obj).bottomSideB,
                    ((Trapezoid) obj).leftSideC, ((Trapezoid) obj).raightSideD);
            return this.trapezoid;
        }
        return null;
    }
}
