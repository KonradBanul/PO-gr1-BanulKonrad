
public class zad4 {
    public static void main(String[] args) {
        double kwota = 1000;
        double procent = 0.06;
        double saldo = kwota - (kwota * procent);
        saldo = saldo - (saldo * procent);
        saldo = saldo - (saldo * procent);
        System.out.println(saldo);
    }

}