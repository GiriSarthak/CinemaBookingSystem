import java.util.List;

/**
 * Represents a physical theater that holds rows of seats.
 * 
 * Handles seat reservations for specific rows.
 * 
 * author Sarthak Giri
 * @version 27/06/2025
 */
public class Theater {

    private String name;
    private List<Row> rows;

    /**
     * Retrieves the row with the specified number.
     * 
     * @param rowNumber The row number
     * @return The Row object
     */
    public Row getRow(int rowNumber) {
        return null;
    }

    /**
     * Reserves a specific seat in a row.
     * 
     * @param row Row number
     * @param seatNumber Seat number
     * @return true if successful
     */
    public boolean reserveSeat(int row, int seatNumber) {
        return false;
    }
}
