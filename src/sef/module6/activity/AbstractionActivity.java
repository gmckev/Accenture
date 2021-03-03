package activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,6);
        rectangle.setColor("Blue");
        System.out.println("Rectangle color " + rectangle.getColor());
        System.out.println("Rectangle area " + rectangle.calculateArea());
        System.out.println("Rectangle perimiter " + rectangle.calculatePerimeter());

        Shape circle = new Circle(5);
        circle.setColor("Red");
        System.out.println("Circle color " + circle.getColor());
        System.out.println("Circle perimiter " + circle.calculatePerimeter());
        System.out.println("Circle area " + circle.calculateArea());
    }
}
