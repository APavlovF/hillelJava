package Paint;

/**
 * Created by Oleksandr on 13.10.2015.
 */
public abstract class Figure implements Paintable{
    double area;
    double perimeter;

    public abstract double getArea() ;
    public abstract double getPerimeter();

    public double paintConsumed(double area, double consumption){
        double paintConsumed = area*consumption;
        return paintConsumed;
    }
    public String getColor(String color){
        return color;

    }
}
