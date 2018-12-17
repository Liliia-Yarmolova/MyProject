package BookingRestaurant;

public class Dish implements Comparable<Dish> {
    private String name;
    private String description;
    private double price;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Dish o) {
        Dish dish = (Dish) o;
        if (this.getPrice() > dish.getPrice()) {
            return 1;
        } else if (this.getPrice() < dish.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return (name + " which consist of " + description + ". The price of this dish is: " + price);

    }
}
