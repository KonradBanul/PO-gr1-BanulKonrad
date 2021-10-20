import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        Random r = new Random();
        int m = r.nextInt(10);
        int n = r.nextInt(10);
        int k = r.nextInt(10);
        int i,j;
        for(i=0;i<m;i++)
            for(j=1;j<n;j++) {
                int s = r.nextInt(10);
                System.out.println(s);
            }
    }
}
