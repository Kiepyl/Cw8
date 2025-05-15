public class Ptak extends Zwierze{
    private boolean czyLata;

    public Ptak(String name, int wiek, boolean czyLata){
        super(name, wiek);
        this.czyLata = czyLata;
    }

    @Override
    public String wydajDzwiek(){
        return "cwierku cwierk";
    }
    @Override
    public String poruszajSie(){
        return "fruuuuuuu";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "las";
    }
    public void odetnijSkrzydla(){
        czyLata = !czyLata;
        System.out.println("Ty potworze czemu to zrobiles... " + "Czy ten ptak moze latac? " + czyLata);
    }
}
