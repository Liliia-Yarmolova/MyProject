package BookingRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private Filter() {
    }

    public static <T> List<T> filter(List<T> elements, Finder<T> find) {
        List<T> result = new ArrayList<>();
        for (T element : elements) {
            if (find.apply(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
