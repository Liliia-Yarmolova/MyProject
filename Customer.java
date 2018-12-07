package BookingRestaurant;

public class Customer {
    private final String name;
    private final long phone;

    public Customer(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }


    public String toString() {
        String customerInfo = (name + " " + phone);
        return customerInfo;
    }
}
