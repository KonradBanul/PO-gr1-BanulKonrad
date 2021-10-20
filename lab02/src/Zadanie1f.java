import java.util.Random;

public class Zadanie1f {
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
        System.out.println("Zmodyfikowana tablica");
        for(i=0;i<n;i++) {
            if(tab[i]>0)
                tab[i]=1;
            if(tab[i]<0)
                tab[i]=-1;
            System.out.println(tab[i]);
        }
    }
}
