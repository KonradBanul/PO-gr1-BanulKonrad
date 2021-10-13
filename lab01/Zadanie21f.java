import java.util.Scanner;

public class Zadanie21f {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int ile = 0;
        while(i != n) {
            int k = in.nextInt();
            if((i + 1) % 2 == 1 && k % 2 == 0)
                ile++;
            i++;
        }
        System.out.println(ile);
    }
}