package pl.imiajd.banul;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestStudent {
    public static void main(String[] args)
    {
        Student a = new Student("Wano",LocalDate.of(2001,2,1), 3);
        Student b = new Student("Eno",LocalDate.of(2000,12,2), 4);
        ArrayList<Object> c = new ArrayList<>();
        c.add(new Student("Pano",LocalDate.of(2000,3,2), 3));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.equals(b));
    }
}