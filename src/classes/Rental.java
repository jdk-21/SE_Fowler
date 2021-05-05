package classes;

public class Rental {
    private final Movie movie;
    private final int daysRented;
    public Rental(Movie newMovie, int newDaysRented) {
        movie = newMovie;
        daysRented = newDaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }
    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

}