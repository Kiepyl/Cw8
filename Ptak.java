public class Ptak extends Zwierze{
    private boolean czyLata;

    public Ptak(String name, int wiek, boolean czyLata){
        super(name, wiek);
        this.czyLata = czyLata;
    }

    @Override
    public String wydajDzwiek(){
        return "";
    }
    @Override
    public String poruszajSie(){
        return "";
    }
}
