import java.lang.StringBuffer;

public class Zadanie1c {
    public static String middle(String str) {
        StringBuffer s = new StringBuffer(str);
        if (s.length() % 2 != 0) {
            char n = s.charAt(s.length()/2);
            System.out.println(n);
        }
        if (s.length() % 2 == 0) {
            char n = s.charAt(s.length()/2);
            char m = s.charAt(s.length()/2 - 1);
            System.out.print(m);
            System.out.println(n);
        }
        return null;
    }
    public static void main(String[] args) {
        String a = "czcionka";
        System.out.println(middle(a));
    }
}
