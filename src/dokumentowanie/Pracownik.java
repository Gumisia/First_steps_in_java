package dokumentowanie;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla...
 * @author Gumisia
 * @version 1.0 10/05/2018
 * @see dokumentowanie.Pracownik#getWynagrodzenie()
 * @see <a href="https://github.com/Gumisia/UDEMY" target="_blanck">GitHub link</a>
 */

public class Pracownik {

    /**
     * Imię pracownika
     */
    private String imie;
    /**
     * Nazwisko pracownika
     */
    private String nazwisko;
    /**
     * wynagrodzenie pracownika
     */
    private double wynagrodzenie;

    /**
     * Konstruktor domyslny
     * @deprecated
     */
    public Pracownik() {
    }

    /**
     * Kostruktor tworzacy obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     */
    protected Pracownik(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    /**
     * Kostruktor tworzacy obiekt <code>Pracownik</code> z imieniem, nazwiskiem i wynagrodzeniem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie utawia wynagrodzenie
     */
    public Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        this(imie,nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    /**
     * @since 1.0.0
     * @return zwraca pensje typu duble w zl
     * @throws NullPointerException
     */
    private double getWynagrodzenie() throws NullPointerException{
        try {
            return wynagrodzenie;
        }catch (NullPointerException e){
            e.getMessage();
        }
        return -1;
    }

    /**
     * <pre>
     * Jak uzywac:
     *
     * <code>Pracownik p = new Pracownik();
     * p.setWynagrodzenie(1000);</code>
     * </pre>
     *
     * @param noweWynagrodzenie ustawia pracownikowi nowe wynagrodzenie
     */
    public void setWynagrodzenie(double noweWynagrodzenie) {
        this.wynagrodzenie = noweWynagrodzenie;
    }
}
