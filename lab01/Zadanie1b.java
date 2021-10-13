import java.util.Scanner;

public class Zadanie1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int iloczyn = 1;
        while(i != n) {
            int k = in.nextInt();
            iloczyn *= k;
            i++;
        }
        System.out.println(iloczyn);
    }
}