package lw3.ex1;

public abstract class Dish {
    private String name;
    private boolean isClean;
    private boolean isBroke;

    public Dish(String name, boolean isClean, boolean isBroke) {
        this.name = name;
        this.isClean = isClean;
        this.isBroke = isBroke;
    }

    public void wash()
    {
        if (!isClean)
        {
            setClean(true);
            System.out.println("You washed " + name);
        }
        else
            System.out.println(name + " is clean");
    }

    public boolean repair()
    {
        if (isBroke)
        {
            if (Math.random() < .5)
            {
                System.out.println("You successfully repair " + name);
                isBroke = false;
                return true;
            }
            else {
                System.out.println("Unlucky( " + name + " still broke");
                return false;
            }
        }
        System.out.println(name + " is not broke");
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isBroke() {
        return isBroke;
    }

    public void setBroke(boolean broke) {
        isBroke = broke;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", isClean=" + isClean +
                ", isBroke=" + isBroke +
                '}';
    }
}
