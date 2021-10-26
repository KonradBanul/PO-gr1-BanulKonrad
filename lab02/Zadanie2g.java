import java.util.Random;
import java.util.Scanner;

public class Zadanie2g {
    public static void main(String[] args) {
        int[] tab = new int[100];
        generuj(tab, -1000, 1000);
        wypisz(tab);
        System.out.println(" ");
        odwrocFragment(tab);
    }

    public static void generuj(int[] tab, int min, int max) {
        Random r = new Random();
        int i;
        for (i = 0; i < tab.length; ++i) {
            tab[i] = r.nextInt(min, max);
        }
    }

    public static void wypisz(int[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void odwrocFragment(int[] tab) {
        Scanner in = new Scanner(System.in);
        int lewy = in.nextInt();
        int prawy = in.nextInt();
        int i;
        if(lewy>0&&lewy<tab.length)
            if(prawy>0&&prawy<tab.length)
                if(lewy<prawy)
                    for(i=prawy;i>=lewy;i--) {
                        System.out.print(tab[i]+" ");
                    }
        }
}
