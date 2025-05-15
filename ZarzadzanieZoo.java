public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Ptak ptak1 = new Ptak("Wrobel", 3, true);
        System.out.println(ptak1.wydajDzwiek());
        ptak1.wyswietlInfo();
        ptak1.odetnijSkrzydla();
        Gad gad1 = new Gad("Zolw", 20, 'M');
        System.out.println(gad1.wydajDzwiek());
        gad1.wyswietlInfo();
        gad1.zmienPlec();
        Ssak ssak1 = new Ssak("Szczurek", 1, false);
        System.out.println(ssak1.wydajDzwiek());
        ssak1.wyswietlInfo();
        System.out.println(ssak1.poruszajSie());
        ssak1.podajLekiUspokojenie();
    }
}
