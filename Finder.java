package BookingRestaurant;

public interface Finder<T> {
    boolean apply(T elem);
}
