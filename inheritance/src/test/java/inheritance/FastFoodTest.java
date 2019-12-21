package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FastFoodTest {
    @Test
    public void testMethod() {
        FastFoods classUnderTest = new FastFoods();
        Review review = new Review();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.addReview(review));
    }
}
