package review.java.fundamentals;

import java.util.Comparator;

public abstract class SolidFigures implements Comparator<SolidFigures> {
    protected static double radius;
    //public static double height
    public SolidFigures(double radius){
        this.radius = radius;
    }
    public abstract void surfaceArea();
    public abstract void volume();
    public abstract void setRadius();
    public abstract double getRadius();

}
