public class Dog {
    private String name = "None";
    private int age = 0;
    public boolean isVaccinated = false;

    Dog(){}

    Dog(String newName){
        name = newName;
    }

    Dog(String newName, int newAge){
        name = newName;
        age = newAge;
    }

    Dog(String newName, int newAge, boolean vaccinated){
        name = newName;
        age = newAge;
        isVaccinated = vaccinated;
    }

    public void setName(String newName) {
        name = newName;
    }

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
