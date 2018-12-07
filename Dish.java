package BookingRestaurant;

public class Dish {
    private final String name;
    private final String description;
    private final double price;

    public Dish(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String dishInfo = (name + "which consist of " + description + ". The price of this dish is: " + price);
        return dishInfo;
    }
}
