package lw5.ex1;

import java.awt.*;

public class Square extends Rectangle {
    Square(int x, int y, int side, Color color, boolean isFilled){
        super(x, y, side, side, color, isFilled);
    }

    @Override
    public void setWidth(int side){
        setSide(side);
    }

    @Override
    public void setLength(int side){
        setSide(side);
    }

    public void setSide(int side){
        this.width = side;
        this.length = side;
    }

    public int getSide(){
        return width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
