package BookingRestaurant;

import java.util.*;

public class RestaurantList {

    private List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> findBy(String field, String value) {

        List<Restaurant> result = new ArrayList<>();

        for (Restaurant restaurant : restaurants) {
            if( (field.equalsIgnoreCase("name") && restaurant.getName().toLowerCase().contains(value))
                    || (field.equalsIgnoreCase("address") && restaurant.getAddress().toLowerCase().contains(value))
                    || (field.equalsIgnoreCase("menu") && restaurant.getMenu().equalsIgnoreCase(value)) ) {

                result.add(restaurant);
            }
        }

        return result;
    }

    private List<Restaurant> findByName(String name) {

        return findBy("name", name);
    }

    private List<Restaurant> findByAddress(String address) {

        return findBy("address", address);
    }

    private List<Restaurant> findByMenu(Menu menu) {

        return findBy("menu", menu.getName());
    }


    /*public List<Restaurant> findByName(String name) {
        List<Restaurant> restaurantByName = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                restaurantByName.add(restaurant);
            }
        }
        return restaurantByName;
    }

    public List<Restaurant> findByAddress(String address) {
        List<Restaurant> restaurantByAddress = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getAddress().equalsIgnoreCase(address)) {
                restaurantByAddress.add(restaurant);
            }
        }
        return restaurantByAddress;
    }

    public List<Restaurant> findByMenu(Menu menu) {
        List<Restaurant> restaurantByAddress = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getMenu().getName().equalsIgnoreCase(menu.getName())) {
                restaurantByAddress.add(restaurant);
            }
        }
        return restaurantByAddress;
    }*/


    public String toString() {
        return "RestaurantList{" +
                "restaurants=" + restaurants +
                '}';
    }
}
