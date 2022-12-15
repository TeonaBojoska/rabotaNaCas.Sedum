package Zadaca5b;
import java.util.Set;
import java.util.TreeSet;
public class Glavna {
    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet<String> ();
        mnozestvo1.add("macka");
        mnozestvo1.add("kuche");
        mnozestvo1.add("hrcak");

        Set<String> mnozestvo2 = new TreeSet<String> ();
        mnozestvo2.add("macka");
        mnozestvo2.add("kuche");
        mnozestvo2.add("hrcak");

        System.out.println("Unija od mnozhestvata");
        mnozestvo1.addAll(mnozestvo2);
        System.out.println(mnozestvo1);
    }
}
