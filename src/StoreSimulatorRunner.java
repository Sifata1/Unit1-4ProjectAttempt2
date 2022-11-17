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
        System.out.println(CYAN + start.toString() + RESET);
        System.out.println(RED + "Are you ready to begin? Enter Yes to begin." + RESET);
        String answer = s.nextLine();
        boolean st = start.willSimulationRun(answer);
        System.out.println();

       while (st == true) {
           System.out.println("How many apples would you like to buy? Enter 0 if you wish to not buy any apples or enter -1 if you would like to buy a random number of apples. \nIf you input an invalid number of apples it will automatically set to 0. \nQuantity: 25");
           int a = s.nextInt();
           a = start.random(a);
           if (start.checkForNegatives(a) == true) {
               a = 0;
           }
           start.numApples(a);
           System.out.println();

           System.out.println("How many bananas would you like to buy? Enter 0 if you wish to not buy any bananas or enter -1 if you would like to buy a random number of bananas.");
           int b = s.nextInt();
           b = start.random(b);
           if (start.checkForNegatives(b) == true) {
               b = 0;
           }
           start.numBananas(b);
           System.out.println();

           System.out.println("How many watermelons would you like to buy? Enter 0 if you wish to not buy any watermelons or enter -1 if you would like to buy a random number of watermelons. \nQuantity: 25");
           int w = s.nextInt();
           w = start.random(w);
           if (start.checkForNegatives(w) == true) {
               w = 0;
           }
           start.numWatermelons(w);
           System.out.println();

           System.out.println("How many peaches would you like to buy? Enter 0 if you wish to not buy any peaches or enter -1 if you would like to buy a random number of peaches. \nQuantity: 25" );
           int p = s.nextInt();
           p = start.random(p);
           if (start.checkForNegatives(p) == true) {
               p = 0;
           }
           start.numPeaches(p);
           System.out.println();

           System.out.println("How many oranges would you like to buy? Enter 0 if you wish to not buy any oranges or enter -1 if you would like to buy a random number of oranges. \nQuantity: 25");
           int o = s.nextInt();
           o = start.random(o);
           if (start.checkForNegatives(o) == true) {
               o = 0;
           }
           start.numOranges(o);
           System.out.println();

           System.out.println("How many pomegranates would you like to buy? Enter 0 if you wish to not buy any pomegranates or enter -1 if you would like to buy a random number of pomegranates. \nQuantity: 25");
           int po = s.nextInt();
           po = start.random(po);
           if (start.checkForNegatives(po) == true) {
               po = 0;
           }
           start.numPomegranates(po);
           System.out.println();

           System.out.println("How many pears would you like to buy? Enter 0 if you wish to not buy any pears or enter -1 if you would like to buy a random number of pears. \nQuantity: 25");
           int pe = s.nextInt();
           pe = start.random(pe);
           if (start.checkForNegatives(pe) == true) {
               pe = 0;
           }
           start.numPears(pe);
           System.out.println();

           StoreSimulator trip1 = new StoreSimulator(a,b,w,p,o,po,pe);

           System.out.println(GREEN + "<-------------------------------------->");
           System.out.println("The Local Market");
           System.out.println("29 Fort Greene Pl, Brooklyn, NY 11217");
           System.out.println();
           System.out.println(start.apple +" apples - " + "$" + df.format(trip1.costApples(a,0.99)));
           System.out.println(start.banana +" bananas - " + "$" + df.format(trip1.costBananas(b,0.75)));
           System.out.println(start.watermelon +" watermelons - " + "$" + df.format(trip1.costWatermelons(w,3.50)));
           System.out.println(start.peach +" peaches - " + "$" + df.format(trip1.costPeaches(p,1.25)));
           System.out.println(start.orange +" oranges - " + "$" + df.format(trip1.costOranges(o,1.50)));
           System.out.println(start.pomegranate +" pomegranates - " + "$" + df.format(trip1.costPomegranates(o,3.50)));
           System.out.println(start.pear +" pears - " + "$" + df.format(trip1.costPears(o,0.99)));
           System.out.println();
           System.out.println("Net Cost: $" + df.format(trip1.getNetTotal()));
           System.out.println("<-------------------------------------->");

           st = false;
       }


    }
}
