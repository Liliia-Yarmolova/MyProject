package BookingRestaurant;

public class Customer {
    private String name;
    private long phone;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String toString() {
        return (name + " " + phone);
    }
}
