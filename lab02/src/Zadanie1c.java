import java.util.Random;

public class Zadanie1c {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int[] tab = new int[n];
        int i;
        int ile=0;
        for(i=0;i<n;i++) {
            int k = r.nextInt(-1000, 1000);
            tab[i] = k;
            System.out.println(tab[i]);
        }
        int max = tab[0];
        for(i=1;i<n;i++) {
            if(max<tab[i])
                max=tab[i];
        }
        for(i=0;i<n;i++) {
            if(max==tab[i])
                ile++;
        }
        System.out.println("Maksymalna: "+max);
        System.out.println("Ilość wystąpięń: "+ile);
    }
}
