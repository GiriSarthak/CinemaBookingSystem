import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores and manages a collection of movie shows.
 * Allows finding shows by title and date.
 * 
 * @author Sarthak Giri
 * @version 27/06/2025
 */
public class ShowCollection {

    private List<Show> shows = new ArrayList<>();

    /**
     * Finds all shows matching a specific title and date.
     * 
     * @param title Movie title
     * @param date Date of the show
     * @return List of matching shows
     */
    public List<Show> findShows(String title, LocalDate date) {
        return null;
    }

    /**
     * Adds a new show to the collection.
     * 
     * @param show The show to add
     */
    public void addShow(Show show) {
        shows.add(show);
    }
}
