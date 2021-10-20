import java.util.Random;

public class Zadanie1a {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int[] tab = new int[n];
        int i, ile1=0, ile2=0;
        for(i=0;i<n;i++) {
            int k = r.nextInt(-1000, 1000);
            tab[i] = k;
            if(tab[i]%2==1 || tab[i]%2==-1)
                ile1++;
            if(tab[i]%2==0)
                ile2++;
            System.out.println(tab[i]);
        }
        System.out.println("Liczb nieparzystych jest: " + ile1);
        System.out.println("Liczb parzystych jest: " + ile2);
    }
}
