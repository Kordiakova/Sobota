public class DekodovanieZnamok {
    public static void main(String[] args) {
        // 05. Tvoje vysvedčenie sa líši od bratovho, pretože on má ešte známky zapísané číslom.
        // Samozrejme, že by chcel mať také ako ty. Urob mu radosť a vytvor program,
        // v ktorom zadá známku číslom a zobrazí slovný ekvivalent.
        // Môžeš tu výhodne použiť príkaz SWITCH. Nezabudni, že známky sú len od 1 do 5,
        // aj keď by si tvoj brat zaslúžil niekedy aj „osmičku“.
        // 1-A 2-B 3-C 4-D 5-E
        int znamka = 5;
        switch (znamka){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("Fx");
                break;
            default:
                System.out.println("Toto nie je znamka");
        }
    }
}