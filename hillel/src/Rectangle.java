import java.util.Scanner;

/**
 * Created by Oleksandr on 07.10.2015.
 */
public class Rectangle {
    static int perimeter;
    static int area;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter perimeter: ");
        perimeter = scanner.nextInt();
        System.out.println("Enter area: ");
        area = scanner.nextInt();

        RectangleTask rect1 = new RectangleTask(perimeter, area);
        //rect1.hasSolution();
        rect1.getRectangle();
    }


}

class RectangleTask {
    static double x1, x2, y1, y2; //sides
    static int p, s;
    RectangleTask(int perimeter, int area) {
        p = perimeter;
        s = area;
        double d; // discriminant

        d = p * p / 4 - 4 * s;
        x1 = (p / 2 + Math.sqrt(d)) / 2;
        x2 = (p / 2 - Math.sqrt(d)) / 2;
        y1 = s / x1;
        y2 = s / x2;
    }

    public Rectangle getRectangle() {

        if (hasSolution()) {
            System.out.println("Sides of rectangle are: " + x1 + " and " + y1);
        }
        return null;
    }

    public boolean hasSolution() {
        boolean hasSolution = true;
        if (p * p / 4 - 4 * s < 0) {
            hasSolution = false;
        }
        return hasSolution;
    }

}




