package java8features;

/**
 * Created by APavlov on 25.01.2016.
 */
public class Dish {
    private String name;
    private int calories;
    private boolean vegeterian;
    private DishType type;

    public Dish(String name, int calories, boolean vegeterian, DishType type) {
        this.name = name;
        this.calories = calories;
        this.vegeterian = vegeterian;
        this.type = type;
    }

    public Dish() {
        this("fried potato", 400, true, DishType.OTHER);
        System.out.println("in default Dish constructor");
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        System.out.println("getCalories called");
        return calories;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public DishType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", vegeterian=" + vegeterian +
                ", type=" + type +
                '}';
    }
}
