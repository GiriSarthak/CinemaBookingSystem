import java.util.List;

/**
 * Represents a booking linking a customer to a show and reserved seats.
 * 
 * Stores booking data and provides access to details.
 * 
 * author Sarthak Giri
 * @version 27/06/2025
 */
public class Booking {

    private Show show;
    private List<Seat> seats;
    private Customer customer;

    /**
     * Gets the show linked to this booking.
     * 
     * @return The show object
     */
    public Show getShow() {
        return show;
    }

    /**
     * Gets the list of reserved seats.
     * 
     * @return List of seats
     */
    public List<Seat> getSeats() {
        return seats;
    }

    /**
     * Returns the customer who made this booking.
     * 
     * @return The customer
     */
    public Customer getCustomer() {
        return customer;
    }
}
