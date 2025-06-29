import java.util.List;

/**
 * Represents a row of seats in a theater.
 * 
 * Stores and manages seat reservations.
 * 
 * author Sarthak Giri
 * @version 27/06/2025
 */
public class Row {

    private int rowNumber;
    private List<Seat> seats;

    /**
     * Returns the seat by its number.
     * 
     * @param seatNumber The number of the seat
     * @return The Seat object
     */
    public Seat getSeat(int seatNumber) {
        return null;
    }

    /**
     * Attempts to reserve multiple seats in this row.
     * 
     * @param seatNumbers Array of seat numbers
     * @return true if all reservations are successful
     */
    public boolean reserveSeats(int[] seatNumbers) {
        return false;
    }
}
