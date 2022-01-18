package pl.imiajd.banul;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args)
    {
        Osoba a = new Osoba("Fran",LocalDate.of(2001,2,1));
        Osoba b = new Osoba("Ben",LocalDate.of(2000,12,2));
        ArrayList<Object> c = new ArrayList<>();
        c.add(new Osoba("Nema",LocalDate.of(2000,3,2)));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.equals(b));
    }
}