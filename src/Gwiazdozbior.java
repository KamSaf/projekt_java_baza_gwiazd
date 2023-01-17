import java.util.ArrayList;

public class Gwiazdozbior {
    private String nazwaGwiazdozbioru;
    public String getNazwaGwiazdozbioru() {
        return nazwaGwiazdozbioru;
    }
    public void setNazwaGwiazdozbioru(String nazwa) {
        this.nazwaGwiazdozbioru = nazwa;
    }

    private ArrayList<String> listaGwiazd;
    public ArrayList<String> getListaGwiazd() {
        return listaGwiazd;
    }
    public void setListaGwiazd(ArrayList<String> lista) {
        this.listaGwiazd = lista;
    }
}
