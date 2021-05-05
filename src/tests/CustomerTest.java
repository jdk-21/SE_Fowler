package tests;

import org.junit.Before;
import org.junit.Test;
import Class.*;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer c1;
    private final String c1Name = "Müller";
    private Customer c2;
    private final String c2Name = "Meier";
    private Movie m1;
    private final String m1Name = "movieName1";
    private Movie m2;
    private final String m2Name = "movieName2";
    private Rental r1;
    private Rental r2;

    @Before
    public void initialize() {
        m1 = new Movie(m1Name, 1);
        m2 = new Movie(m2Name, 2);
        r1 = new Rental(m1, 10);
        r2 = new Rental(m2, 5);
        c1 = new Customer(c1Name);
        c2 = new Customer(c2Name);
        c1.addRental(r1);
        c1.addRental(r2);
        c2.addRental(r2);
    }

    @Test
    public void testStatementC1() {
        String expectedStatement = "Rental Record for " + c1Name + "\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\t" + m1Name + "\t\t10\t30.0\n" +
                "\t" + m2Name + "\t\t5\t4.5\n" +
                "Amount owed is 34.5\n" +
                "You earned 3.0 frequent renter points";
        assertEquals("statement output is not correct!", c1.statement(), expectedStatement);
    }
    @Test
    public void testStatementC2() {
        String expectedStatement = "Rental Record for " + c2Name + "\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\t" + m2Name + "\t\t5\t4.5\n" +
                "Amount owed is 4.5\n" +
                "You earned 1.0 frequent renter points";
        assertEquals("statement output is not correct!", c2.statement(), expectedStatement);
    }
}