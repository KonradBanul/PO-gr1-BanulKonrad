public class Zadania {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000, 0.04);
        RachunekBankowy saver2 = new RachunekBankowy(3000, 0.04);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        System.out.println(saver1.setRocznaStopaProcentowa(0.05));
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
    }
}
class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public double obliczMiesieczneOdsetki() {
        double odsetki;
        odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo += odsetki;
        return odsetki;
    }
    public double setRocznaStopaProcentowa(double nowy) {
        rocznaStopaProcentowa = nowy;
        return nowy;
    }
    public RachunekBankowy(double saldo,double rocznaStopaProcentowa) {
        this.saldo = saldo;
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }
}