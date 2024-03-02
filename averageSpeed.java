package soloPractice;

import java.util.Scanner;

public class averageSpeed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int minutes = scn.nextInt();
        int seconds = scn.nextInt();
        float distance = scn.nextFloat();

        float hours = (minutes * 60 + seconds) / (float)(Math.pow(60, 2));
        float miles = (float)(distance / 1.6);
        System.out.printf("%.1f", (float)(miles/hours));
        System.out.println();
        scn.close();

    }
}
