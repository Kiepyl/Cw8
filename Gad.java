public class Gad extends Zwierze{
    private char sex;

    public Gad(String name, int wiek, char sex){
        super(name, wiek);
        this.sex = sex;
    }

    @Override
    public String wydajDzwiek(){
        return "syk syk";
    }
    @Override
    public String poruszajSie(){
        return "chlup chlup";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "Ocean";
    }
    public void zmienPlec(){
        if (sex == 'M'){
            sex = 'F';
            System.out.println("Twoje zwierzatko jest teraz kobita.");
        }
        else{
            sex = 'M';
            System.out.println("Twoje zwierzatko jest teraz chopem");
        }
    }
}
