package solid.srp;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void zoom(float zoom) {
        side = (int) (side * zoom);
    }


}
