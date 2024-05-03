import java.util.Scanner;

public class MainUnitConverter {
    public static void main(String[] args) {
        Title();
        MainList();
        RandomValue();
        Currency();
        TimeFromSeconds();
        EightTimes();
        AboutApp();
        
    }
    public static void Title(){
        System.out.println("\n********************************************************************");
        System.out.println("*    Καλώς Όρισες στην Ενοποιημένη Εφαρμογή Μετατροπής Μονάδων      *");    
        System.out.println("*    Καλώς Όρισες στην ΕΝΟΠΟΙΗΜΕΝΗ ΕΦΑΡΜΟΓΗ ΜΕΤΑΤΡΟΠΗΣ ΜΟΝΑΔΩΝ      *");    
        System.out.println("*********************************************************************");
    }
    public static void MainList(){
         System.out.println("+---------------------------------------------------------------------+");
         System.out.println("|               Ανά Οικογένεια / ανά Τύπο Μονάδας                     |");
         System.out.println("+---------------------------------------------------------------------+");
         System.out.println("|1. Διάσταση [ Επιφάνεια,    Μήκος,    Όγκος ]                        |");
         System.out.println("|2. Ενέργεια [ Ενέργεια,    Θερμοκρασία,    Ισχύς ]                   |");
         System.out.println("|3. ΕπιστήμηΥπολογιστών [ Αποθήκευση δεδομένων ]                      |");
         System.out.println("|4. Κίνηση [ Επιτάχυνση,    Ταχύτητα,    Ταχύτητα ανέμου ]            |");
         System.out.println("|5. Υγεία [Βάρος,    Δείκτης Μάζας Σώματος ]                          |");
         System.out.println("|6. Μηχανική [Βάρος,    Δύναμη,    Ροπή ]                             |");
         System.out.println("|7. Νόμισμα [ Δολλάριο / Λίρα / Ευρώ / Γιέν ]                         |");
         System.out.println("|8. Ώρα  [  Ζώνες χρόνου,    Ώρα ]                                    |");
         System.out.println("+---------------------------------------------------------------------+");
         System.out.println("|9. ΕΞΟΔΟΣ ΕΦΑΡΜΟΓΗΣ                                                  |");
         System.out.println("|10. Δημιουργός                                                        |");
         System.out.println("|11. Περί Εφαρμογής...                                                |");
         System.out.println("+---------------------------------------------------------------------+");
    }
    public static void AboutApp(){
        System.out.println("  Η εφαρμογή δημιουργήθηκε για εκπαιδευτικούς λόγους για λόγους αυτοεξέλιξης");
        System.out.println("και αυτοβελτίωσης των υπαρχόντων γνώσεών μου, όπου και κατά το τρέχων διάστημα");  
        System.out.println("είμαι σπουδαστής του ΚΕ.ΔΙ.ΒΙ.Μ. του Οικονομικού  Πανεπιστήμιου Αθηνών ");
        System.out.println("στο πρόγραμμα Coding Factory. ");
        System.out.println("\nΤο πρόγραμμα θα ανανεώνετε και θα βελτιώνετε σύμφωνα με τις προσεχείς γνώσεις ");
        System.out.println("που θα λαμβάνω κατά την διάρκεια του άνωθεν τρέχοντος προγράμματος.");
        System.out.println("\nΣκοπός του προγράμματος είναι η υποθετική συνεργασία με συνάδελφους προγραμματιστές");
        System.out.println("οπότε και θα πρέπει να «τοποθετώ» ουσιαστικά σχόλια στον κώδικά μου που θα μπορώ να");
        System.out.println("ξαναθυμάμαι και εγώ σε βάθος χρόνου και να είναι κατανοητά και στους υποτιθέμενους ");
        System.out.println("συνάδελφους σε περίπτωση collaboration οποιουδήποτε project σε team work.");
        System.out.println("\nΑποσκοπεί επίσης και σε μια πιθανή επίδειξη γνώσεων και δεξιοτήτων μου στην τρέχουσα");
        System.out.println("γλώσσα δημιουργίας του project για οποιονδήποτε πιθανό εργοδότη μου.");
        System.out.println("\n_________________\nH εφαρμογή δεν αποτελεί πλήρη οδηγό Μετατροπής Μονάδων, παρ' όλα αυτά όμως,");
        System.out.println("είναι ελεγμένο και θα είναι πάντα υπό έλεγχο κατά την πρόοδο του ώστε να διασφαλίζω");
        System.out.println("-σύμφωνα με τους ελέγχους μου- την ορθότητα και ακρίβειά του.");
        System.out.println("\nΤο πρόγραμμα καλύπτει της τεχνικές απαιτήσεις επαναληψιμότητας που καλά είναι να έχει");
        System.out.println("ένας κώδικας και τους ελέγχους αποτελεσματικότητας σύμφωνα με προβλεπόμενα αποτελέσματα,");
        System.out.println("ακολουθώντας πάντα και την βέλτιστη απλότητα και κατανόηση στην σύνταξή του!");
        System.out.println("\n\nΟ Δημιουργός\n___________________\nΑντωνίου Ιωάννης");
    }

    public static void RandomValue() {

    
        int intValue = (int) (Math.random() * 16) + 1;
        float floatValue = (float) (Math.random() * 6) + 1;

        System.out.printf("(%d, %.3f)", intValue, floatValue);
    }


    public static void OneDimension(){}
    public static void Area(){}
    public static void Length(){}
    public static void Volume (){}
    
    public static void TwoEnergy(){}
    public static void Temperature(){
        /*  Τ(κ) = =τ(c)+ 2731,15      &  T(k)= (5  * ( valueFahrenheit - 32 ) / 9) + 273,15      */
        Scanner Temper = new Scanner(System.in);
        int valueFahrenheit = 0;

        System.out.print("Δώσε την τιμή θερμοκρασίας Fahrenheit σε ακέραια μορφή:  ");
        valueFahrenheit = Temper.nextInt();
        int valueCelsiou = 0;
        double valueKelvin = 0.0;

        final int CELSIOU_CONVERSION = 5 * (valueFahrenheit - 32) / 9;
        final double KELVIN_CONVERSION = (5.0 * (valueFahrenheit - 32.0) / 9.0) + 273.15;
        valueCelsiou = CELSIOU_CONVERSION;
        valueKelvin = KELVIN_CONVERSION;

        System.out.printf("\nΈδωσες την τιμή %d  βαθμούς Fahrenheit που ισοδυναμεί με %d βαθμούς Κελσίου \n", valueFahrenheit, valueCelsiou);
        System.out.println("\n\nΟι δοκιμές για τον έλεγχο ορθότητας του προγράμματος έγινε με την υποστήιξη της ιστοσελίδας\n https://www.metric-conversions.org/el/temperature/fahrenheit-to-celsius.htm");
        System.out.printf("\nEND OF PROGRAM Temperature \n\n");
    }
    
    public static void ThreeComputerScience(){}
    public static void DataStorage(){}

    public static void FourMovement(){}
    public static void Movement(){}
    public static void Acceleration(){}
    public static void Speed(){}
    public static void WindSpeed(){}

    public static void FiveHealth(){}
    public static void Weight(){} 
    public static void BodyMassIndex(){}
    
    public static void SixEngineering(){}
    public static void Weight(){}
    public static void Force(){}
    public static void Torque(){}
    
    public static void SevenCurrency(){
        Scanner giveEuros = new Scanner(System.in);

        double eurosEUR = 0.00, dollarsUSD = 0.00, liraGBP = 0.00;
        double fragoCHF = 0.00, yienJPY = 0.00, youanCNY = 0.00, roubliRUB = 0.00;

        //  Ισοτιμίες νομισμάτων την ημερα Δευτέρα 29 Απριλίου Πηγή απο https://www.synallagma.gr/
        final double USD_PARITY = 1.0723;   // Δολλάριο ΗΠΑ (USD)
        final double GLR_PARITY = 0.8535;   // Λίρα Αγγλίας (GBP)
        final double CHF_PARITY = 0.9761;   // Φράγκο Ελβετίας (CHF)
        final double JPY_PARITY = 167.41;      //  Γιέν Ιαπωνίας (JPY)
        final double CNY_PARITY = 7.7622;       //  Γουάν Κίνας (CNY)
        final double RUB_PARITY = 100.81;      //  Ρούβλι Ρωσίας (RUB)


        System.out.print("\nΔώστε παρακαλώ το ποσό σε Ευρώ: ");
//        εδω θα ενημερωσουμε το συστημα οτι θα δεχτει απο χρηστη δεδομένα
        eurosEUR = giveEuros.nextDouble();

        dollarsUSD = eurosEUR * USD_PARITY;  /*   για να δουμε ποσα Δολλάριο ΗΠΑ (USD) ειναι  */
        liraGBP = eurosEUR * GLR_PARITY;  /*   για να δουμε ποσα Λίρα Αγγλίας (GBP) ειναι  */
        fragoCHF = eurosEUR * CHF_PARITY;  /*   για να δουμε ποσα Φράγκο Ελβετίας (CHF) ειναι  */
        yienJPY = eurosEUR * JPY_PARITY;  /*   για να δουμε ποσα Γιέν Ιαπωνίας (JPY) ειναι  */
        youanCNY = eurosEUR * CNY_PARITY;  /*   για να δουμε ποσα Γουάν Κίνας (CNY) ειναι  */
        roubliRUB = eurosEUR * RUB_PARITY;  /*   για να δουμε ποσα Ρούβλι Ρωσίας (RUB) ειναι  */


        System.out.printf("Έδωσες το ποσό των [ %.2f ].\nΚατά την τρέχουσα ημέρα η ισοτιμία του με τα κάτωθι νομίσματα είναι:\n", eurosEUR);
        System.out.printf("[ %.2f euros ] = [ %.4f ] Δολλάριο ΗΠΑ (USD)\n", eurosEUR, dollarsUSD);
        System.out.printf("\n[ %.2f euros ] = [ %.4f ] Λίρα Αγγλίας (GBP)\n", eurosEUR, liraGBP);
        System.out.printf("\n[ %.2f euros ] = [ %.4f ] Φράγκο Ελβετίας (CHF)\n", eurosEUR, fragoCHF);
        System.out.printf("\n[ %.2f euros ] = [ %.4f ] Γιέν Ιαπωνίας (JPY)\n", eurosEUR, yienJPY);
        System.out.printf("\n[ %.2f euros ] = [ %.4f ] Γουάν Κίνας (CNY)\n", eurosEUR, youanCNY);
        System.out.printf("\n[ %.2f euros ] = [ %.4f ] Ρούβλι Ρωσίας (RUB)\n", eurosEUR, roubliRUB);

        System.out.println("\nEND OF PROGRAM CURRENCY \n");
    }
    public static void Dollar(){}
    public static void PoundEuroYen(){}

    public static void EightTimes(){}
    public static void TimeZones(){}
    public static void Time(){
        public static void TimeFromMinutes() {
        Scanner getMinutes = new Scanner(System.in);

        int RandomMinutes = (int) (Math.random() * 999999) + 10000;  // min 10.000 - max 999.999
            
        final int MS_PER_SECS = 1000;
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;

        int ms = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int totalSeconds = 0;
        int remainingSeconds = 0;

        System.out.print("Δώσε παρακαλώ την διάρκεια του χρόνου σε Λεπτά  --->  ");
        fetchMinutes = getMinutes.nextInt();

        days = fetchMinutes / SECS_PER_DAY;
        remainingSeconds = fetchMinutes % SECS_PER_DAY;

        hours = remainingSeconds / SECS_PER_HOUR;
        remainingSeconds = remainingSeconds % SECS_PER_HOUR;

        minutes = remainingSeconds / SECS_PER_MINUTE;
        remainingSeconds = remainingSeconds % SECS_PER_MINUTE;

        System.out.printf("Έδωσες διάρκεια χρόνου σε Δευτερόλεπτα: -- %,d --\nΑυτή είναι [ %d ] Ημέρες, \n[ %02d ] Ώρες, [ %02d ] Λεπτά και  [ %02d ] Δευτερόλεπτα.\n\n",
                totalSeconds, days, hours, minutes, remainingSeconds);
        
        System.out.printf("\n--------------\nΤυχαία επιλογή χρόνου σε Λεπτά [ %d ]  ", RandomMinutes);

        days_r = RandomMinutes / SECS_PER_DAY;
        remainingSeconds_r = RandomMinutes % SECS_PER_DAY;

        hours_s = remainingSeconds / SECS_PER_HOUR;
        remainingSeconds_r = remainingSeconds_r % SECS_PER_HOUR;

        minutes_r = remainingSeconds_r / SECS_PER_MINUTE;
        remainingSeconds_r = remainingSeconds_r % SECS_PER_MINUTE;

        System.out.printf("Έδωσες διάρκεια χρόνου σε Lεπτα: -- %,d --\nΑυτή είναι [ %d ] Ημέρες, \n[ %02d ] Ώρες, [ %02d ] Λεπτά και  [ %02d ] Δευτερόλεπτα.\n\n",
                RandomMinutes, days_r, hours_r, minutes_r, remainingSeconds_r);
            
        System.out.println("\nEND OF PROGRAM TimeFromSeconds \n\n");
    }
    
    
}
