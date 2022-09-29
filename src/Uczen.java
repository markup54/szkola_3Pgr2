public class Uczen extends Osoba implements Dyzurny{
    private int nrUcznia;
    public static int liczbaUczniow;

    public Uczen(String imie, int wiek) {
        super(imie, wiek); // wywołanie konstruktora klasy bazowej
        liczbaUczniow++;
        this.nrUcznia = liczbaUczniow;
    }

    public Uczen(int nrUcznia,String zmienna) {
        setImie(zmienna);
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "Uczen{ imie:" +imie+
                " wiek: "+getWiek()+
                "nrUcznia=" + nrUcznia +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Czysta tablica");
    }
}
