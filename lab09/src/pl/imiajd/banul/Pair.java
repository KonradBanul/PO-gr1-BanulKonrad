package pl.imiajd.banul;
public class Pair<T> {
    private T x;
    private T y;
    public Pair(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.println("< " + x + " , " + y + " >");
    }
    public void swap() {
        T temp = x;
        x = y;
        y = temp;
    }
}