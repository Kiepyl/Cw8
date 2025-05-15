public class Gad extends Zwierze{
    private String sex;

    public Gad(String name, int wiek, String sex){
        super(name, wiek);
        this.sex = sex;
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
