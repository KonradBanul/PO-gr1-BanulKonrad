import java.util.Scanner;

public class Zadanie1e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int iloczyn = 1;
        while(i != n) {
            int k = in.nextInt();
            if(k < 0)
                k *= -1;
            iloczyn *= k;
            i++;
        }
        System.out.println(iloczyn);
    }
}