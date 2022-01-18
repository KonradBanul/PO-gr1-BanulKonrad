package pl.imiajd.banul;

public class PairDemo
{
    public static void main(String[] args) {
        Pair p1 = new Pair(3,4);
        p1.show();
        p1.swap();
        p1.show();
        PairUtil p2 = new PairUtil(5,7);
        p2.show();
        p2.swap();
        p2.show();
    }
}
