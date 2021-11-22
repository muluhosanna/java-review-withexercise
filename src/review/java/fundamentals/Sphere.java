package review.java.fundamentals;

public class Sphere extends SolidFigures{
    public Sphere(double radius){
       super(radius);
    }
    @Override
    public void setRadius(){

    }
    @Override
    public double getRadius(){
        return radius;
    }
    @Override
    public void surfaceArea(){
        double surfaceArea = 4*Math.PI*Math.pow(getRadius(),2);
        System.out.println("the surface area of the spher is :"+ surfaceArea);

    }
    public void volume(){
        double volume = 4.0/3.0*Math.PI*Math.pow(getRadius(),3);
        System.out.println("the volume of the Sphere:" + volume);

    }
}
