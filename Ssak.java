public class Ssak extends Zwierze{
    private boolean czyAgresywny;

    public Ssak(String name, int wiek, boolean czyAgresywny) {
        super(name, wiek);
        this.czyAgresywny = czyAgresywny;
    }

    @Override
    public String wydajDzwiek() {
        return "szczurkuje sobie";
    }
    @Override
    public String poruszajSie(){
        return "tup tup tup tup tup tup";
    }
    public void podajLekiUspokojenie(){
        if (czyAgresywny){
            czyAgresywny = false;
            System.out.println("Twoje zwierzatko jest juz spokojne.");
        }
        else System.out.println("Twoje zwierzatko poszlo spac.");
    }
}
