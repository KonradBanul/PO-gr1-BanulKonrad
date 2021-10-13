import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int ile1 = 0;
        int ile2 = 0;
        int ile3 = 0;
        while(i != n) {
            int k = in.nextInt();
            if(k > 0)
                ++ile1;
            if(k < 0)
                ++ile2;
            if(k == 0)
                ++ile3;
            i++;
        }
        System.out.println(ile1);
        System.out.println(ile2);
        System.out.println(ile3);
    }
}