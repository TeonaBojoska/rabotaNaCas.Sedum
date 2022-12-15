package Zadaca5;
import java.util.Set;
import java.util.TreeSet;

public class Glavna {
    public static void main(String[] args){
            Set<String> mnozestvo1 = new TreeSet<String> ();
            mnozestvo1.add("macka");
            mnozestvo1.add("kuche");
            mnozestvo1.add("papagal");

            Set<String> mnozestvo2 = new TreeSet<String> ();
            mnozestvo2.add("ez");
            mnozestvo2.add("hrcak");
            mnozestvo2.add("papagal");

            System.out.println("Presek od mnozestvata");
            mnozestvo1.retainAll(mnozestvo2);
            System.out.println(mnozestvo1);
    }
}

