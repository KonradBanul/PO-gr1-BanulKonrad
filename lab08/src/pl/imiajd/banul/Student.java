package pl.imiajd.banul;
import java.time.LocalDate;

public class Student extends Osoba {
    private final double sredniaOcen;
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }
    double getSredniaOcen() {
        return sredniaOcen;
    }
}