import java.util.Random;

public class Zadanie2b {
    public static void main(String[] args) {
        int[] tab = new int[100];
        generuj(tab,-1000,1000);
        wypisz(tab);
        System.out.println(" ");
        System.out.println(ileDodatnich(tab));
        System.out.println(ileUjemnych(tab));
        System.out.println(ileZerowych(tab));
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
    public static int ileDodatnich(int[] tab) {
        int i,ile=0;
        for(i=0;i<tab.length;i++) {
            if(tab[i]>0)
                ile++;
        }
        System.out.print("Dodatnich jest: ");
        return ile;
    }
    public static int ileUjemnych(int[] tab) {
        int i,ile=0;
        for(i=0;i<tab.length;i++) {
            if(tab[i]<0)
                ile++;
        }
        System.out.print("Ujemnych jest: ");
        return ile;
    }
    public static int ileZerowych(int[] tab) {
        int i,ile=0;
        for(i=0;i<tab.length;i++) {
            if(tab[i]==0)
                ile++;
        }
        System.out.print("Zerowych jest: ");
        return ile;
    }
}