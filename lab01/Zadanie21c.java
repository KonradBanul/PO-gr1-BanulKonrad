import java.util.Scanner;

public class Zadanie21c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int ile = 0;
        while(i != n) {
            double k = in.nextDouble();
            if(Math.sqrt(k) % 2 == 0)
                ile++;
            i++;
        }
        System.out.println(ile);
    }
}