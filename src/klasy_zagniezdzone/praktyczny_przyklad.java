package klasy_zagniezdzone;

public class praktyczny_przyklad {
    public static void main(String[] args) {

        KontoBankowe kontoBankowe = new KontoBankowe(1000);

        System.out.println(kontoBankowe.getStanKonta());

        kontoBankowe.utworzKonto(5);

        System.out.println(kontoBankowe.getStanKonta());

//        kontoBankowe.start();

    }
}


class KontoBankowe{

    private double stanKonta;

    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    void utworzKonto(final double stopa){ // dzieki final jest widoczna w klasie wewnetrznej

//        odsetki.zmienStanKonta(stopa); to jest w kontruktorze

        class Odsetki{ //lokalna klasa metody

            private double stopProcentowa;

            public Odsetki(double stopProcentowa) {
                this.stopProcentowa = stopProcentowa;
                this.zmienStanKonta();
            }

            void zmienStanKonta(){
                double odsetki = (stanKonta*stopa)/100;
                stanKonta+=odsetki;
            }
        }

        Odsetki odsetki = new Odsetki(stopa);
    }

//    class Odsetki{
//
//        private double stopProcentowa;
//
//        public Odsetki(double stopProcentowa) {
//            this.stopProcentowa = stopProcentowa;
//            this.zmienStanKonta(stopProcentowa);
//        }
//
//        void zmienStanKonta(double stopa){
//            double odsetki = (stanKonta*stopa)/100;
//            stanKonta+=odsetki;
//        }
//    }
}