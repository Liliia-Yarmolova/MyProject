package BookingRestaurant;

import static BookingRestaurant.Filter.filter;
import static BookingRestaurant.RestaurantFinder.findByMenu;
import static BookingRestaurant.RestaurantFinder.findByAddress;
import static BookingRestaurant.RestaurantFinder.findByName;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class RestaurantRunner {
    public static void main(String[] args) {
        
        List<Restaurant> restaurants = createRestaurant();
        
        System.out.println(filter(restaurants, findByAddress("sagaj")));
        System.out.println(filter(restaurants, findByName("stor")));
        System.out.println(filter(restaurants, findByMenu("kidsMenu")));
    }


    public static List<Restaurant> createRestaurant() throws IllegalFullRestaurantException {
        List<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant1 = new Restaurant("Under Wonder", "Bolshaya Vasilkovskaya, 21", 380982034394L, "kidsMenu", 1);
        Restaurant restaurant2 = new Restaurant("Stories Cafe", "Konstantinovskaya 20/14", 380986575902L, "european", 3);
        Restaurant restaurant3 = new Restaurant("Fayna Familiya", "Sagajdachnogo, 25", 380444637592L, "mediterranean", 2);
        restaurants.add(restaurant1);//.addRestaurant(restaurant1);
        restaurants.add(restaurant2);//.addRestaurant(restaurant2);
        restaurants.add(restaurant3);//.addRestaurant(restaurant3);

        Menu kidsMenu = new Menu("Kids Menu");
        Menu mediterranean = new Menu("Mediterranean");
        Menu european = new Menu("European");

        Dish cheesyChickenPasta = new Dish("Cheesy Chicken Pasta", "Cheesy chicken pasta made with 100% all-natural, white meat chicken", 55);
        Dish miniChocolateMolten = new Dish("Mini Chocolate Molten", "Moist chocolate cake with a melted chocolate center", 45);
        Dish houseSalad = new Dish("House Salad", "Tomatoes, cucumbers, shredded cheese, croutons ", 40);
        Dish salad = new Dish("Caribbean Salad with Grilled Chicken", "Pineapple, mandarin oranges, dried cranberries, red bell peppers, green onions, cilantro, with honey-lime dressing", 70);
        Dish soup = new Dish("Pea and mint soup", "Pea soup with mint and cheese churros ", 55);
        Dish beefCarpaccio = new Dish("Beef Carpaccio", "Beef Carpaccio whih artichokes and gremolata", 100);
        Dish pasta = new Dish("Pasta", "Pasta with clams and bottarga", 120);
        Dish fish = new Dish("Fish", "Dorado fllet with grilled vegetables", 180);
        Dish desserts = new Dish("Cake", "Brawnie with fresh raspberry and vanilla ice cream", 85);

        kidsMenu.addDish(cheesyChickenPasta);
        kidsMenu.addDish(miniChocolateMolten);
        kidsMenu.addDish(houseSalad);

        european.addDish(salad);
        european.addDish(soup);
        european.addDish(beefCarpaccio);

        mediterranean.addDish(pasta);
        mediterranean.addDish(fish);
        mediterranean.addDish(desserts);

        Customer customer1 = new Customer("William", 380971234567L);
        Customer customer2 = new Customer("John", 380979876543L);
        BookList bookList1 = new BookList(LocalDate.of(2018, 12, 15), LocalTime.of(19, 00, 00, 00), customer1, 2);
        BookList bookList2 = new BookList(LocalDate.of(2018, 12, 25), LocalTime.of(18, 30, 00, 00), customer2, 4);
        BookList bookList3 = new BookList(LocalDate.of(2018, 12, 28), LocalTime.of(13, 30, 00, 00), customer2, 2);
        try {
            restaurant1.addOrder(bookList1);
            restaurant2.addOrder(bookList2);
            restaurant3.addOrder(bookList3);
        } catch (IllegalFullRestaurantException e) {
            System.out.println(e.getMessage());
        }

        return restaurants;

    }
}
