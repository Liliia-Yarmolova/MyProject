package BookingRestaurant;

import java.util.*;


public class Menu {
    private String name;
    private List<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }


    public Dish getCheapestDish() {
        TreeSet<Dish> result = new TreeSet<>(dishes);
        return result.first();
    }

    /*public Dish getCheapestDish() {
        double price = dishes.get(0).getPrice();
        Dish cheapDish = null;
        for (Dish dish : dishes) {
            if (dish.getPrice() < price) {
                cheapDish = dish;
            }
        }
        return cheapDish;
    }*/

    public String getName() {
        return name;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String menuName = name;
        return menuName;
    }
}
