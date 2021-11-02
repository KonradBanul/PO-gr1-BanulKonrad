import java.lang.StringBuffer;

public class Zadanie1a {
    public static int countChar(String str, char c) {
        StringBuffer s = new StringBuffer(str);
        int suma = 0, i;
        for(i=0;i<s.length();i++) {
            if(s.charAt(i) == c)
                suma++;
        }
        return suma;
    }
    public static void main(String[] args) {
        String a = "czcionka";
        char c = 'c';
        System.out.print("Ilość wystąpień litery c: ");
        System.out.println(countChar(a, c));
    }
}
