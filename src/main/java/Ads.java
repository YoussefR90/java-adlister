<<<<<<< HEAD
import java.util.List;

public interface Ads {
    List<Ad> all();
    void insert(Ads ads);// takes in a product which we are calling product
=======
import java.sql.SQLException;
import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all() throws SQLException;
    // insert a new ad and return the new ad's id
    Long insert(Ad ad) throws SQLException;
>>>>>>> servlets-exercise
}