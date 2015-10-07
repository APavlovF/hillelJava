import java.util.Scanner;

/**
 * Created by Oleksandr on 07.10.2015.
 */
public class Rectangle {
    int perimeter;
    int area;

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter perimeter: ");
        perimeter = scanner.nextInt();
        System.out.println("Enter area: ");
        area = scanner.nextInt();

        RectangleTask rect1 = new RectangleTask(perimeter, area);
        //rect1.hasSolution();
        rect1.getRectangle();
        */
        RectangleTask rect2 = new RectangleTask(14, 10);
        System.out.println(rect2.getRectangle());
        RectangleTask rect3 = new RectangleTask(12, 30);
        System.out.println(rect3.getRectangle());

    }


}

class RectangleTask {
        int perimeter;
        int area;
    RectangleTask(int perimeter, int area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public Rectangle getRectangle() {  // in this class I use type of another class - ?? don't understand why no error?
        double d; // discriminant
        double x1, x2, y1, y2; //sides
        d = perimeter * perimeter / 4 - 4 * area;

        if (hasSolution()) {
            x1 = (perimeter / 2 + Math.sqrt(d)) / 2;
            x2 = (perimeter / 2 - Math.sqrt(d)) / 2;
            y1 = area / x1;
            y2 = area / x2;
        }
        return null; // ?? this way it's not visible in console
    }

    public boolean hasSolution() {
        boolean hasSolution = true;
        if (perimeter * perimeter / 4 - 4 * area < 0) {
            hasSolution = false;
        }
        return hasSolution;
    }

}




