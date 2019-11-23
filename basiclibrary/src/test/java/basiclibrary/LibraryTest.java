/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRoll() {
        Library libraryObject = new Library();
        //assertArrayEquals("should return true", new int[]{2, 3, 4, 5} , libraryObject.Roll(4));
        int [] arrayNumbers = libraryObject.Roll(4);
        for ( int ctr=0;ctr<arrayNumbers.length;ctr++) {
            assertTrue("should match the length", arrayNumbers[ctr] >= 0);
            assertTrue("should match the length", arrayNumbers[ctr] <= 6);
        }
    }
    @Test public void testWeatherData() {
        Library libraryObject = new Library();
        libraryObject.ProcessWeatherData();
    }
    @Test public void testWinnerData() {
        Library libraryObject = new Library();
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = libraryObject.tally(votes);
        System.out.println(winner + " received the most votes!");
    }
}
