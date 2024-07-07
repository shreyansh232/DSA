package Math;

public class WaterBottle {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        while(numBottles >= numExchange){
            int exchanged = numBottles / numExchange;
            int extraEmpty = numBottles % numExchange;
            totalBottles += exchanged;
            numBottles = exchanged + extraEmpty;
        }
        return totalBottles;
    }

    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        System.out.println(numWaterBottles(x, y));
    }

}
