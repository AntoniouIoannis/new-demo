package gr.aueb.cf6.myJavaProjects;

import java.util.Scanner;

public class AllroundUnitConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
   /*  ΑΡΧΗ ΕΛΕΓΧΟΥ ΕΠΙΛΟΓΗΣ    ΚΑΙ ΠΡΟΟΔΟΥ ΠΡΟΓΡΑΜΜΑΤΟΣ*/

            }




    //  https://www.unitconverters.net/    Length / Temp / Area / Volume / Weight / Time



        /*TimeFromSeconds();
        CurrencyConvert();*/
    }

    public static void Temperature(int){
        /*  Τ(κ) = =τ(c)+ 2731,15      &  T(k)= (5  * ( valueFahrenheit - 32 ) / 9) + 273,15      */
        Scanner Temper = new Scanner(System.in);
        int valueFahrenheit = 0;

        System.out.print("Δώσε την τιμή θερμοκρασίας Fahrenheit σε ακέραια μορφή:  ");
        valueFahrenheit = in.nextInt();
        int valueCelsiou = 0;
        float valueKelvin = 0.0;

        final int CELSIOU_CONVERSION = 5 * (valueFahrenheit - 32) / 9;
        final float KELVIN_CONVERSION = (5 * (valueFahrenheit - 32) / 9) + 273.15;
        valueCelsiou = CELSIOU_CONVERSION;
        valueKelvin = KELVIN_CONVERSION;

        System.out.printf("\nΈδωσες την τιμή %d  βαθμούς Fahrenheit που ισοδυναμεί με %d βαθμούς Κελσίου \n", valueFahrenheit, valueCelsiou);
        System.out.println("\n\nΟι δοκιμές για τον έλεγχο ορθότητας του προγράμματος έγινε με την υποστήιξη της ιστοσελίδας\n https://www.metric-conversions.org/el/temperature/fahrenheit-to-celsius.htm");
        System.out.printf("\nEND OF PROGRAMM Temperature \n\n");
    }


    public static void TimeFromSeconds() {
        Scanner CalcToDate = new Scanner(System.in);

        final int secs_per_Minute = 60;
        final int secs_per_Hour = 60 * 60;
        final  int secs_per_Day = 24 * 60 * 60;

        int days = 0, hours = 0, minutes = 0, totalSeconds = 0, remainingSeconds = 0;

        System.out.print("\nPlease insert total seconds:  ");
        totalSeconds = CalcToDate.nextInt();

        days = totalSeconds / secs_per_Day;
        remainingSeconds = totalSeconds % secs_per_Day;

        hours = remainingSeconds / secs_per_Hour;
        remainingSeconds = remainingSeconds % secs_per_Hour;

        minutes = remainingSeconds /secs_per_Minute;
        remainingSeconds = remainingSeconds % secs_per_Minute;

        System.out.printf("\nTotal Seconds given by User: %,d\nDays: %d,  Hours: %02d,  Minutes: %02d, Seconds: %02d\n",
                totalSeconds, days, hours, minutes, remainingSeconds);
        System.out.printf("\nEND OF PROGRAMM TimeFromSeconds \n\n");
    }


    public static void CurrencyConvert() {
        Scanner giveEuros = new Scanner(System.in);

        int euros = 0, dollars = 0, totalCents = 0, remainingCents = 0, lr = 0, fr = 0, yien = 0;
        final int US_PARITY = 99;
        final int LR_PARITY = 99;
        final int YIEN_PARITY = 99;
        final int FR_PARITY = 99;

        System.out.print("\nPLease insert the amount in Euros: ");
//        εδω θα ενημερωσουμε το συστημα οτι θα δεχτει απο χρηστη δεδομένα
        euros = giveEuros.nextInt();

        totalCents = euros * US_PARITY;  /*   για να δουμε ποσα δολαρια ειναι  */
        totalLires = euros * LR_PARITY;  /*   για να δουμε ποσα δολαρια ειναι  */
        totalYien = euros * YIEN_PARITY;  /*   για να δουμε ποσα δολαρια ειναι  */
        totalFrago = euros * FR_PARITY;  /*   για να δουμε ποσα δολαρια ειναι  */
        dollars = totalCents / 100;
        lr = totalLires / 100;
        yien = totalYien / 100;
        fr = totalFrago / 100;
        remainingCents = dollars % 100;


        System.out.printf("\n%,d euros = %,d total Cents\n%,d dollars and %d cents \n\n", euros, totalCents, dollars, remainingCents);
        System.out.printf("\n%,d euros = %,d total Cents\n%,d dollars and %d cents \n\n", euros, totalLires, lr, remainingCents);
        System.out.printf("\n%,d euros = %,d total Cents\n%,d dollars and %d cents \n\n", euros, totalYien, yien, remainingCents);
        System.out.printf("\n%,d euros = %,d total Cents\n%,d dollars and %d cents \n\n", euros, totalFrago, fr, remainingCents);
        System.out.printf("\nEND OF PROGRAMM CURRENCY \n\n");

    }



}
