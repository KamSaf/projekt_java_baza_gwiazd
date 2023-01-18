import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Gwiazdozbior Rak = new Gwiazdozbior("Rak");
        Gwiazda.DodajGwiazde("A3456BC", -15, 10, Rak, "PD", 3500, 1.5, "19 stopni 43 minuty 73.42 sekundy", "13 h 23 m 31 s");
        for (int i=0; i<Rak.getListaGwiazd().size(); i++){
            Rak.getListaGwiazd().get(i).WyswietlDaneGwiazdy();
        }
    }
}

