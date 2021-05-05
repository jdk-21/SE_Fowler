package Class;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private int priceCode;
    Price price;
    public Movie(String newTitle, int newPriceCode) {
        title = newTitle;
        setPriceCode(newPriceCode);
    }
    public int getPriceCode() {
        return price.getPriceCode();
    }
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDREN:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Class.Price Code");
        }
    }
    public String getTitle (){
        return title;
    }

    int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

}