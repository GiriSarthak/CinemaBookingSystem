import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a movie show with date/time, theater, and booking info.
 * 
 * @author Sarthak Giri
 * @version 27/06/2025
 */
public class Show {

    private String movieTitle;
    private LocalDateTime dateTime;
    private Theater theater;
    private List<Booking> bookings;

    /**
     * Returns a textual description of the show.
     * 
     * @return The show’s movie title and time
     */
    public String getDetails() {
        return movieTitle + " at " + dateTime.toString();
    }

    /**
     * Attempts to reserve the requested seats.
     * 
     * @param row Row number
     * @param seatNumbers Array of seat numbers to reserve
     * @return true if reservation is successful
     */
    public boolean reserveSeats(int row, int[] seatNumbers) {
        return false;
    }

    /**
     * Returns the theater in which this show is scheduled.
     * 
     * @return The theater object
     */
    public Theater getTheater() {
        return theater;
    }
}
