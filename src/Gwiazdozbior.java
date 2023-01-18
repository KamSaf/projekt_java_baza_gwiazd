import java.util.ArrayList;

public class Gwiazdozbior {
    private String nazwaGwiazdozbioru;
    private String gwiazdy = "ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ";
    private int numerGwiazdy = 0;

    public String getGwiazdy(){return gwiazdy;}
    public char getGwiazda(int numer){return gwiazdy.charAt(numer);}

    public int getNumerGwiazdy(){return numerGwiazdy;}
    public void setNumerGwiazdy(){this.numerGwiazdy += 1;}

    public String getNazwaGwiazdozbioru() {
        return nazwaGwiazdozbioru;
    }
    public void setNazwaGwiazdozbioru(String nazwa) {this.nazwaGwiazdozbioru = nazwa;}

    private ArrayList<String> listaGwiazd;
    public ArrayList<String> getListaGwiazd() {
        return listaGwiazd;
    }
    public void setListaGwiazd(ArrayList<String> lista) {
        this.listaGwiazd = lista;
    }

    public void WczytajZPliku(String sciezka){
        System.out.println("Funkacja w budowie");
    }

    public void ZapiszDoPliku(String sciezka){
            System.out.println("Funkacja w budowie");
    }
}
