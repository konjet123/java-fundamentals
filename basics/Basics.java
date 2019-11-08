import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Basics {
    public static void main(String[] args) {
        System.out.println("First day in Java training");

       
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(2);

    RunTimer();

    }

    private static void RunTimer()
    {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int oldsecond = second;
        String timer = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(timer);
            while(true)
            {
                
                now = LocalDateTime.now();
                hour = now.getHour();
                minute = now.getMinute();
                second = now.getSecond();
                timer = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                if (oldsecond != second)
                {
                    System.out.println(timer);
                    oldsecond = second;
                }
            }    
    }
    

    private static String pluralize(String name, int sCounter)
    {
        if (sCounter==1) {
            return name;
        } else {
            return name + "s";
        }
         
    }

    private static void flipNHeads(int flips) {
        double foundTrail;
        
        int headCounter=0; 
        int trailCount=0;       
        int total=0;
        for (;headCounter <flips;total++ )
        {
            foundTrail = Math.random();                           
            if (foundTrail<.5) {
                trailCount++;
                System.out.println("trails "+ foundTrail);
                headCounter=0;
            }
            else {
                System.out.println("heads "+ foundTrail);
                headCounter++;                
            }            
        }
       

        System.out.println("It took " + total + " flips to flip " + headCounter + " head in a row."); 
    }

}