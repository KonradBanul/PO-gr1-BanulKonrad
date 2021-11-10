import java.util.ArrayList;

public class Zadanie1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(a);
        list.addAll(b);
        return list;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        int n = a.size()+b.size();
        for(i=0;i<n;i++) {
            if(i<a.size())
                list.add(a.get(i));
            if(i<b.size())
                list.add(b.get(i));
        }
        return list;
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        int n = a.size();
        for(i=n-1;i>=0;i--) {
            list.add(a.get(i));
        }
        return list;
    }
    public static void reverse(ArrayList<Integer> a) {
        int i, n = a.size();
        for(i=n-1;i>=0;i--) {
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(append(a,b));
        System.out.println(merge(a,b));
        System.out.println(reversed(a));
        reverse(a);
    }
}

