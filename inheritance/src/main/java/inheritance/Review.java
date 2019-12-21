package inheritance;

public class Review {
    private String author;
    private int rating;
    private Restaurant restaurant;
    public Review(){
        this.rating=0;
        this.author="";
    }
    public Review(String author, int rating, Restaurant restaurant) {
        this.author=author;
        this.rating=rating;
        this.restaurant=restaurant;
    }
    public boolean setFastFoodRestaurant(Restaurant restaurant) {
        if(restaurant==null) {
            return false;
        }
        else {
            this.restaurant=(FastFoods)restaurant;
            return true;
        }

    }
    @Override
    public String toString(){
        return "Name of author " + author.toString() + " and rating: " + rating + " and Restaurant Name"
                + restaurant.toString();
    }
}
