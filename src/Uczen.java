public class Uczen extends Osoba{
    private int nrUcznia;
    public static int liczbaUczniow;

    public Uczen(String imie, int wiek) {
        super(imie, wiek); // wywołanie konstruktora klasy bazowej
        liczbaUczniow++;
        this.nrUcznia = liczbaUczniow;

    }
}
