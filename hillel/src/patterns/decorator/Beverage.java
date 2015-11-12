package patterns.decorator;

/**
 * Created by APavlov on 12.11.2015.
 */
public abstract class Beverage {
    protected int cost;
    protected String description;

    /*
    private boolean hasMilk;

    private boolean hasCream;

    private int milkCost = 5;
    private int creamCost = 8;
    */

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int cost() {

       /* int total = cost;
        if (hasMilk) {
            total += milkCost;
        }
        if (hasCream) {
            total += creamCost;
        }
        return total;
        */
        return cost;
    }

    public String description() {
        return description;
    }

   /*
    public void setMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public void setCream(boolean hasCream) {
        this.hasCream = hasCream;
    }
    */
}
