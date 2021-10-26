import java.util.Random;

public class Zadanie2f {
    public static void main(String[] args) {
        int[] tab = new int[100];
        generuj(tab, -1000, 1000);
        wypisz(tab);
        System.out.println(" ");
        signum(tab);
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

    public static void signum(int[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                tab[i] = 1;
            if (tab[i] < 0)
                tab[i] = -1;
            System.out.print(tab[i]+" ");
        }
    }
}