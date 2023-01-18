import java.util.ArrayList;

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

    private String deklinacja;
    public String getDeklinacja() {
        return deklinacja;
    }
    public void setDeklinacja(String deklinacja) {
        this.deklinacja = deklinacja;
    }

    private String rektascensja;
    public String getRektascensja() {
        return rektascensja;
    }
    public void setRektascensja(String rektascensja) {
        this.rektascensja = rektascensja;
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
    public String getNazwaGwiazdozbioru() {return gwiazdozbior.getNazwaGwiazdozbioru();}
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

    private double masa;
    public double getMasa() {
        return masa;
    }
    public void setMasa(double masa) {
        this.masa = masa;
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

    private Gwiazda(String nazwa, float obserwowanaWielkoscGwiazdowa, float odleglosc, Gwiazdozbior gwiazdozbior, String polkula, int temperatura, double masa, String deklinacja, String rektascensja){
        if (Gwiazda.nazwaSprawdzenie(nazwa))
        {
            this.nazwa = nazwa;
        }
        else{
            throw new IllegalArgumentException("Podano błędną nazwę Gwiazdy.");
        }
        if (gwiazdozbior == null){
            throw new IllegalArgumentException("Podano błędną nazwę gwiazdozbioru.");
        }
        else{
            this.gwiazdozbior = gwiazdozbior;
        }
        this.nazwaKatalogowa = ""+gwiazdozbior.getGwiazda(gwiazdozbior.getNumerGwiazdy())+" "+ gwiazdozbior.getNazwaGwiazdozbioru();
        gwiazdozbior.setNumerGwiazdy();
        if (obserwowanaWielkoscGwiazdowa >= -26.74 && obserwowanaWielkoscGwiazdowa < 15){
            this.obserwowanaWielkoscGwiazdowa = obserwowanaWielkoscGwiazdowa;
        }
        else{
            throw new IllegalArgumentException("Podano błędną obserwowaną wielkość gwiazdową.");
        }
        this.odleglosc = odleglosc;
        this.absolutnaWielkoscGwiazdowa = (float)(this.obserwowanaWielkoscGwiazdowa - 5*Math.log10(this.odleglosc/3.26));
        if (polkula.equals("PN") || polkula.equals("PD")){
            this.polkula = polkula;
        }
        else{
            throw new IllegalArgumentException("Podano błędny symbol półkuli.");
        }
        if (temperatura > 2000){
            this.temperatura = temperatura;
        }
        else{
            throw new IllegalArgumentException("Podano za niską temperaturę gwiazdy.");
        }
        if (masa >= 0.1 && masa < 50){
            this.masa = masa;
        }
        else{
            throw new IllegalArgumentException("Podano błędną masę gwiazdy.");
        }
        this.deklinacja = deklinacja;
        this.rektascensja = rektascensja;
    }

    public void WyswietlDaneGwiazdy(){
        System.out.println("Nazwa: "+this.getNazwa()+"\n"+"Nazwa Katalogowa: "+this.getNazwaKatalogowa()+"\n"+"Obserwowalna Wielkość Gwiazdowa: "+this.getObserwowanaWielkoscGwiazdowa()+"\n"+"Absolutna wielkość gwiazdowa: "+this.getAbsolutnaWielkoscGwiazdowa()+"\n"+"Odległość: "+this.getOdleglosc()+"\n"+"Gwiazdozbiór: "+this.getNazwaGwiazdozbioru()+"\n"+"Półkula: "+this.getPolkula()+"\n"+"Temperatura: "+this.getTemperatura()+"\n"+"Masa: "+this.getMasa()+"\n"+"Deklinacja: "+this.getDeklinacja()+"\n"+"Rektascensja: "+this.getRektascensja());

    }

    public static void DodajGwiazde(String nazwa, float obserwowanaWielkoscGwiazdowa, float odleglosc, Gwiazdozbior gwiazdozbior, String polkula, int temperatura, double masa, String deklinacja, String rektascensja){
        gwiazdozbior.DodajDoGwiazdozbioru(new Gwiazda(nazwa, obserwowanaWielkoscGwiazdowa, odleglosc, gwiazdozbior, polkula, temperatura, masa, deklinacja, rektascensja));
    }
}

