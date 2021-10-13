import java.util.Scanner;

public class Zadanie1c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int suma = 0;
        while(i != n) {
            int k = in.nextInt();
            if(k < 0)
                k *= -1;
            suma += k;
            i++;
        }
        System.out.println(suma);
    }
}
