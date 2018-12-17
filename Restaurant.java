package BookingRestaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Restaurant {
    private String name;
    private String address;
    private long phone;
    private String menu;
    private int countOfTable;
    private List<BookList> bookLists = new ArrayList<>();


    public Restaurant(String name, String address, long phone, String menu, int countOfTable) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.menu = menu;
        this.countOfTable = countOfTable;
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

    public String getMenu() {
        return menu;
    }

    public int getCountOfTable() {
        return countOfTable;
    }

    public void setCountOfTable(int countOfTable) {
        this.countOfTable = countOfTable;
    }

    public void addOrder(BookList bookList) {
        if (bookLists.size() == countOfTable) {
            throw new IllegalFullRestaurantException("Sorry, we do not have free table.");
        }
        bookLists.add(bookList);
    }

    public List<BookList> getBookLists() {
        return bookLists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setBookLists(List<BookList> bookLists) {
        this.bookLists = bookLists;
    }


    public List<BookList> findByCustomer(Customer customer) {
        List<BookList> orderByCustomer = new ArrayList<>();
        for (BookList bookList : bookLists) {
            if (bookList.getCustomer().getName().equalsIgnoreCase(customer.getName())) {
                orderByCustomer.add(bookList);
            }
        }
        return orderByCustomer;
    }


    public String toString() {
        return ("Restaurant " + name + " is located by address " + address + " and introduce such menu as " + menu + '\'' +
                "." + "If you have any question, please call us by phone " + phone);
    }
}
