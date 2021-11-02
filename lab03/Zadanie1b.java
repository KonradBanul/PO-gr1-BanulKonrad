public class Zadanie1b {
    public static int countSubStr(String str, String subStr) {
        int licznik = (str.split(subStr,-1).length)-1;
        return licznik;
    }
    public static void main(String[] args) {
        String a = "czcionka";
        String b = "ionka";
        System.out.println(countSubStr(a, b));
    }
}
