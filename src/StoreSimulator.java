public class StoreSimulator {

    private int apple;
    private int banana;
    private int watermelon;
    private int peach;
    private int orange;
    private int pomegranate;
    private int pear;


    public StoreSimulator(int apples, int bananas, int watermelons, int peaches, int oranges, int pomegranates, int pears ) {
        apple = apples;
        banana = bananas;
        watermelon = watermelons;
        peach = peaches;
        orange = oranges;
        pomegranate = pomegranates;
        pear = pears;
    }

    public double costApples(int apples, double cost1) {
        double cost = (apples)*(cost1);
        return cost;
    }
    public double costBananas(int bananas, double cost2) {
        double cost = (bananas)*(cost2);
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

}
