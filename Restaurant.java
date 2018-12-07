package BookingRestaurant;

import java.util.ArrayList;

public class Restaurant {
    private final String name;
    private final String address;
    private final long phone;
    private final Menu menu;
    private final ArrayList<BookList> bookLists = new ArrayList<>();

    public Restaurant(String name, String address, long phone, Menu menu) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phone;
    }

    public Menu getMenu() {
        return menu;
    }

    public void addOrder(BookList bookList) {
        bookLists.add(bookList);
    }

    public ArrayList<BookList> getBookLists() {
        return bookLists;
    }


    public ArrayList<BookList> findByCustomer(Customer customer) {
        ArrayList<BookList> orderByCustomer = new ArrayList<>();
        for (BookList bookList : bookLists) {
            if (bookList.getCustomer().getName().equalsIgnoreCase(customer.getName())) {
                orderByCustomer.add(bookList);
            }
        }
        return orderByCustomer;
    }

    public String toString() {
        String restaurantInfo = ("Restaurant " + name + " is located by address " + address + " and introduce such menu as " + menu + '\'' +
                "." + "If you have any question, please call us by phone " + phone);
        return restaurantInfo;
    }
}

