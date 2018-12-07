package BookingRestaurant;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class BookList {
    private final LocalDate date;
    private final LocalTime time;
    private final Customer customer;
    private int countVisitors;

    public BookList(LocalDate date, LocalTime time, Customer customer, int countVisitors) {
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.countVisitors = countVisitors;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getCountVisitors() {
        return countVisitors;
    }

    public void setCountVisitors(int countVisitors) {
        this.countVisitors = countVisitors;
    }

    public Customer getCustomer() {
        return customer;
    }


    public String toString() {
        String bookListInfo = (customer + " booked place for " + countVisitors + " people on " + date + " at " + time);
        return bookListInfo;
    }
}
