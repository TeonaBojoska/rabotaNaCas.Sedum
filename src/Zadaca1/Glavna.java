package Zadaca1;
import java.util.ArrayList;
public class Glavna {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Daleron");
        list.add("Analgin");
        list.add("Paracetamol");
        list.add("Heleks");

        if(list.get(list.size()-1).equals("Paracetamol")) {
            System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura.");
        }
            else{
                System.out.println("Namenata na lekot e nepoznata!");
            }
    }
}
