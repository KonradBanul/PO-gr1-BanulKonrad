import java.util.Scanner;

public class Zadanie1i {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int j = 1;
        double suma = 0;
        double iloczyn = 1;
        while(i != n + 1) {
            double k = in.nextDouble();
            iloczyn *= j;
            suma += (Math.pow(-1, i) * k)/iloczyn;
            i++;
            j++;
        }
        System.out.println(suma);
    }
}