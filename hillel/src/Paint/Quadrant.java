package Paint;

/**
 * Created by Oleksandr on 13.10.2015.
 */
public class Quadrant extends Figure {
    double side;

    public double setSide(double side) {
        this.side = side;
        return side;
    }
    public double getArea() {
        area = side * side;
        return area;
    }

    public double getPerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }
}
