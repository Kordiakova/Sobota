import java.util.Scanner;

public class ProgramHadanka {
        public static void main(String[] args) {
            // 10. Napíšte program Hádanka, ktorý si vygeneruje číslo od 1 do 100 a my to číslo hádame.
            // Program nás informuje o tom, čí máme pridať alebo ubrať a počíta počet pokusov.
            // Po uhádnutí čísla vypíše, na koľkýkrát sa nám číslo podarilo uhádnuť.
            Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

            //vygenerujeme nahodne cislo v intervale 1..100
            int hadaneCislo = (int) Math.floor(Math.random() *(100 - 1 + 1) + 1);
            int cislo;
            boolean nasiel = false;
            int pocetPokusov = 1;

            System.out.println("hadane cislo je: " + hadaneCislo);
            do {
                System.out.println("Hadaj cislo v intervale 1..100");
                cislo = mojObjekt.nextInt();
                if (cislo == hadaneCislo){
                    //vyhral
                    nasiel = true;
                    System.out.println("Hura, uhadol si cislo!");
                }else{
                    pocetPokusov++;
                    if (cislo > hadaneCislo){
                        //hadaj mensie cislo
                        System.out.println("Neuhadol si, hadaj mensie cislo");
                    }else{
                        //hadal vacsie cislo
                        System.out.println("Neuhadol si, hadaj vacsie cislo");
                    }
                }
            } while (nasiel == false);

            System.out.println("Uhadol si cislo na " + pocetPokusov + " pokusov");


        }
    }
