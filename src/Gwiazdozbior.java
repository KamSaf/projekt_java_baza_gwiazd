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
    public void setListaGwiazd(ArrayList<Integer> lista) {this.listaGwiazd = lista;}

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

    public void AktualizujNazwy(){  // Metoda aktualizująca nazwy katalogowe gwiazd po usunięciu gwiazdy
        this.numerGwiazdy = 0;
        for (int i=0; i<listaGwiazd.size(); i++) {
            Gwiazda.getInstancje().get(listaGwiazd.get(i)).setNazwaKatalogowa("" + this.getGwiazda(this.numerGwiazdy) + " " + this.nazwaGwiazdozbioru);
            setNumerGwiazdy();
        }
    }

    public void UsunIndeks(Integer indeks){ // Metoda usuwająca indeks gwiazdy z listy gwiazd gwiazdozbioru
        for (int i=0; i<listaGwiazd.size(); i++){
            if (listaGwiazd.get(i) == indeks){
                listaGwiazd.remove(i);
            }
        }
    }

    public void WyswietlWszystkieGwiazdy(){	// Metoda wyświetlająca wszystkie gwiazdy w gwiazdozbiorze
        for (int i = 0; i<this.listaGwiazd.size(); i++){
            Gwiazda.getInstancje().get(listaGwiazd.get(i)).WyswietlDaneGwiazdy();
        }
    }
}
