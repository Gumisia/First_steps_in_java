package klasy_anonimowe;

public class Main {
    public static void main(String[] args) {

//        ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {
//            @Override
//            public void akcja() {
//                System.out.println("jestem z klasy anonimowej");
//
//            }
//        };

//        z.akcja();

        Przycisk p = new Przycisk();

        p.dodajAkcje( new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("jestem z klasy anonimowej");

            }
        });

    }
}

interface ZachowaniePoWcisnieciu{
    void akcja();
}


class Przycisk {

    public void dodajAkcje(ZachowaniePoWcisnieciu z) {
        z.akcja();
    }
}