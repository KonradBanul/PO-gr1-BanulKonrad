package pl.imijad.banul;
import java.lang.String;

public class Adres {
    private String ulica, miasto, kod_pocztowy;
    private int numer_domu, numer_mieszkania;
    Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public void pokaz1() {
        System.out.println(kod_pocztowy + ", " + miasto);
        System.out.println(ulica + " " + numer_domu);
    }
    public void pokaz2() {
        System.out.println(kod_pocztowy + ", " + miasto);
        System.out.println(ulica + " " + numer_domu + "/" + numer_mieszkania);
    }
}