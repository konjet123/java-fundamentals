/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.lang.Math;

public class Library {
    public int[] Roll(int lengthOfArray) {
        int[] newArray = new int[lengthOfArray];
       for(int counter=0;counter<newArray.length; counter++) {
            newArray[counter] = (int)Math.random() * 6 + 1;
            System.out.println(newArray[counter]);
        }
        return newArray;
    }
}