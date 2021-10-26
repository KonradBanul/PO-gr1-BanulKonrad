import java.util.Random;

public class Zadanie2d {
    public static void main(String[] args) {
        int[] tab = new int[100];
        generuj(tab,-1000,1000);
        wypisz(tab);
        System.out.println(" ");
        System.out.println(sumaDodatnich(tab));
        System.out.println(sumaUjemnych(tab));
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
    public static int sumaDodatnich(int[] tab) {
        int i,suma=0;
        for(i=0;i<tab.length;i++) {
            if(tab[i]>0)
                suma += tab[i];
        }
        System.out.print("Suma dodatnich: ");
        return suma;
    }
    public static int sumaUjemnych(int[] tab) {
        int i,suma=0;
        for(i=0;i<tab.length;i++) {
            if(tab[i]<0)
                suma += tab[i];
        }
        System.out.print("Suma ujemnych: ");
        return suma;
    }
}