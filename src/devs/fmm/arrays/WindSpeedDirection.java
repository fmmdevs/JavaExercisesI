package devs.fmm.arrays;

import java.util.Random;

public class WindSpeedDirection {

    public static void main(String[] args) {

        int[] windSpeed = new int[3];
        int[] windDirection = new int[3];

        Random random = new Random();

        for(int i =0; i<3 ;i++){
            windSpeed[i]= random.nextInt(200);
            windDirection[i]= random.nextInt(360);
            if(i==2){
                System.out.print("Wind speed "+ windSpeed[i]+ " km/h " + "and wind direction "+ windDirection[i]+ "º");

            } else {
                System.out.print("Wind speed "+ windSpeed[i]+ " km/h " + "and wind direction "+ windDirection[i]+ "º, ");

            }
        }




    }
}
