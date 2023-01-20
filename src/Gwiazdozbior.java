import java.util.ArrayList;

public class Gwiazdozbior {
    private String nazwaGwiazdozbioru;
    private String gwiazdy = "ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ";
    private ArrayList<Gwiazda> listaGwiazd;
    private int numerGwiazdy = 0;

    public char getGwiazda(int numer){return gwiazdy.charAt(numer);}

    public int getNumerGwiazdy(){return numerGwiazdy;}
    public void setNumerGwiazdy(){this.numerGwiazdy += 1;}

    public String getNazwaGwiazdozbioru() {
        return nazwaGwiazdozbioru;
    }
    public void setNazwaGwiazdozbioru(String nazwa) {this.nazwaGwiazdozbioru = nazwa;}

    public ArrayList<Gwiazda> getListaGwiazd() {
        return listaGwiazd;
    }
    public void setListaGwiazd(ArrayList<Gwiazda> lista) {
        this.listaGwiazd = lista;
    }

    public Gwiazdozbior(String nazwa){
        this.nazwaGwiazdozbioru = nazwa;
        this.listaGwiazd = new ArrayList<Gwiazda>();
    }

    public void DodajDoGwiazdozbioru(Gwiazda g){
        this.listaGwiazd.add(g);
    }

    public void WczytajZPliku(String sciezka){
        System.out.println("Funkacja w budowie");
    }

    public void ZapiszDoPliku(String sciezka){
            System.out.println("Funkacja w budowie");
    }
}
