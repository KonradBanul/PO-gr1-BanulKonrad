import java.util.Random;

public class Zadanie2c {
    public static void main(String[] args) {
        int[] tab = new int[100];
        generuj(tab,-1000,1000);
        wypisz(tab);
        System.out.println(" ");
        System.out.println(ileMaksymalnych(tab));
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
        for(i=0;i<tab.length;i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static int ileMaksymalnych(int[] tab) {
        int max = tab[0],i,ile=0;
        for(i=1;i<tab.length;i++) {
            if(max<tab[i])
                max=tab[i];
        }
        for(i=0;i<tab.length;i++) {
            if (max == tab[i])
                ile++;
        }
        System.out.print("Ilość wystąpień maksymalnego elementu: ");
        return ile;
    }
}