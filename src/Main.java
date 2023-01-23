import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Gwiazdozbior Rak = new Gwiazdozbior("Rak");
        Gwiazdozbior MalyWoz = new Gwiazdozbior("Mały Wóz");
        Gwiazda.DodajGwiazde("A3456BA", -15, 10, Rak, "PD", 2000, 1.05, "-19 stopni 43 minut 53.42 sekund", "13 h 23 m 31 s");
        Gwiazda.DodajGwiazde("BX56S45", 10, 107, Rak, "PN", 2957, 2, "39 stopni 51 minut 21.37 sekund", "21 h 19 m 22 s");
        Gwiazda.DodajGwiazde("XS897A1", 13, 256, Rak, "PD", 3456, 2.5, "-12 stopni 16 minut 51.91 sekund", "04 h 28 m 57 s");
        Gwiazda.DodajGwiazde("FQ513B3", 14, 300, MalyWoz, "PN", 3456, 2.5, "12 stopni 16 minut 51.91 sekund", "04 h 28 m 57 s");
        Rak.WyswietlWszystkieGwiazdy();
        Gwiazda.UsunGwiazde("Β Rak");
        Rak.WyswietlWszystkieGwiazdy();
        Gwiazda.PotencjalnaSupernowa();
    }
}

