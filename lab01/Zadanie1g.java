import java.util.Scanner;

public class Zadanie1g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int suma = 0;
        int iloczyn = 1;
        while(i != n) {
            int k = in.nextInt();
            int m = k;
            suma += k;
            iloczyn *= m;
            i++;
        }
        System.out.println(suma);
        System.out.println(iloczyn);
    }
}