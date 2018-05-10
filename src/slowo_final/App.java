package slowo_final;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        final double PI;

        PI = 3.14;

        Pracownik p = new Pracownik();

        System.out.println(p.dataZatrudnienia);

    }
}

abstract class Osoba{

}

class Pracownik extends Osoba {

    final Date dataZatrudnienia;

    Pracownik(){
        this.dataZatrudnienia = new Date();
    }

    Pracownik(Date data){
        this.dataZatrudnienia = data;
    }

//    final przed - nie ma możliwości dziedziczenia danej metody
    final public Date getDataZatrudnienia() {
        return dataZatrudnienia;
    }
}

class Programista extends Pracownik{

//    @Override
//    public Date getDataZatrudnienia() {
//        return super.getDataZatrudnienia();
//    }
//
}