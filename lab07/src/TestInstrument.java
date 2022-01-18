package pl.imiajd.banul;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrument {
    public static void main(String[] args)
    {
        ArrayList<String> orkiestra = new ArrayList<>();
        Instrument[] instrument = new Instrument[5];
        instrument[0] = new Flet("Yamaha",LocalDate.of(2000,12,12));
        instrument[1] = new Fortepian("Weltmaister",LocalDate.of(2000,12,12));
        instrument[2] = new Skrzypce("Skrzyp",LocalDate.of(2000,12,12));
        instrument[3] = new Flet("Dell",LocalDate.of(2000,12,12));
        instrument[4] = new Fortepian("Yamaha",LocalDate.of(2000,12,12));
        for(int i=0;i<5;i++) {
            orkiestra.add(instrument[i].dzwiek());
            System.out.print(orkiestra.get(i) + " ");
        }
    }
}