package solid.srp;

public class SquareDraw {
    private int side;
    public SquareDraw(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < side-2; i++) {
            System.out.print("* ");
            for (int j = 1; j < side - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < side; i++) {
            System.out.print("* ");
        }
    }
}
