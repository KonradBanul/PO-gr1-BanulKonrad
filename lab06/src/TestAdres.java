package pl.imijad.banul;

public class TestAdres {
    public static void main(String[] args){
        Adres a = new Adres("Pułaskiego", 15, "Szczytno", "12-100");
        a.pokaz1();
        Adres b = new Adres("Pułaskiego", 15, "Szczytno", "12-100");
        b.pokaz2();
    }
}
