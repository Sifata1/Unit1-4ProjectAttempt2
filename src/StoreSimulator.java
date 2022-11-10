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

    public String apples(int apples) {
        double cost = (apples * 0.99);
        return "You have bought " + apples + "apples with " + cost;
    }


}
