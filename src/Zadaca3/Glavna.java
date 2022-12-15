package Zadaca3;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class SportskiKlub implements Comparable<SportskiKlub>{
    private String imeNaKlub;
    private String sport;
    private int brojNaClenovi;
    public SportskiKlub(String imeNaKlub,String sport,int brojNaClenovi){
        this.imeNaKlub=imeNaKlub;
        this.sport=sport;
        this.brojNaClenovi=brojNaClenovi;
    }
    public String getImeNaKlub() {
        return imeNaKlub;
    }
    public String getSport() {
        return sport;
    }
    public int getBrojNaClenovi() {
        return brojNaClenovi;
    }
    public void setImeNaKlub(String imeNaKlub) {
        this.imeNaKlub = imeNaKlub;
    }
    public void setSport(String sport) {
        this.sport = sport;
    }
    public void setBrojNaClenovi(int brojNaClenovi) {
        this.brojNaClenovi = brojNaClenovi;
    }
    public int compareTo(SportskiKlub sport){
        SportskiKlub a=(SportskiKlub)sport;
        if(this.imeNaKlub.equals(a.imeNaKlub))
            return 0;
        else{
            return this.imeNaKlub.compareTo(a.imeNaKlub);
        }
    }
}
public class Glavna {
    public static void main(String[] args){
        ArrayList<SportskiKlub> list = new ArrayList<SportskiKlub>();
        list.add(new SportskiKlub("Peliter", "fudbal", 37));
        list.add(new SportskiKlub("Vardar", "fudbal", 30));

        Collections.sort(list);
        for (SportskiKlub a : list) {
            System.out.println(a.getImeNaKlub());
            System.out.println(a.getSport());
            System.out.println(a.getBrojNaClenovi());
            System.out.println();
        }
    }
}
