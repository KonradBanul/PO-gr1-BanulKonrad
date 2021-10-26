import java.util.Random;

public class Zadanie1d {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int[] tab = new int[n];
        int i, sumau=0, sumad=0;
        for(i=0;i<n;i++) {
            int k = r.nextInt(-1000, 1000);
            tab[i] = k;
            System.out.println(tab[i]);
        }
        for(i=0;i<n;i++) {
            if(tab[i]<0)
                sumau += tab[i];
        }
        for(i=0;i<n;i++) {
            if(tab[i]>0)
                sumad += tab[i];
        }
        System.out.println("Suma ujemnych: " + sumau);
        System.out.println("Suma dodatnich: " + sumad);
    }
}

