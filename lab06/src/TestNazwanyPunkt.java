package pl.imijad.banul;

public class TestNazwanyPunkt {
    public static void main(String[] args){
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();

        Punkt b = new Punkt(3,5);
        b.show();

        Punkt c = new NazwanyPunkt(3,6, "tawerna");
        c.show();

        a = (NazwanyPunkt) c;
        a.show();
    }
}
