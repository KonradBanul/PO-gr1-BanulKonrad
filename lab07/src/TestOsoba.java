package pl.imiajd.banul;
import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];
        ludzie[0] = new Pracownik("Kowalski", "Jan", LocalDate.of(2000, 2, 3), true, 2000, LocalDate.of(2020, 3, 1));
        ludzie[1] = new Student("Nowak", "Paweł", LocalDate.of(2000, 2, 3), true, "Informatyka", 4.2);
        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + " " + p.getImiona() + " " + p.getDataUrodzenia() + " " + p.getPlec());
        }
    }
}

