///Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
//Level: Medium

public class CarPoolingSolution {
    private static boolean carPooling(int[][] trips, int capacity) {
        int[] stationsCapacity = new int[1000];

        for (int[] trip : trips) {
            stationsCapacity[trip[1]] += trip[0];   //Passengers pocked in this station
            stationsCapacity[trip[2]] -= trip[0];   //Passengers dropped in this station
        }

        //Check the stations one by one
        for (int station : stationsCapacity) {
            capacity -= station;
            if (capacity < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] testCase = {{2, 2, 6}, {2, 4, 7}, {8, 6, 7}};
        boolean result = carPooling(testCase, 11);
        System.out.println(result);
    }
}
