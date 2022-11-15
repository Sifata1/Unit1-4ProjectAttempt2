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
        System.out.println("Are you ready to begin? Enter yes to begin.");
        String answer = s.nextLine();

       while (start.willSimulationRun(answer) == true) {

       }

        System.out.println("How many apples would you like to buy? Enter 0 if you wish to not buy any apples or enter -1 if you would like to buy a random number of apples. \nQuantity: 25");
        int a = s.nextInt();
        a = start.random(a);
        System.out.println();

        System.out.println("How many bananas would you like to buy? Enter 0 if you wish to not buy any bananas or enter -1 if you would like to buy a random number of bananas. \nQuantity: 25");
        int b = s.nextInt();
        b = start.random(b);
        System.out.println();

        System.out.println("How many watermelons would you like to buy? Enter 0 if you wish to not buy any watermelons or enter -1 if you would like to buy a random number of watermelons. \nQuantity: 25");
        int w = s.nextInt();
        w = start.random(w);
        System.out.println();

        System.out.println("How many peaches would you like to buy? Enter 0 if you wish to not buy any peaches or enter -1 if you would like to buy a random number of peaches. \nQuantity: 25");
        int p = s.nextInt();
        p = start.random(p);
        System.out.println();

        System.out.println("How many oranges would you like to buy? Enter 0 if you wish to not buy any oranges or enter -1 if you would like to buy a random number of oranges. \nQuantity: 25");
        int o = s.nextInt();
        o = start.random(o);
        System.out.println();

        System.out.println("How many pomegranates would you like to buy? Enter 0 if you wish to not buy any pomegranates or enter -1 if you would like to buy a random number of pomegranates. \nQuantity: 25");
        int po = s.nextInt();
        po = start.random(po);
        System.out.println();

        System.out.println("How many pears would you like to buy? Enter 0 if you wish to not buy any pears or enter -1 if you would like to buy a random number of pears. \nQuantity: 25");
        int pe = s.nextInt();
        pe = start.random(pe);
        System.out.println();

        StoreSimulator trip1 = new StoreSimulator(a,b,w,p,o,po,pe);

        System.out.println("<-------------------------------------->");
        System.out.println("The Local Market");
        System.out.println("29 Fort Greene Pl, Brooklyn, NY 11217");
        System.out.println();
        System.out.println(a +" apples - " + "$" + df.format(trip1.costApples(a,0.99)));
        System.out.println(b +" bananas - " + "$" + df.format(trip1.costBananas(b,0.75)));
        System.out.println(w +" watermelons - " + "$" + df.format(trip1.costWatermelons(w,3.50)));
        System.out.println(p +" peaches - " + "$" + df.format(trip1.costPeaches(p,1.25)));
        System.out.println(o +" oranges - " + "$" + df.format(trip1.costOranges(o,1.50)));
        System.out.println(po +" pomegranates - " + "$" + df.format(trip1.costPomegranates(o,3.50)));
        System.out.println(pe +" pears - " + "$" + df.format(trip1.costPears(o,0.99)));
        System.out.println();
        System.out.println("Net Cost: $" + df.format(trip1.getNetTotal()));
        System.out.println("<-------------------------------------->");

    }
}
