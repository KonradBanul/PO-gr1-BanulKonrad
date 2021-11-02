import java.lang.StringBuffer;

public class Zadanie1d {
    public static String repeat(String str, int n) {
        StringBuffer s = new StringBuffer(str);
        int i;
        for(i=0; i<n-1; i++) {
            s.append(str);
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String a = "czcionka";
        System.out.println(repeat(a, 2));
    }
}
