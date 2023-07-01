package backend.model;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Figure {

    protected final Point topLeft, bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    @Override
    public String toString() {
        return String.format("Rectángulo [ %s , %s ]", topLeft, bottomRight);
    }

    @Override
    public List<Point> getPoints(){
        List<Point> toRet = new ArrayList<>();
        toRet.add(topLeft); toRet.add(bottomRight);
        return toRet;
    }

}
