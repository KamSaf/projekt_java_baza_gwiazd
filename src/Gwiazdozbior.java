import java.util.ArrayList;

public class Gwiazdozbior {
    private String nazwaGwiazdozbioru;
    private String gwiazdy = "ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ";    // Baza symboli gwiazd dodawanych do bazy
    private ArrayList<Integer> listaGwiazd; // Lista indeksów gwiazd (Gwiazda.instancje) wchodzących w skład gwiazdozbioru
    private int numerGwiazdy = 0;

    public char getGwiazda(int numer){return gwiazdy.charAt(numer);}    // Metoda zwracająca symbol następnej dodanej do gwiazdozbioru gwiazdy

    public int getNumerGwiazdy(){return numerGwiazdy;}
    public void setNumerGwiazdy(){this.numerGwiazdy += 1;}  // Metoda zwiększająca indeks symbolu następnej dodanej do gwiazdozbioru gwiazdy

    public String getNazwaGwiazdozbioru() {
        return nazwaGwiazdozbioru;
    }
    //public void setNazwaGwiazdozbioru(String nazwa) {this.nazwaGwiazdozbioru = nazwa;}

    public ArrayList<Integer> getListaGwiazd() {
        return listaGwiazd;
    }
    //public void setListaGwiazd(ArrayList<Integer> lista) {this.listaGwiazd = lista;}

    public Gwiazdozbior(String nazwa){ // Konstruktor
        this.nazwaGwiazdozbioru = nazwa;
        this.listaGwiazd = new ArrayList<Integer>();
    }

    public void DodajDoGwiazdozbioru(Integer indeks){this.listaGwiazd.add(indeks);}   //Metoda dodająca indeks gwiazdy z pola Gwiazda.instancja do gwiazdozbioru

    public void WczytajZPliku(String sciezka){
        System.out.println("Funkacja w budowie");
    }

    public void ZapiszDoPliku(String sciezka){
            System.out.println("Funkacja w budowie");
    }
}
