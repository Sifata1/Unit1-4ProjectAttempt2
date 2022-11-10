import java.util.Scanner;
public class StoreSimulatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Walmart! We now only sell apples, bananas, watermelons, peaches, oranges, pomegranates, and pears.");
        System.out.println("Are you ready to begin!");
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

        System.out.println("To confirm, you bought: ");
        System.out.println(trip1.Apples(a) + " apples");

        System.out.println("-------------------------");
        System.out.println("Walmart");
        System.out.println("29 Fort Greene Pl, Brooklyn, NY 11217");
        System.out.println();
        System.out.println(a +" apples - " + "$" + (0.99*a));
    }
}
