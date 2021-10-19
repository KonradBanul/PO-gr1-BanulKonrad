import java.util.Scanner;

public class Zadanie21h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int ile = 0;
        while(i != n) {
            int k = in.nextInt();
            if(k < 0)
                k *= -1;
            if(k < Math.pow((i+1), 2))
                ile++;
            i++;
        }
        System.out.println(ile);
    }
}