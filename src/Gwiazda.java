import java.util.ArrayList;

public class Gwiazda {
    private static ArrayList<Gwiazda> instancje  = new ArrayList<Gwiazda>();
    public static ArrayList<Gwiazda> getInstancje(){ return instancje;}
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


    private static boolean nazwaSprawdzenie(String nazwa){ //Metoda sprawdzj??ca poprawno???? wprowadzonej nazwy gwiazdy
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

    private static boolean SprawdzenieDeklinacja(String deklinacja){    //Metoda sprawdzj??ca poprawno???? oraz format wprowadzonych parametr??w deklinacji
        String[] podzieloneWartosci = deklinacja.split(" ");
        int licznikPoprawnychZnakow = 0;
        if (Integer.parseInt(podzieloneWartosci[0]) > -91 && Integer.parseInt(podzieloneWartosci[0]) < 91){
            licznikPoprawnychZnakow+=1;
        }
        if (Integer.parseInt(podzieloneWartosci[2]) > 0 && Integer.parseInt(podzieloneWartosci[2]) < 61){
            licznikPoprawnychZnakow+=1;
        }
        if (Float.parseFloat(podzieloneWartosci[4]) > 0 && Float.parseFloat(podzieloneWartosci[4]) < 61.00){
            licznikPoprawnychZnakow+=1;
        }
        if (podzieloneWartosci[1].equals("stopni")){
            licznikPoprawnychZnakow+=1;
        }
        if (podzieloneWartosci[3].equals("minut")){
            licznikPoprawnychZnakow+=1;
        }
        if (podzieloneWartosci[5].equals("sekund")){
            licznikPoprawnychZnakow+=1;
        }
        if (licznikPoprawnychZnakow == 6){
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean SprawdzenieRektascensja(String rektascensja){    //Metoda sprawdzj??ca poprawno???? oraz format wprowadzonych parametr??w rekstascensji
        String[] podzieloneWartosci = rektascensja.split(" ");
        int licznikPoprawnychZnakow = 0;
        if (Integer.parseInt(podzieloneWartosci[0]) > 0 && Integer.parseInt(podzieloneWartosci[0]) < 25){
            licznikPoprawnychZnakow+=1;
        }
        if (Integer.parseInt(podzieloneWartosci[2]) > 0 && Integer.parseInt(podzieloneWartosci[2]) < 61){
            licznikPoprawnychZnakow+=1;

        }
        if (Integer.parseInt(podzieloneWartosci[4]) > 0 && Integer.parseInt(podzieloneWartosci[4]) < 61){
            licznikPoprawnychZnakow+=1;
        }
        if (podzieloneWartosci[1].equals("h")){
            licznikPoprawnychZnakow+=1;
        }
        if (podzieloneWartosci[3].equals("m")){
            licznikPoprawnychZnakow+=1;
        }
        if (podzieloneWartosci[5].equals("s")){
            licznikPoprawnychZnakow+=1;
        }
        if (licznikPoprawnychZnakow == 6){
            return true;
        }
        else{
            return false;
        }
    }

    private Gwiazda(String nazwa, float obserwowanaWielkoscGwiazdowa, float odleglosc, Gwiazdozbior gwiazdozbior, // Konstruktor sprawdzaj??cy poprawno???? wprowadzonych danych, wyrzucaj??cy wyj??tek w przypadku b????dnych danych
                    String polkula, int temperatura, double masa, String deklinacja, String rektascensja){
        if (Gwiazda.nazwaSprawdzenie(nazwa))
        {
            this.nazwa = nazwa;
        }
        else{
            throw new IllegalArgumentException("Podano b????dn?? nazw?? Gwiazdy.");
        }
        if (gwiazdozbior == null){
            throw new IllegalArgumentException("Podano b????dn?? nazw?? gwiazdozbioru.");
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
            throw new IllegalArgumentException("Podano b????dn?? obserwowan?? wielko???? gwiazdow??.");
        }
        this.odleglosc = odleglosc;
        this.absolutnaWielkoscGwiazdowa = (float)(this.obserwowanaWielkoscGwiazdowa - 5*Math.log10(this.odleglosc/3.26));
        if ((polkula.equals("PN") && (int)deklinacja.charAt(0) != 45) || (polkula.equals("PD") && (int)deklinacja.charAt(0) == 45)){
            this.polkula = polkula;
        }
        else{
            throw new IllegalArgumentException("Podano b????dny symbol p????kuli.");
        }
        if (temperatura >= 2000){
            this.temperatura = temperatura;
        }
        else{
            throw new IllegalArgumentException("Podano za nisk?? temperatur?? gwiazdy.");
        }
        if (masa >= 0.1 && masa < 50){
            this.masa = masa;
        }
        else{
            throw new IllegalArgumentException("Podano b????dn?? mas?? gwiazdy.");
        }
        this.deklinacja = deklinacja;
        if(Gwiazda.SprawdzenieRektascensja(rektascensja)){
            this.rektascensja = rektascensja;
        }
        else{
            throw new IllegalArgumentException("Podano b????dn?? warto??c rekstascensji.");
        }
        if(Gwiazda.SprawdzenieDeklinacja(deklinacja)){
            this.deklinacja = deklinacja;
        }
        else{
            throw new IllegalArgumentException("Podano b????dn?? warto??c deklinacji.");
        }
    }

    public void WyswietlDaneGwiazdy(){ // Metoda wy??wietlaj??ca wszystkie dane wybanej gwiazdy
        System.out.println("Nazwa: "+this.getNazwa()+"\n"+"Nazwa Katalogowa: "+this.getNazwaKatalogowa()+"\n"+
                "Obserwowalna Wielko???? Gwiazdowa: "+this.getObserwowanaWielkoscGwiazdowa()+"\n"+"Absolutna wielko???? gwiazdowa: "+
                this.getAbsolutnaWielkoscGwiazdowa()+"\n"+"Odleg??o????: "+this.getOdleglosc()+"\n"+"Gwiazdozbi??r: "+this.getNazwaGwiazdozbioru()+"\n"+
                "P????kula: "+this.getPolkula()+"\n"+"Temperatura: "+this.getTemperatura()+"\n"+"Masa: "+this.getMasa()+"\n"+"Deklinacja: "+
                this.getDeklinacja()+"\n"+"Rektascensja: "+this.getRektascensja()+"\n");

    }

    public static void DodajGwiazde(String nazwa, float obserwowanaWielkoscGwiazdowa, float odleglosc, // Metoda tworz??ca obiekt klasy Gwiazda, dodaj??ca go do pola instancje oraz przypisuj??ca go do gwiazdozbioru
                                    Gwiazdozbior gwiazdozbior, String polkula, int temperatura, double masa, String deklinacja, String rektascensja){
        //gwiazdozbior.DodajDoGwiazdozbioru(new Gwiazda(nazwa, obserwowanaWielkoscGwiazdowa, odleglosc, gwiazdozbior, polkula, temperatura, masa, deklinacja, rektascensja)); stara wersja
        Gwiazda.instancje.add(new Gwiazda(nazwa, obserwowanaWielkoscGwiazdowa, odleglosc, gwiazdozbior, polkula, temperatura, masa, deklinacja, rektascensja));
        gwiazdozbior.DodajDoGwiazdozbioru(Gwiazda.instancje.size()-1);
    }

    public static void UsunGwiazde(String DanaNazwaKatalogowa){ // Metoda usuwaj??ca z bazy gwiazd?? o podanej nazwie katalogowej, usuwaj??ca j?? z gwiazdozbioru oraz aktualizuj??ca pozosta??e nazwy katalogowe w gwiazdozbiorze
        for (int i=0; i< instancje.size(); i++){
            if (instancje.get(i).getNazwaKatalogowa().equals(DanaNazwaKatalogowa)){
                instancje.get(i).getGwiazdozbior().UsunIndeks(i);
                instancje.get(i).getGwiazdozbior().AktualizujNazwy();
                instancje.set(i, null);
                break;
            }
        }
    }

    public static void WyswietlWszystkieGwiazdy(){	// Metoda wy??wietlaj??ca wszystkie gwiazdy w bazie
        for (int i = 0; i<instancje.size(); i++){
            if(Gwiazda.getInstancje().get(i) != null){
                Gwiazda.getInstancje().get(i).WyswietlDaneGwiazdy();
            }
        }
    }

    public static void GwiazdyDanaOdleglosc(double danaOdleglosc){ // Metoda wy??wietlaj??ca wszystkie gwiazdy w podanej odleg??o??ci od Ziemi
        for (int i = 0; i<instancje.size(); i++){
            if (Gwiazda.getInstancje().get(i) != null && ((double)Gwiazda.getInstancje().get(i).getOdleglosc())/3.26 <= danaOdleglosc)
                Gwiazda.getInstancje().get(i).WyswietlDaneGwiazdy();
        }
    }


    public static void GwiazdyDanaTemperatura(int dolnaGranica, int gornaGranica ){ // Metoda wy??wietlaj??ca wszystkie gwiazdy w danym przedziale temperatury
        for (int i = 0; i<instancje.size(); i++){
            if (Gwiazda.getInstancje().get(i) != null && Gwiazda.getInstancje().get(i).getTemperatura() >= dolnaGranica && Gwiazda.getInstancje().get(i).getTemperatura() <= gornaGranica)
                Gwiazda.getInstancje().get(i).WyswietlDaneGwiazdy();
        }
    }


    public static void GwiazdyDanaWielkosc(int dolnaGranica, int gornaGranica ){ // Metoda wy??wietlaj??ca wszystkie gwiazdy w danym przedziale wielkosci
        for (int i = 0; i<instancje.size(); i++){
            if (Gwiazda.getInstancje().get(i) != null && Gwiazda.getInstancje().get(i).getObserwowanaWielkoscGwiazdowa() >= dolnaGranica && Gwiazda.getInstancje().get(i).getObserwowanaWielkoscGwiazdowa() <= gornaGranica)
                Gwiazda.getInstancje().get(i).WyswietlDaneGwiazdy();
        }
    }


    public static void GwiazdyDanaPolkula(String danaPolkula){ // Metoda wy??wietlaj??ca wszystkie gwiazdy z danej p????kuli Ziemi
        for (int i = 0; i<instancje.size(); i++){
            if (Gwiazda.getInstancje().get(i) != null && Gwiazda.getInstancje().get(i).getPolkula().equals(danaPolkula))
                Gwiazda.getInstancje().get(i).WyswietlDaneGwiazdy();
        }
    }


    public static void PotencjalnaSupernowa(){ // Metoda wy??wietlaj??ca wszystkie gwiazdy, kt??re mog?? by?? potencjalnymi supernowymi
        for (int i = 0; i<instancje.size(); i++){
            if (Gwiazda.getInstancje().get(i) != null && Gwiazda.getInstancje().get(i).getMasa() > 1.44)
                Gwiazda.getInstancje().get(i).WyswietlDaneGwiazdy();
        }
    }
}

