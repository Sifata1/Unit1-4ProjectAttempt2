import static java.lang.Math.*;
import java.lang.String;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class StoreSimulator {

    private int apple;
    private int banana;
    private int watermelon;
    private int peach;
    private int orange;
    private int pomegranate;
    private int pear;
    private double netTotal;

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

    public boolean willSimulationRun(String answer) {
        String a = answer.toLowerCase();
        if (a.equals("yes")) {
            return true;
        }
        return false;
    }

    public String changeNumItems() {
        return "Would you like to input another number of apples?";
    }

    public int random(int random) {
        int randomNum = 0;
        if (random == -1) {
            randomNum = (int) (Math.random() * 25) + 1;
        } else {
            randomNum = random;
        }
        return randomNum;
    }

    public boolean checkForNegatives(int response) {
        String r = String.valueOf(response);
        int negative = r.indexOf("-");
        if (negative != -1) {
            return true;
        }
        return false;
    }

    public double costApples(int apples, double cost1) {
        double cost = 0;
        for (int counter =1; counter <= apples; counter++) {
            cost = cost + cost1;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    public double costBananas(int bananas, double cost2) {
        double cost = 0;
        for (int counter =1; counter <= bananas; counter++) {
            cost = cost + cost2;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    public double costWatermelons(int watermelons, double cost3) {
        double cost = 0;
        for (int counter =1; counter <= watermelons; counter++) {
            cost = cost + cost3;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    public double costPeaches(int peaches, double cost4) {
        double cost = 0;
        for (int counter =1; counter <= peaches; counter++) {
            cost = cost + cost4;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    public double costOranges(int oranges, double cost5) {
        double cost = 0;
        for (int counter =1; counter <= oranges; counter++) {
            cost = cost + cost5;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    public double costPomegranates(int pomegranates, double cost6) {
        double cost = 0;
        for (int counter =1; counter <= pomegranates; counter++) {
            cost = cost + cost6;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    public double costPears(int pears, double cost7) {
        double cost = 0;
        for (int counter =1; counter <= pears; counter++) {
            cost = cost + cost7;
        }
        netTotal = netTotal + cost;
        return cost;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public String pricesToString() {
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

}
