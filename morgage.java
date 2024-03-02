package soloPractice;

import java.text.NumberFormat;
import java.util.Scanner;

public class morgage {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int principal = scn.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scn.nextFloat();
        float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int years = scn.nextInt();
        
        int months = years * MONTHS_IN_YEAR;

        double morgage = principal
                     * (monthlyInterest * Math.pow((1 + monthlyInterest), months))
                     / (Math.pow((1 + monthlyInterest), months) - 1);

    
        System.out.print("Morgage: " + NumberFormat.getCurrencyInstance().format(morgage));
        System.out.println();
        scn.close();

    }


}