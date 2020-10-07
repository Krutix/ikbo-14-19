package lw4;

public class Dog implements Nameble{
    private String name = "None";
    private int age = 0;
    public boolean isVaccinated = false;

    Dog(String newName, int newAge, boolean vaccinated){
        name = newName;
        age = newAge;
        isVaccinated = vaccinated;
    }

    public void bark()
    {
        System.out.println("Wuf");
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
