package pr10.ChairFactory;

public class VictorianChair implements Chair {
    private int age;

    VictorianChair(int age)
    {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            this.age = age;
        else
            this.age = 0;
    }
}
