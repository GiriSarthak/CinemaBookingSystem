/**
 * Represents a single seat in a theater.
 * 
 * Tracks reservation status and who reserved it.
 * 
 * author Sarthak Giri
 * @version 27/06/2025
 */
public class Seat {

    private int seatNumber;
    private boolean reserved;
    private Customer reservedBy;

    /**
     * Reserves the seat.
     * 
     * @return true when the seat is successfully reserved
     */
    public boolean reserve() {
        reserved = true;
        return true;
    }

    /**
     * Checks if the seat is currently reserved.
     * 
     * @return true if reserved
     */
    public boolean isReserved() {
        return reserved;
    }
}
