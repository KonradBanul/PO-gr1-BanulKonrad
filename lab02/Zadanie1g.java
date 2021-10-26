import java.util.Random;
import java.util.Scanner;

public class Zadanie1g {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int n = r.nextInt(100);
        int[] tab = new int[n];
        int i;
        for(i=0;i<n;i++) {
            int k = r.nextInt(-1000, 1000);
            tab[i] = k;
            System.out.println(tab[i]);
        }
        System.out.println("--------------");
        int lewy = in.nextInt();
        int prawy = in.nextInt();
        if(lewy>0&&lewy<n)
            if(prawy>0&&prawy<n)
                if(lewy<prawy)
                    for(i=prawy;i>=lewy;i--) {
                        System.out.println(tab[i]);
                    }
    }
}
