package backend.model;
//AHORA EXTIENDE A ELLIPSE
public class Circle extends Ellipse {
    public Circle(Point centerPoint, double radius) {
        super(centerPoint,2*radius, 2*radius);
    }

    @Override
    public String toString() {
        return String.format("Círculo [Centro: %s, Radio: %.2f]", centerPoint, getRadius());
    }
    public double getRadius() {
        return getsMayorAxis()/2;
    }

}
