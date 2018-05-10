package wyrazenia_lambda;

public class Main {
    public static void main(String[] args) {

//        ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {
//            @Override
//            public void akcja() {
//                System.out.println("jestem z klasy anonimowej");
//
//            }
//        };

        // () - argumenty które wysyłamy do akcja()
        // -> - wyrażenie lambda
        // {} - to co zostać wywołane wewnątrz metody akcja

        ZachowaniePoWcisnieciu z = () -> {
                System.out.println("jestem z klasy anonimowej");

        };

        // WAŻNE ! może być tylko 1 zachownie na 1 interfejs


        // nie trzeba podawać typu zmiennych  w  ()

        ZachowaniePoWciśnięciu2 z2 = (a, b) -> {
            System.out.println(a + b);
            return a+b;
        };

//        ZachowaniePoWciśnięciu2 z2 = (a, b) -> a+b; // jeśli mamy jedną instrukcję return



        Przycisk p = new Przycisk();

        p.dodajAkcje(z);

        p.dodajAkcje(() -> {
            System.out.println("jestem z klasy anonimowej - akcja()");

        });

        int wynik = p.dodajAkcje2(5,10, z2);

        System.out.println(wynik);


    }
}

interface ZachowaniePoWcisnieciu{
    void akcja();
}

interface ZachowaniePoWciśnięciu2{
    int akcja2(int a, int b);
}


class Przycisk {

    public void dodajAkcje(ZachowaniePoWcisnieciu z) {
        z.akcja();
    }

    public int dodajAkcje2(int a, int b, ZachowaniePoWciśnięciu2 z){
        return z.akcja2(a, b);
    }
}