package Zadaca2;
import java.util.ArrayList;
import java.util.Arrays;
class MetodiZaListaNiza {
    public void listToArray(ArrayList<String> list){
        String [] niza = new String[list.size()];
        list.toArray(niza);
        System.out.println("List vo niza:");

        for(String s: niza){
            System.out.println(s);
        }
    }
    public void arrayToList(String [] niza){
        ArrayList<String> list2=new ArrayList<String>();
        list2= (ArrayList<String>) Arrays.asList(niza);
        System.out.println("Niza vo lista:");

        for(String s : list2){
            System.out.println(s);
        }
    }
}
public class Glavna {
    public static void main(String[] args) {
        MetodiZaListaNiza metod=new MetodiZaListaNiza();
        ArrayList<String> list=new ArrayList<String>();
        list.add("I");
        list.add("L");
        list.add("O");
        metod.listToArray(list);

        String [] niza = {"i","e","o"};
        metod.arrayToList(niza);
    }
}
