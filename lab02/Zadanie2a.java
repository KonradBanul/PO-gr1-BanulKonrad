import java.util.Random;

public class Zadanie2a {
    public static void main(String[] args) {
        int[] tab = new int[100];
        generuj(tab,-1000,1000);
        wypisz(tab);
        System.out.println(ileNieparzystych(tab));
        System.out.println(ileParzystych(tab));
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
    public static int ileNieparzystych(int[] tab) {
        int i, ile=0;
        for(i=0;i<tab.length;i++) {
            if(tab[i]%2==1 || tab[i]%2==-1)
                ile++;
        }
        System.out.println(" ");
        System.out.print("Nieparzystych jest: ");
        return ile;
    }
    public static int ileParzystych(int[] tab) {
        int i, ile=0;
        for(i=0;i<tab.length;i++) {
            if(tab[i]%2==0)
                ile++;
        }
        System.out.print("Parzystych jest: ");
        return ile;
    }
}