package tests;
import org.junit.Before;
import classes.Movie;

public class MovieTest {

    private String m1Name = "childmovie";
    private int m1PriceCode = 0;
    private String m2Name = "newreleasemovie";
    private int m2PriceCode = 1;
    private String m3Name = "regularmovie";
    private int m3PriceCode = 2;

    @Before
    public void initialize() {
        Movie m1 = new Movie(m1Name, m1PriceCode);
        Movie m2 = new Movie(m2Name, m2PriceCode);
        Movie m3 = new Movie(m3Name, m3PriceCode);
    }

}