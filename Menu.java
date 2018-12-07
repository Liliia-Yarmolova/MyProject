package BookingRestaurant;

import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        double price = dishes.get(0).getPrice();
        Dish cheapDish = null;
        for (Dish dish : dishes) {
            if (dish.getPrice() < price) {
                cheapDish = dish;
            }
        }
        return cheapDish;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public String toString() {
        String menuName = name;
        return menuName;

    }

}
