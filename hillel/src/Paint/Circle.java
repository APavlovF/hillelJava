package Paint;

/**
 * Created by Oleksandr on 13.10.2015.
 */
public class Circle extends Figure {
    double radius;

    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
