import java.util.Scanner;
public class StoreSimulatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Walmart! We now only sell apples, bananas, watermelons, peaches, oranges, pomegranates, and pears.");
        System.out.println();

        System.out.println("How many apples would you like to buy? Each apple costs $0.99. Enter 0 if you wish to not buy any apples.");
        int a = s.nextInt();
        System.out.println();

        System.out.println("How many bananas would you like to buy? Each banana costs $0.75. Enter 0 if you wish to not buy any bananas.");
        int b = s.nextInt();
        System.out.println();

        System.out.println("How many watermelons would you like to buy? Each watermelon costs $3.50. Enter 0 if you wish to not buy any watermelons.");
        int w = s.nextInt();
        System.out.println();

        System.out.println("How many peaches would you like to buy? Each peach costs $1.25. Enter 0 if you wish to not buy any peach.");
        int p = s.nextInt();
        System.out.println();

        System.out.println("How many oranges would you like to buy? Each orange costs $1.50. Enter 0 if you wish to not buy any orange.");
        int o = s.nextInt();
        System.out.println();

        System.out.println("How many pomegranates would you like to buy? Each pomegranate costs $3.50. Enter 0 if you wish to not buy any pomegranates.");
        int po = s.nextInt();
        System.out.println();

        System.out.println("How many pears would you like to buy? Each pear costs $0.99. Enter 0 if you wish to not buy any pears.");
        int pe = s.nextInt();
        System.out.println();

        StoreSimulator trip1 = new StoreSimulator(a,b,w,p,o,po,pe);

        System.out.println("-------------------------");
        System.out.println("Walmart");
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
        System.out.println("Net Cost: " + (trip1.costApples(a,0.99) + trip1.costBananas(b,0.75) +trip1.costWatermelons(w,3.50) + trip1.costPeaches(p,1.25) + trip1.costOranges(o,1.50) + trip1.costPomegranates(o,3.50) +  trip1.costPears(o,0.99)));

    }
}
