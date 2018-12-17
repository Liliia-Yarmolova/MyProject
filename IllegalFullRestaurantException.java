package BookingRestaurant;

public class IllegalFullRestaurantException extends RuntimeException {
    public IllegalFullRestaurantException(String message) {
        super(message);

    }
}
