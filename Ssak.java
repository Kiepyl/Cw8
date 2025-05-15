public class Ssak extends Zwierze{
    private String zoo;

    public Ssak(String name, int wiek, String zoo) {
        super(name, wiek);
        this.zoo = zoo;
    }

    @Override
    public String wydajDzwiek() {
        return "";
    }
    @Override
    public String poruszajSie(){
        return "";
    }
}
