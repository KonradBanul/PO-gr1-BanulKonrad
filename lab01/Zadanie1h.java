import java.util.Scanner;

public class Zadanie1h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int suma = 0;
        while(i != n + 1) {
            int k = in.nextInt();
            suma += Math.pow(-1, i+1) * k;
            i++;
        }
        System.out.println(suma);
    }
}