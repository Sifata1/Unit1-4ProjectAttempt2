import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.round;

public class StoreSimulatorRunner {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        StoreSimulator start = new StoreSimulator();

        System.out.println("Welcome to The Local Market! Below are our items and prices.");
        System.out.println(start.pricesToString());
        System.out.println();

        System.out.println("How many apples would you like to buy? Enter 0 if you wish to not buy any apples or enter -1 if you would like to buy a random number of apples .");
        int a = s.nextInt();
        a = start.random(a);
        System.out.println();

        System.out.println("How many bananas would you like to buy? Each banana costs $0.75. \n Enter 0 if you wish to not buy any bananas. Enter -1 if you would to buy a randomly generated amount of bananas. \n Note that the maximum number of bananas is 100.");
        int b = s.nextInt();
        b = start.random(b);
        System.out.println();

        System.out.println("How many watermelons would you like to buy? Each watermelon costs $3.50. Enter 0 if you wish to not buy any watermelons.");
        int w = s.nextInt();
        w = start.random(w);
        System.out.println();

        System.out.println("How many peaches would you like to buy? Each peach costs $1.25. Enter 0 if you wish to not buy any peach.");
        int p = s.nextInt();
        p = start.random(p);
        System.out.println();

        System.out.println("How many oranges would you like to buy? Each orange costs $1.50. Enter 0 if you wish to not buy any orange.");
        int o = s.nextInt();
        o = start.random(o);
        System.out.println();

        System.out.println("How many pomegranates would you like to buy? Each pomegranate costs $3.50. Enter 0 if you wish to not buy any pomegranates.");
        int po = s.nextInt();
        po = start.random(po);
        System.out.println();

        System.out.println("How many pears would you like to buy? Each pear costs $0.99. Enter 0 if you wish to not buy any pears.");
        int pe = s.nextInt();
        pe = start.random(pe);
        System.out.println();

        StoreSimulator trip1 = new StoreSimulator(a,b,w,p,o,po,pe);

        System.out.println("<-------------------------------------->");
        System.out.println("The Local Market");
        System.out.println("29 Fort Greene Pl, Brooklyn, NY 11217");
        System.out.println();
        System.out.println(a +" apples - " + "$" + trip1.costApples(a,0.99));
        System.out.println(b +" bananas - " + "$" + trip1.costBananas(b,0.75));
        System.out.println(w +" watermelons - " + "$" + trip1.costWatermelons(w,3.50));
        System.out.println(p +" peaches - " + "$" + trip1.costPeaches(p,1.25));
        System.out.println(o +" oranges - " + "$" + trip1.costOranges(o,1.50));
        System.out.println(po +" pomegranates - " + "$" + trip1.costPomegranates(o,3.50));
        System.out.println(pe +" pears - " + "$" + trip1.costPears(o,0.99));
        System.out.println();
        System.out.println("Net Cost: " + df.format(trip1.getNetTotal()));
        System.out.println("<-------------------------------------->");

    }
}
