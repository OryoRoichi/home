public class Main {
    public static void main(String[] args) {
        Countable triangle= new Triangle(3,4,5);
        Countable rectangle= new Rectangle(2,3);
        Countable circle= new Circle(4);
        Countable trapezoid= new Trapezoid(2,4,3,3);
        System.out.println(triangle.Squere());
        System.out.println(trapezoid.Squere());
        Transformable t = new Triangle(3,4,5);
        System.out.println(t.transform(new Trapezoid(2,4,3,3)));
    }
}