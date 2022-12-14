import java.lang.String;
import java.text.DecimalFormat;
/**
 * The StoreSimulator class represents a simulation of the store. A simulation includes the number of apples, bananas, watermelons, peaches, oranges, pomegranates, and pears. It also includes the net total.
 */
public class StoreSimulator {
    private int apple;
    private int banana;
    private int watermelon;
    private int peach;
    private int orange;
    private int pomegranate;
    private int pear;
    private double netTotal;

    /**
     * This is used to round the costs of the items.
     */
    DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Constructor for the StoreSimulator class. This creates a new instance of a Simulation with or without the parameters below.
     */
    public StoreSimulator() {
    }

    public StoreSimulator(int apples, int bananas, int watermelons, int peaches, int oranges, int pomegranates, int pears ) {
        apple = apples;
        banana = bananas;
        watermelon = watermelons;
        peach = peaches;
        orange = oranges;
        pomegranate = pomegranates;
        pear = pears;
    }

    /**
     * willSimulationRun method for the StoreSimulator class. This method will return false if the user input is No, or return true if the user input is Yes.
     * @param answer a string representing the user's input about if the simulation will be ran or not.
     * @return returns true if the user enters yes to continue, returns false if not.
     */
    public boolean willSimulationRun(String answer) {
        String a = answer.toLowerCase();
        if (a.indexOf("yes") != -1) {
            return true;
        }
        return false;
    }

    /**
     * random method will generate a random number so the user can purchase a random number of items up to 25.
     * @param random an integer that represents if the user wishes to get a random number of items. User must enter -1 to generate a random number.
     * @return returns a random number from 1 to 25.
     */
    public int random(int random) {
        int randomNum = 0;
        if (random == -1) {
            randomNum = (int) (Math.random() * 25) + 1;
        } else {
            randomNum = random;
        }
        return randomNum;
    }

    /**
     * checkForNegatives method will check to see if the user input is a negative number.
     * @param response an integer that represents the user input for the amount of items they want to purchase.
     * @return returns true if the user input is negative, returns false if it is not negative.
     */
    public boolean checkForNegatives(int response) {
        String r = String.valueOf(response);
        int negative = r.indexOf("-");
        if (negative != -1) {
            return true;
        }
        return false;
    }

    /**
     * numApples method stores the amount of apples the user purchases to the apple variable.
     * @param amt an integer that represents the amount of apples the user bought
     */
    public void numApples(int amt) {
        apple = amt;
    }

    /**
     * numBananas method stores the amount of bananas the user purchases to the banana variable.
     * @param amt an integer that represents the amount of bananas the user bought
     */
    public void numBananas(int amt) {
        banana = amt;
    }

    /**
     * numWatermelons method stores the amount of watermelons the user purchases to the watermelon variable.
     * @param amt an integer that represents the amount of watermelons the user bought
     */
    public void numWatermelons(int amt) {
        watermelon = amt;
    }

    /**
     * numPeaches method stores the amount of peaches the user purchases to the peach variable.
     * @param amt an integer that represents the amount of peaches the user bought
     */
    public void numPeaches(int amt) {
        peach = amt;
    }

    /**
     * numOranges method stores the amount of oranges the user purchases to the orange variable.
     * @param amt an integer that represents the amount of oranges the user bought
     */
    public void numOranges(int amt) {
        orange = amt;
    }

    /**
     * numPomegranates method stores the amount of pomegranates the user purchases to the pomegranate variable.
     * @param amt an integer that represents the amount of pomegranates the user bought
     */
    public void numPomegranates(int amt) {
        pomegranate = amt;
    }

    /**
     * numPears method stores the amount of pears the user purchases to the pear variable.
     * @param amt an integer that represents the amount of pears the user bought
     */
    public void numPears(int amt) {
        pear = amt;
    }

    /**
     * costApples method adds the total cost of the apples with the netTotal and calculates the total cost of the apples.
     * @param apples represents the amount of apples the user bought
     * @param cost1 represents the cost of each apple.
     * @return returns the cost of the apples
     */
    public double costApples(int apples, double cost1) {
        double cost = 0;
        cost = cost1*apples;
        netTotal = netTotal + cost;
        return cost;
    }

    /**
     * costBananas method adds the total cost of the bananas with the netTotal and calculates the total cost of the bananas.
     * @param bananas represents the amount of bananas the user bought
     * @param cost2 represents the cost of each banana.
     * @return returns the cost of the bananas
     */
    public double costBananas(int bananas, double cost2) {
        double cost = 0;
        for (int counter =1; counter <= bananas; counter++) {
            cost = cost + cost2;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    /**
     * costWatermelons method adds the total cost of the watermelons with the netTotal and calculates the total cost of the watermelons.
     * @param watermelons represents the amount of watermelons the user bought
     * @param cost3 represents the cost of each watermelon.
     * @return returns the cost of the watermelons
     */
    public double costWatermelons(int watermelons, double cost3) {
        double cost = 0;
        for (int counter =1; counter <= watermelons; counter++) {
            cost = cost + cost3;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    /**
     * costPeaches method adds the total cost of the peaches with the netTotal and calculates the total cost of the peaches.
     * @param peaches represents the amount of peaches the user bought
     * @param cost4 represents the cost of each peach.
     * @return returns the cost of the peaches
     */
    public double costPeaches(int peaches, double cost4) {
        double cost = 0;
        for (int counter =1; counter <= peaches; counter++) {
            cost = cost + cost4;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    /**
     * costOranges method adds the total cost of the oranges with the netTotal and calculates the total cost of the oranges.
     * @param oranges represents the amount of oranges the user bought
     * @param cost5 represents the cost of each orange.
     * @return returns the cost of the oranges
     */
    public double costOranges(int oranges, double cost5) {
        double cost = 0;
        for (int counter =1; counter <= oranges; counter++) {
            cost = cost + cost5;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    /**
     * costPomegranates method adds the total cost of the pomegranates with the netTotal and calculates the total cost of the pomegranates.
     * @param pomegranates represents the amount of pomegranates the user bought
     * @param cost6 represents the cost of each pomegranate.
     * @return returns the cost of the pomegranates
     */
    public double costPomegranates(int pomegranates, double cost6) {
        double cost = 0;
        for (int counter =1; counter <= pomegranates; counter++) {
            cost = cost + cost6;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    /**
     * costPears method adds the total cost of the pears with the netTotal and calculates the total cost of the pears.
     * @param pears represents the amount of pears the user bought
     * @param cost7 represents the cost of each pear.
     * @return returns the cost of the pears
     */
    public double costPears(int pears, double cost7) {
        double cost = 0;
        for (int counter =1; counter <= pears; counter++) {
            cost = cost + cost7;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    /**
     * getNetTotal method returns the total cost.
     * @return returns total cost of all the users purchases.
     */
    public double getNetTotal() {
        return netTotal;
    }

    /**
     * toString for the StoreSimulator class. This method will return a receipt of the user's purchases.
     * @return returns a string with the user's purchases along with the total cost.
     */
    public String prices() {
        String design = "|-------------------------|";
        String apples = "Apple --> $0.99";
        String bananas = "Banana --> $0.75";
        String watermelons = "Watermelon --> $3.50";
        String peaches = "Peach --> $1.25";
        String oranges = "Orange --> $1.50";
        String pomegranates = "Pomegranate --> $3.50";
        String pears = "Pear --> $0.99";

        return design + "\n  " + apples + "\n  " + bananas + "\n  " +  watermelons +  "\n  " + peaches +"\n  "+ oranges +"\n  "+ pomegranates +"\n  "+ pears +"\n"+ design;
    }

    public String toString() {
        String a = apple + " apples - " + "$" + df.format(Math.round(costApples(apple, 0.99)*100.00)/100.00);
        String b = banana + " bananas - " + "$" + df.format(Math.round(costBananas(banana, 0.75)*100.00)/100.00);
        String c = watermelon + " watermelons - " + "$" + df.format(Math.round(costWatermelons(watermelon, 3.50)*100.00)/100.00);;
        String d = peach + " peaches - " + "$" + df.format(Math.round(costPeaches(peach, 1.25)*100.00)/100.00);
        String e = orange + " oranges - " + "$" + df.format(Math.round(costOranges(orange, 1.50)*100.00)/100.00);
        String f = pomegranate + " pomegranates - " + "$" + df.format(Math.round(costPomegranates(pomegranate, 3.50)*100.00)/100.00);
        String g = pear + " pears - " + "$" + df.format(Math.round(costPears(pear, 0.99)*100.00)/100.00);

        return a + "\n" + b + "\n" + c + "\n"  + d + "\n"  + e + "\n"  + f + "\n"  + g;

    }

}
