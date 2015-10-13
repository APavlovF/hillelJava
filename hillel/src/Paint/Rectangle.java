package Paint;

/**
 * Created by Oleksandr on 13.10.2015.
 */
public class Rectangle extends Figure {
    double sideX;
    double sideY;

    public void setSides(double sideX, double sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    public double getArea() {
        area = sideX * sideY;
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * (sideX + sideY);
        return perimeter;
    }
}
