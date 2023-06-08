public class Metodicky {
    static void helloWorld(){
        System.out.println("Hura som sa spustila, som metoda.");
    }

    static void pozdrav(String fname, int fage){
        System.out.println("Ahoj, " + fname);
        System.out.println("Tvoj vek je " + fage);
    }

    //13. metodu kalkulacky s 3 parametrami
    // cislo, cislo, znak
    static void kalkulator (int fcislo01, int fcislo02, String fznak){
        int vysledok = 0;
        switch (fznak){
            case "+":
                //spocitanie
                vysledok = fcislo01 + fcislo02;
                break;
            case "-":
                //odpocitanie
                vysledok = fcislo01 - fcislo02;
                break;
            case "*":
                //nasobenie
                vysledok = fcislo01 * fcislo02;
                break;
            case "/":
                //delenie
                vysledok = fcislo01 / fcislo02;
                break;
            default:
                // ine
                System.out.println("Nezvolil si spravnu operaciu.");
        }
        System.out.println("Vysledok zvolenej mat. operacie je: " + vysledok);
    }

    //14.Napíšte metodu, ktora ako parameter dostane cenu tovaru bez DPH
    // a na výstupe vypíše cenu tovaru s DPH.
    static void vypocetDPH(double fcena){
        double prepocet = fcena * 1.2;
        System.out.println("Cena tovaru s DPH je: " + prepocet);
    }

    //15. Napíšte metodu, ktora zistí, koľko kilometrov prejde automobil,
    // ak zadáme množstvo natankovaného benzínu a spotrebu na 100 km.
    static void automoto(double fbenzinNatankovany, double fspotreba){
        double vypocet = 0;
        System.out.println("Automobil presiel " + vypocet + " kilometrov.");
    }

    public static void main(String[] args) {
        String meno = "Lucia";
        int vek = 90;

        helloWorld();
        pozdrav(meno, 9);
        pozdrav("Marek", vek);

        kalkulator(5,5,"+");
        vypocetDPH(4.5);
    }

}