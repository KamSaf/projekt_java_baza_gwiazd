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

    public static boolean nazwaSprawdzenie(String nazwa){
        int licznikLiter = 0;
        int licznikCyfr = 0;
        for (int i = 0; i<nazwa.length(); i++){
            if (((int)nazwa.charAt(i) > 64 && (int)nazwa.charAt(i) < 91)){
                licznikLiter += 1;
            }
            else if ((int)nazwa.charAt(i) > 47 && (int)nazwa.charAt(i) < 58){
                licznikCyfr += 1;
            }
        }
        if (licznikCyfr == 4 && licznikLiter == 3){
            return true;
        }
        else{
            return false;
        }
    }

    public Gwiazda(String nazwa, float obserwowanaWielkoscGwiazdowa, float absolutnaWielkoscGwiazdowa, float odleglosc, Gwiazdozbior gwiazdozbior, String polkula, int temperatura, float masa, Wspolrzedne wspolrzedne){
        if (Gwiazda.nazwaSprawdzenie(nazwa))
        {
            this.nazwa = nazwa;
        }
        else{
            throw new IllegalArgumentException("Podano błędną nazwę Gwiazdy");
        }
        this.nazwaKatalogowa = ""+gwiazdozbior.getGwiazda(gwiazdozbior.getNumerGwiazdy())+" "+ gwiazdozbior.getNazwaGwiazdozbioru();
        gwiazdozbior.setNumerGwiazdy();

    }
}

