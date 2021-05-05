package tests;
import org.junit.Before;
import Class.*;

public class MovieTest {

    private Movie m1;
    private String m1Name = "childmovie";
    private int m1PriceCode = 0;
    private Movie m2;
    private String m2Name = "newreleasemovie";
    private int m2PriceCode = 1;
    private Movie m3;
    private String m3Name = "regularmovie";
    private int m3PriceCode = 2;

    @Before
    public void initialize() {
        m1 = new Movie(m1Name, m1PriceCode);
        m2 = new Movie(m2Name, m2PriceCode);
        m3 = new Movie(m3Name, m3PriceCode);
    }

}