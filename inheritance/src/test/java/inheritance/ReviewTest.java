package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReviewTest {
    @Test
    public void testMethod() {
        Review classUnderTest = new Review();
        Restaurant restaurant = new FastFoods();
        assertTrue("should return 'true'", classUnderTest.setFastFoodRestaurant(restaurant));
    }
}
