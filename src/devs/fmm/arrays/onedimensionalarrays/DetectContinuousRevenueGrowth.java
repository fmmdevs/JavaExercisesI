package devs.fmm.arrays.onedimensionalarrays;

import java.util.Arrays;
import java.util.Random;

public class DetectContinuousRevenueGrowth {
    static int count5PercentJumps(int[] dailyGains) {

        int yesterdayGains = dailyGains[0];
        int counter = 0;

        for (int i = 1; i < dailyGains.length; i++) {
            if (dailyGains[i] == 0) break;
            if (yesterdayGains < dailyGains[i] * 1.05) counter++;
            yesterdayGains = dailyGains[i];
        }
        return counter;
    }

    public static void main(String[] args) {

        int[] dailyGains = new int[31];
        int[] dailyGainsPlus5 = new int[31];
        Random random = new Random();
        for (int i = 0; i < 31; i++) {
            dailyGains[i] = random.nextInt(500, 10000);
            dailyGainsPlus5[i] = (int) Math.round(dailyGains[i] * 1.05);
        }

        System.out.println(Arrays.toString(dailyGainsPlus5));
        System.out.println(Arrays.toString(dailyGains));

        System.out.println(count5PercentJumps(dailyGains));
    }
}
