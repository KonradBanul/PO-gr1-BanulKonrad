import java.util.Random;

public class Zadanie1e {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int[] tab = new int[n];
        int i;
        for(i=0;i<n;i++) {
            int k = r.nextInt(-1000, 1000);
            tab[i] = k;
            System.out.println(tab[i]);
        }
        int dodatni=0;
        for(i=0;i<n;i++) {
            if(tab[i]>0 && tab[i+1]>0)
                dodatni++;
        }
        System.out.println("t "+dodatni);
    }
}
