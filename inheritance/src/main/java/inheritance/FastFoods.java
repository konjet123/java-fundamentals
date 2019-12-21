package inheritance;

public class FastFoods implements Restaurant {
    protected String name,priceCategory;
    protected int rating;
    protected  Review reviewer;

    public FastFoods(){
        this.name="";
        this.priceCategory="$";
        this.rating=0;
        this.reviewer = new Review();
    }
    public boolean addReview(Review reviewer){
        if (reviewer==null) {
            return false;
        }
        else {
            this.reviewer = reviewer;
            return true;
        }
    }
    public int getRating(){
        return this.rating;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString(){
        return "Name of Restaurant " + name.toString() + " and Price Category: " + priceCategory.toString() ;
    }
}
