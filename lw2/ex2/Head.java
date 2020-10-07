package lw2.ex2;

public class Head {
    private String hairColor;
    private String eyesColor;
    private int hairLength;

    Head(Head anotherHead)
    {
        setHairLength(anotherHead.hairLength);
        this.hairColor = anotherHead.hairColor;
        this.eyesColor = anotherHead.eyesColor;
    }

    Head(int hairLength, String hairColor, String eyesColor)
    {
        setHairLength(hairLength);
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        if (hairLength < 0)
            this.hairLength = 0;
        else
            this.hairLength = hairLength;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                ", hairLength=" + hairLength +
                '}';
    }
}
