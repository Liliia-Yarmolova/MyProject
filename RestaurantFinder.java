package BookingRestaurant;


public class RestaurantFinder {

    private RestaurantFinder() {
    }

    public static Finder<Restaurant> findByName(String partOfName) {
        return new Finder<Restaurant>() {
            @Override
            public boolean apply(Restaurant elem) {
                return elem.getName().toLowerCase().contains(partOfName);
            }
        };
    }

    public static Finder<Restaurant> findByAddress(String address) {
        return new Finder<Restaurant>() {
            @Override
            public boolean apply(Restaurant elem) {
                return elem.getAddress().toLowerCase().contains(address.toLowerCase());
            }
        };
    }

    public static Finder<Restaurant> findByMenu(String menu) {
        return new Finder<Restaurant>() {
            @Override
            public boolean apply(Restaurant elem) {
                return elem.getMenu().equalsIgnoreCase(menu);
            }
        };
    }
}
