package pl.imiajd.banul;
import java.time.LocalDate;

class Pracownik extends Osoba
{
    LocalDate dataZatrudnienia;
    public Pracownik(String nazwisko, String imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }
    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }
    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private double pobory;
}