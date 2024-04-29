import java.util.Scanner;

public class MainUnitConverter {
    public static void main(String[] args) {

        int choice;
        
          System.out.println("+---------------------------------------------------------------------+");
          System.out.println("|               Ανά Οικογένεια / ανά Τύπο Μονάδας                     |");
          System.out.println("+---------------------------------------------------------------------+");
          System.out.println("|1. Διάσταση [ Επιφάνεια,    Μήκος,    Όγκος ]                        |");
          System.out.println("|2. Ενέργεια [ Ενέργεια,    Θερμοκρασία,    Ισχύς ]                   |");
          System.out.println("|3. ΕπιστήμηΥπολογιστών [ Αποθήκευση δεδομένων ]                      |");
          System.out.println("|4. Κίνηση  [ Επιτάχυνση,    Ταχύτητα,    Ταχύτητα ανέμου ]           |");
          System.out.println("|5. Μηχανική [Βάρος,    Δείκτης Μάζας Σώματος,    Δύναμη,    Ροπή ]   |");
          System.out.println("|6. Νόμισμα [ Δολλάριο / Λίρα / Ευρώ / Γιέν ]                         |");
          System.out.println("|7. Ώρα  [  Ζώνες χρόνου,    Ώρα ]                                    |");
          System.out.println("+---------------------------------------------------------------------+");
          System.out.println("|8. ΕΞΟΔΟΣ ΕΦΑΡΜΟΓΗΣ                                                  |");
          System.out.println("|9. Δημιουργός                                                        |");
          System.out.println("|10. Περί Εφαρμογής...                                                |");
          System.out.println("+---------------------------------------------------------------------+");

      //https://www.convertworld.com/el/

        choice = in.nextInt();
        //  https://www.unitconverters.net/    Length / Temp / Area / Volume / Weight / Time
        System.out.println("You pick [ " + choice + ". ].");


        /*  ΑΡΧΗ ΕΛΕΓΧΟΥ ΕΠΙΛΟΓΗΣ    ΚΑΙ ΠΡΟΟΔΟΥ ΠΡΟΓΡΑΜΜΑΤΟΣ*/
        (int choice) {
            if (choice < 1 || choice > 8) {
                System.out.println("Error. try again ...");
                isError = true;
                return 0;
            }
            int num1 = 0;          int num2 = 0;            num1 = getOneInt();          num2 = getOneInt();
            switch (choice) {
                case 1:
                    return Temperature();
                case 2:
                    return
                case '3':
                    return mul(num1, num2);
                case '4':
                    return div(num1, num2);
                case '5':
                    return mod(num1, num2);
                default:
                    System.out.println("Error. Try again ...");
                    isError = true;
                    return 0;
            }


  }
    
        System.out.println("\n*********************************************************************");
        System.out.println("* Καλώς Όρισες χρήστη στην Ενοποιημένη Εφαρμογή Μετατροπής Μονάδων  *");    
        System.out.println("*********************************************************************");

        
    public static void Temperature(){
        /*  Τ(κ) = =τ(c)+ 2731,15      &  T(k)= (5  * ( valueFahrenheit - 32 ) / 9) + 273,15      */
        Scanner Temper = new Scanner(System.in);
        int valueFahrenheit = 0;

        System.out.print("Δώσε την τιμή θερμοκρασίας Fahrenheit σε ακέραια μορφή:  ");
        valueFahrenheit = in.nextInt();
        int valueCelsiou = 0;
        float valueKelvin = 0;

        final int CELSIOU_CONVERSION = 5 * (valueFahrenheit - 32) / 9;
        final double KELVIN_CONVERSION = (5 * (valueFahrenheit - 32) / 9) + 273.15;
        int valueCelsiou = CELSIOU_CONVERSION;
        double  valueKelvin = KELVIN_CONVERSION;

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


    public static void CurrencyConvert(); {
        Scanner giveEuros = new Scanner(System.in);

        int euros = 0, dollars = 0, totalCents = 0, remainingCents = 0, lr = 0, fr = 0, yien = 0;
        final int US_PARITY = 99;
        final int LR_PARITY = 99;
        final int YIEN_PARITY = 99;
        final int FR_PARITY = 99;

        System.out.print("\nPLease insert the amount in Euros: ");
        // εδω θα ενημερωσουμε το συστημα οτι θα δεχτει απο χρηστη δεδομένα
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
