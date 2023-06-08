public class StyriCisla2 {
       public static void main(String[] args) {
            // 02. Teraz potrebuješ zistiť, ktoré číslo zo štyroch zadaných je najväčšie.
            // Vytvor program, ktorý zobrazí najväčšie číslo.

            //1. riesenie
            int cislo1 = 35;
            int cislo2 = 7;
            int cislo3 = 78;
            int cislo4 = 45;
            if (cislo1 > cislo2 && cislo1 > cislo3 && cislo1 > cislo4) {
                System.out.println("Cislo1 je najvacsie " + cislo1);

            } else if (cislo2 > cislo1 && cislo2 > cislo3 && cislo2 > cislo4) {
                System.out.println("Cislo2 je najvacsie" + cislo2);
            } else if (cislo3 > cislo1 && cislo3 > cislo2 && cislo3 > cislo4) {
                System.out.println("Cislo3 je najvacsie" + cislo3);
            } else {
                System.out.println("cislo4 je najvacsie" + cislo4);
            }

            //2. riesenie
            int a = 12, b = 23, c = 107, d = 5, max;

            if (a > b) { max = a; }
            else {max = b;}
            if (c > max) { max = c; }
            if (d > max) { max = d; }

            System.out.println("Maximum je " + max);


        }
}
