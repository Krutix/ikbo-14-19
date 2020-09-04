package Shape;

public class Square extends Rectangle {
    Square(){}

    Square(double side){
        setSide(side);
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public double getSide(){
        return width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
