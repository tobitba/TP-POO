package backend.model;

//CAMBIO IMPLEMENTS POR EXTENDS
public class Square extends Rectangle {
    public Square(Point topLeft, double size) {
        super(topLeft, new Point(topLeft.x + size, topLeft.y + size));
    }

    @Override
    public String toString() {
        return String.format("Cuadrado [ %s , %s ]", topLeft, bottomRight);
    }

}
