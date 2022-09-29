public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Osoba jas = new Osoba("Jaś",10); // nie można bo klasa Osoba abstrakcyjna
        //
        //System.out.println(jas.getImie());
        //System.out.println(jas);
        Uczen janek = new Uczen("Jaś",11);
        System.out.println(janek);
        Nauczyciel wit1 = new Wychowawca("Witek",27,"przedmioty zawodowe");
        System.out.println(wit1);
        Klasa kl3P = new Klasa("3P");
        kl3P.dodajUczniaDoKlasy(janek);
        Szkola szkola = Szkola.getSzkola();
        szkola.dodajUczniaDoKlasy(janek,kl3P);


    }
}