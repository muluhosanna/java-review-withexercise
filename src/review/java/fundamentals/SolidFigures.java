package review.java.fundamentals;

public abstract class SolidFigures {
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
