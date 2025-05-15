public abstract class Zwierze {
    protected String name;
    protected int age;

    public Zwierze(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract String wydajDzwiek();
    public abstract String poruszajSie();
    public abstract String srodowiskoNaturalne();

    public void wyswietlInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}