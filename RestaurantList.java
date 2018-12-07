package BookingRestaurant;

import java.util.ArrayList;

public class RestaurantList {
    private ArrayList<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public ArrayList<Restaurant> findByName(String name) {
        ArrayList<Restaurant> restaurantByName = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                restaurantByName.add(restaurant);
            }
        }
        return restaurantByName;
    }

    public ArrayList<Restaurant> findByAddress(String address) {
        ArrayList<Restaurant> restaurantByAddress = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getAddress().equalsIgnoreCase(address)) {
                restaurantByAddress.add(restaurant);
            }
        }
        return restaurantByAddress;
    }

    public ArrayList<Restaurant> findByMenu(Menu menu) {
        ArrayList<Restaurant> restaurantByAddress = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getMenu().getName().equalsIgnoreCase(menu.getName())) {
                restaurantByAddress.add(restaurant);
            }
        }
        return restaurantByAddress;
    }

    public String toString() {
        return "RestaurantList{" +
                "restaurants=" + restaurants +
                '}';
    }
}
