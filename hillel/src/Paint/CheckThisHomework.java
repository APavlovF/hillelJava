package Paint;

/**
 * Created by Oleksandr on 13.10.2015.
 */
public class CheckThisHomework {
    public static void main(String[] args) {

        GreenAcryl greenAcryl = new GreenAcryl();

        double greenCons = greenAcryl.getConsumption(greenAcryl.consumption, 5);
        System.out.println(greenCons);

        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println("area is: " + circle.getArea() + " perimeter is: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setSides(5, 4);
        System.out.println("area is: " + rectangle.getArea() + " perimeter is: " + rectangle.getPerimeter());
        rectangle.getColor("Green");
        greenCons = rectangle.paintConsumed(rectangle.getArea(), greenAcryl.consumption);
        System.out.println("For painting this figure consumed: " + greenCons);
    }
}
