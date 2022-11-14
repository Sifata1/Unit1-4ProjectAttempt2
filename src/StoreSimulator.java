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

    public int random(int random) {
        int randomNum = 0;
        if (random == -1) {
            randomNum = (int) (Math.random() * 100) + 1;
        } else {
            randomNum = random;
        }
        return randomNum;
    }

    public double costApples(int apples, double cost1) {
        double cost = (apples)*(cost1);
        netTotal = netTotal + cost;
        return cost;
    }
    public double costBananas(int bananas, double cost2) {
        double cost = (bananas)*(cost2);
        netTotal = netTotal + cost;
        return cost;
    }

    public double costWatermelons(int watermelons, double cost3) {
        double cost = (watermelons)*(cost3);
        netTotal = netTotal + cost;
        return cost;
    }

    public double costPeaches(int peaches, double cost4) {
        double cost = (peaches)*(cost4);
        netTotal = netTotal + cost;
        return cost;
    }

    public double costOranges(int oranges, double cost5) {
        double cost = (oranges)*(cost5);
        netTotal = netTotal + cost;
        return cost;
    }

    public double costPomegranates(int pomegranates, double cost6) {
        double cost = (pomegranates)*(cost6);
        netTotal = netTotal + cost;
        return cost;
    }

    public double costPears(int pears, double cost7) {
        double cost = (pears)*(cost7);
        netTotal = netTotal + cost;
        return cost;
    }

    public String apples(int apples) {
        double cost = (apples * 0.99);
        return "You have bought " + apples + "apples with " + (cost*apples);
    }

    public String bananas(int bananas) {
        double cost = (bananas * 0.75);
        return "You have bought " + bananas + "apples with " + (cost*bananas);
    }

    public String toString() {
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
