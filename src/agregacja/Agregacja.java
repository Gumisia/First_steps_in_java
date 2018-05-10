package agregacja;

public class Agregacja {
    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Anna", new Adres("Białystok", 100));

        System.out.println(pracownik);

    }
}


class Pracownik{
    String imie;
    Adres adres;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return imie + ": " + adres.ulica + " " + adres.nrDomu;
    }
}

class Adres{
    String ulica;
    int nrDomu;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }
}