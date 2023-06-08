import java.util.Scanner; // "odkaz na triedu"

public class Cykly {
    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        //06. nacitajte meno na vstupe a vypiste aj s nejakym pozdravom
        //System.out.print("Zadaj meno: ");
        //String meno = mojObjekt.nextLine();
        //System.out.println("Ahoj, " + meno);

        //07. Napíšte program, ktorý vypisat prirodzené čísla od 1 po n.
        // n - celociselne cislo, ktore nacitate zo vstupu
        // bonus: okrem vypisania ich aj spocitajte a vypiste vysledok suctu
        System.out.print("Zadaj cislo:");
        int cislo = mojObjekt.nextInt();
        System.out.println("Nacitali sme : " + cislo);
        int sucet = 0;
        for(int i=1;i<=cislo;i++){
            System.out.println(i);
            sucet = sucet + i;
        }
        System.out.println("Sucet je: " + sucet);

        // 08. Pomocou programu vykreslite na obrazovku nasledujúci obrazec (pre n = 5) :
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        for (int i = cislo; i >= 0; i--) {
            System.out.println("* ".repeat(i));
        }

        for (int i = cislo; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 09. Vytvorte pomôcku na meranie dennej teploty v týždni.
        // Program načíta denné teploty od pondelka do nedele, vypočíta priemernú teplotu a vypíše ju.
        // bonus: program vypise aj v ktorom dni bola najväčšia teplotná odchýlka od priemeru.
        double teplota = 0;
        double sum = 0;
        for (int i=0; i<7; i++){
            System.out.println("Zadaj teplotu: ");
            teplota = mojObjekt.nextDouble();
            sum += teplota;
        }
        double priemer = sum / 7;
        System.out.println("Priemerna teplota tento tyzden bola: " + priemer);

    }
}