import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.round;

public class StoreSimulatorRunner {
    public static void main(String[] args) {
        final String RED = "\033[0;31m";     // RED
        final String GREEN = "\033[0;32m";   // GREEN
        final String PURPLE = "\033[0;35m";  // PURPLE
        final String CYAN = "\033[0;36m";    // CYAN
        final String RESET = "\u001B[0m";


        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        StoreSimulator start = new StoreSimulator();

        System.out.println(PURPLE + "Welcome to The Local Market! Below are our items and prices." + RESET);
        System.out.println(CYAN + start.prices() + RESET);
        System.out.println(RED + "Are you ready to begin? Enter Yes to begin or No to end the simulation." + RESET);
        String answer = s.nextLine();
        boolean st = start.willSimulationRun(answer);
        System.out.println();


       while (st == true) {
           System.out.println(GREEN + "Before you begin, note these rules: \n 1: You can enter -1 to get a random number of items up to 25. \n 2: Any number less than -1 or higher than Java's max integer will automatically be inputted as 0 or result in a java error. \n 3: If you do not wish to not buy an item then enter 0." + RESET);
           System.out.println();
           System.out.println("How many apples would you like to buy?");
           int a = s.nextInt();
           a = start.random(a);
           if (start.checkForNegatives(a) == true || a > Integer.MAX_VALUE) {
               a = 0;
           }
           start.numApples(a);
           System.out.println();

           System.out.println("How many bananas would you like to buy?");
           int b = s.nextInt();
           b = start.random(b);
           if (start.checkForNegatives(b) == true || b > Integer.MAX_VALUE) {
               b = 0;
           }
           start.numBananas(b);
           System.out.println();

           System.out.println("How many watermelons would you like to buy?");
           int w = s.nextInt();
           w = start.random(w);
           if (start.checkForNegatives(w) == true || w > Integer.MAX_VALUE) {
               w = 0;
           }
           start.numWatermelons(w);
           System.out.println();

           System.out.println("How many peaches would you like to buy?" );
           int p = s.nextInt();
           p = start.random(p);
           if (start.checkForNegatives(p) == true || p > Integer.MAX_VALUE) {
               p = 0;
           }
           start.numPeaches(p);
           System.out.println();

           System.out.println("How many oranges would you like to buy?");
           int o = s.nextInt();
           o = start.random(o);
           if (start.checkForNegatives(o) == true || o > Integer.MAX_VALUE) {
               o = 0;
           }
           start.numOranges(o);
           System.out.println();

           System.out.println("How many pomegranates would you like to buy?");
           int po = s.nextInt();
           po = start.random(po);
           if (start.checkForNegatives(po) == true || po > Integer.MAX_VALUE) {
               po = 0;
           }
           start.numPomegranates(po);
           System.out.println();

           System.out.println("How many pears would you like to buy?");
           int pe = s.nextInt();
           pe = start.random(pe);
           if (start.checkForNegatives(pe) == true || pe > Integer.MAX_VALUE) {
               pe = 0;
           }
           start.numPears(pe);
           System.out.println();

           StoreSimulator trip1 = new StoreSimulator(a,b,w,p,o,po,pe);

           System.out.println(GREEN + "<-------------------------------------->");
           System.out.println("The Local Market");
           System.out.println("29 Fort Greene Pl, Brooklyn, NY 11217");
           System.out.println();
           System.out.println(trip1);
           System.out.println();
           System.out.println("Total Cost: $" + df.format(trip1.getNetTotal()));
           System.out.println("<-------------------------------------->");

           st = false;
       }


    }
}
