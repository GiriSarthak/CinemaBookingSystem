import java.util.List;

/**
 * Represents a customer who can make bookings.
 * Stores customer contact information and booking history.
 * 
 * @author Sarthak Giri
 * @version 27/06/2025
 */
public class Customer {

    private String name;
    private String phoneNumber;
    private List<Booking> bookings;

    /**
     * Gets the customer's phone number.
     * 
     * @return Phone number as a string
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the customer's current booking.
     * 
     * @return The booking object
     */
    public Booking getBooking() {
        return null;
    }

    /**
     * Cancels the given booking.
     * 
     * @param b Booking to cancel
     */
    public void cancelBooking(Booking b) {
        // cancellation logic here
    }
}
