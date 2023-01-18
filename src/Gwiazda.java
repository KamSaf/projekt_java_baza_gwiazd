public class Gwiazda {
    private String nazwa;
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    private String nazwaKatalogowa;
    public String getNazwaKatalogowa() {
        return nazwaKatalogowa;
    }
    public void setNazwaKatalogowa(String nazwa) {
        this.nazwaKatalogowa = nazwa;
    }

    private float obserwowanaWielkoscGwiazdowa;
    public float getObserwowanaWielkoscGwiazdowa() {
        return obserwowanaWielkoscGwiazdowa;
    }
    public void setObserwowanaWielkoscGwiazdowa(float wielkosc) {
        this.obserwowanaWielkoscGwiazdowa = wielkosc;
    }

    private float absolutnaWielkoscGwiazdowa;
    public float getAbsolutnaWielkoscGwiazdowa() {
        return absolutnaWielkoscGwiazdowa;
    }
    public void setAbsolutnaWielkoscGwiazdowa(float wielkosc) {
        this.absolutnaWielkoscGwiazdowa = wielkosc;
    }

    private float odleglosc;
    public float getOdleglosc() {
        return odleglosc;
    }
    public void setOdleglosc(float odleglosc) {
        this.odleglosc = odleglosc;
    }

    private Gwiazdozbior gwiazdozbior;
    public Gwiazdozbior getGwiazdozbior() {return gwiazdozbior;}
    public void setGwiazdozbior(Gwiazdozbior gwiazdozbior) {
        this.gwiazdozbior = gwiazdozbior;
    }

    private String polkula;
    public String getPolkula() {
        return polkula;
    }
    public void setPolkula(String polkula) {
        this.polkula = polkula;
    }

    private int temperatura;
    public Integer getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    private float masa;
    public Float getMasa() {
        return masa;
    }
    public void setMasa(Float masa) {
        this.masa = masa;
    }

    private Wspolrzedne wspolrzedne;
    public Wspolrzedne getWspolrzedne() {
        return wspolrzedne;
    }
    public void setWspolrzedne(Wspolrzedne wspolrzedne) {
        this.wspolrzedne = wspolrzedne;
    }

    public Gwiazda(String nazwa, String nazwaKatalogowa, float obserwowanaWielkoscGwiazdowa, float absolutnaWielkoscGwiazdowa, float odleglosc, Gwiazda gwiazdozbior, String polkula, int temperatura, float masa, Wspolrzedne wspolrzedne){

    }
}

