import java.util.Scanner; // "odkaz na triedu"

public class Kalkulacka {
    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu
        // 11.a naprogramujte kalkulacku, ktora bude vediet +, -, *, /
        // na vstupe zadane 2 cisla a znak operacie, ktoru chcete aby sa vykonala
        // vypise sa vysledok zvolenej operacie
        // 11.b upravte tento program tak, aby fungoval opakovane az kym ako znak zadate .
        int cislo01;
        int cislo02;
        String operacia;
        boolean vykonat = true;
        int vysledok;


        while(vykonat == true){
            //nacitame si dve cisla a zvolime operaciu
            System.out.println("Ak chcete ukoncit vykonavanie, zadajte pri operacii .");
            System.out.println("Zadaj prve cislo: ");
            cislo01 = mojObjekt.nextInt();
            System.out.println("Zadaj druhe cislo: ");
            cislo02 = mojObjekt.nextInt();
            System.out.println("Vyber operaciu z nasledovnych: + - * / ");
            operacia = mojObjekt.next();

            //zabezpecime vykonanie zvolenej operacie
            vysledok = 0;
            switch (operacia){
                case "+":
                    //spocitanie
                    vysledok = cislo01 + cislo02;
                    break;
                case "-":
                    //odpocitanie
                    vysledok = cislo01 - cislo02;
                    break;
                case "*":
                    //nasobenie
                    vysledok = cislo01 * cislo02;
                    break;
                case "/":
                    //delenie
                    vysledok = cislo01 / cislo02;
                    break;
                case ".":
                    //
                    vykonat = false;
                    break;
                default:
                    // ine
                    System.out.println("Nezvolil si spravnu operaciu.");
            }
            System.out.println("Vysledok zvolenej mat. operacie je: " + vysledok);
        }

    }
}