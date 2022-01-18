package pl.imiajd.banul;
import java.time.LocalDate;

abstract class Osoba
{
    final String nazwisko;
    String imiona;
    LocalDate dataUrodzenia;
    boolean plec;
    public Osoba(String nazwisko, String imiona, LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getImiona() {
        return imiona;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    public boolean getPlec() {
        return plec;
    }
}