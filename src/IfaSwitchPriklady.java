public class IfaSwitchPriklady {
    public static void main(String[] args) {
        // 01.Vytvor program, ktorý vygeneruje dve náhodné čísla do 50 a zobrazí, ktoré číslo je väčšie.
        // int random_cis = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int min = 1;
        int max = 50;
        /*
        Math.random 0.0 - 1.0
        0.2
        50-1+1 = 50
        02 * 50 + 1
         */
        int randomCis01 = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int randomCis02 = (int)Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("Nase vygenerovane cisla su: " + randomCis01 + " " + randomCis02);

        if (randomCis01 > randomCis02) {
            System.out.println("Vacsie cislo je " + randomCis01);
        } else {
            System.out.println("Vacsie cislo je " + randomCis02);
        }
    }
}