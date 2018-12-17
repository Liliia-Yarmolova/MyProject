package BookingRestaurant;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookList {
    private LocalDate date;
    private LocalTime time;
    private Customer customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setCountVisitors(int countVisitors) {
        this.countVisitors = countVisitors;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return (customer + " booked place for " + countVisitors + " people on " + date + " at " + time);

    }
}
