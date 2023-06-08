public class KladneZaporne {
    public static void main(String[] args) {
        // 03. Napiste program, ktorý vypíše, či je zadané číslo kladné alebo záporné.
        int cislo1 = -23;

        if (cislo1 < 0)
            System.out.println("Cislo je zaporne");
        else {
            System.out.println("cislo je kladne");
        }

        // 04. V zložitejších programoch sa stretneme s tým,
        // že zadané číslo môže byť len z určitého intervalu.
        // Skús vytvoriť program, ktorý zistí, či je dané číslo zo zvoleného intervalu.
        int a = 0;
        boolean test = false;

        a = 5;
        if (a >= 40 && a <= 80) {
            test = true;
        }
        System.out.println("Mozeme pokracovat: " + test);
    }
}