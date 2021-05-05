package Class;

public class Rental {
    final Movie movie;
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

    double getCharge() {
        return movie.getCharge(daysRented);
    }
    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

}