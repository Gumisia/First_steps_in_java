package interfejsy;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        nazwaInterfejsu a = new nazwaInterfejsu(); nie można stworzyć instancji interfejsu!!!
       nazwaInterfejsu a = new Pracownik();

        ((Pracownik)a).getWynagrodzenie(); // rzutowanie w dół

        System.out.println(nazwaInterfejsu.PI);

        int[] tab = new int[3];

        tab[0] = 3;
        tab[1] = -5;
        tab[2] = 13;

        Arrays.sort(tab);

        System.out.println(tab[0]);

        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(1000);
        pracownik[2] = new Pracownik(5000);


        System.out.println("Przed sortowaniem:");

        for(Pracownik p: pracownik){
            System.out.println(p.getWynagrodzenie());
        }

        System.out.println(pracownik[0].compareTo(pracownik[1]));
//        Arrays.sort(pracownik);
        Arrays.sort(pracownik, Collections.reverseOrder());

        System.out.println("Po sortowaniu:");

        for(Pracownik p: pracownik){
            System.out.println(p.getWynagrodzenie());
        }
    }
}

interface nazwaInterfejsu{
    double PI = 3.14; //public static final

    void cos(); //public abstract
}

interface cosik{

}

class Pracownik implements nazwaInterfejsu, cosik, Comparable{

    private double wynagrodzenie;

    public Pracownik() {
    }

    public Pracownik(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void cos() {

        throw new  UnsupportedOperationException("Not sussported yet."); //

    }

    double getWynagrodzenie() {
        return wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik przyslany = (Pracownik)o;
        if(this.wynagrodzenie < przyslany.wynagrodzenie){
            return -1;
        }
        else if (this.wynagrodzenie > przyslany.wynagrodzenie){
            return 1;
        }

        return 0;
    }
}