package pl.imiajd.banul;
import java.lang.Comparable;
import java.time.LocalDate;

class Osoba implements Comparable<Osoba> {
    private final String nazwisko;
    private final LocalDate dataUrodzenia;
    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public LocalDate getdataUrodzenia() {
        return dataUrodzenia;
    }
    public String toString() {
        return (nazwisko + " " + dataUrodzenia);
    }
    public boolean equals(Object nazwisko, Object dataUrodzenia){
        return this == nazwisko && this == dataUrodzenia;
    }
    public int compareTo(Osoba a) {
        String jeden = getNazwisko();
        String dwa = a.getNazwisko();
        return jeden.compareTo(dwa);
    }
}