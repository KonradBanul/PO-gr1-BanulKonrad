package pl.imijad.banul;

public class NazwanyPunkt extends Punkt {
    private String name;
    public NazwanyPunkt(int x, int y, String name){
        super(x, y);
        this.name = name;
    }
    public void show() {
        System.out.println(name + ":< " + x() + " , " + y() + " >");
    }
}
