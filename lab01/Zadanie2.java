import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        while(i != n) {
            int k = in.nextInt();
            System.out.println(k);
            i++;
        }
    }
}