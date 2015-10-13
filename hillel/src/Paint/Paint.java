package Paint;

/**
 * Created by Oleksandr on 13.10.2015.
 */
public abstract class Paint {
    String color;
    public double consumption;

    public double getConsumption (double consumption, double area){
        double areaConsumption = consumption*area;
        return areaConsumption;
    }
}
