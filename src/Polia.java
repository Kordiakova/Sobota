import java.util.Scanner; // "odkaz na triedu"
public class Polia {
    public static void main(String[] args) {
        /*
        String[] cars = {"Volvo", "Nissan", "Skoda", "BMW", "Toyota" };
        int[] hodnotenie = {1,3,5,4};

        for (int i=0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        int sucet = 0;
        for (int i=0; i < hodnotenie.length; i++){
            sucet += hodnotenie[i];
        }
        System.out.println(sucet);
*/
        // 12. Zostavte program, ktorý zistí, či sa číslo n nachádza v postupnosti čísel.
        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        int[] poleCisel = {1,3,5,4,5,6,3,8,0,9,1,3,5,3,5,5,7,5,7,3};
        // nacitat cislo n zo vstupu
        System.out.println("Zadaj cislo n");
        int n = mojObjekt.nextInt();
        // prejst cele pole {v cykle} a porovnat jednotlive cisla s cislom n
        boolean nachadzaSa = false;
        int pocitadlo = 0;

        for (int i = 0; i < poleCisel.length; i++){
            if(n == poleCisel[i]){
                nachadzaSa = true;
                pocitadlo++;
            }
        }
        // vypisat ci sa tam nachadza - v tom vasom poli
        if (nachadzaSa == true){
            System.out.println("Zadane cislo sa nachadza v poli. Nachadza sa v nom prave " + pocitadlo + " krat");
        }else{
            System.out.println("Zadane cislo sa nenachadza v poli. ");
        }
        // bonus: vypisat kolkokrat sa tam nachadza

    }
}