package solid;

import solid.srp.Square;
import solid.srp.SquareDraw;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(side);
        SquareDraw squareDraw = new SquareDraw(side);
        squareDraw.draw();
        System.out.printf("\n Площадь фигуры: %d \n", square.getArea());

        squareDraw.setSide(square.getSide() *2);
        squareDraw.draw();
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());

    }
}
