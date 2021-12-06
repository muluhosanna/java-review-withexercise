package review.java.fundamentals;

public class Cylinder extends SolidFigures{

    protected static double height;
    public Cylinder(double height,double radius){
        super(radius);
        this.height =height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public void surfaceArea(){
        double surfaceAreaofCylinder = 2*Math.PI*getRadius()*getHeight();
        System.out.println("the surface Area of the clindder is:"+surfaceAreaofCylinder);

    }
    @Override
    public void volume(){
        double volumeOfCylinder =Math.PI*Math.pow(getRadius(),2)*getHeight();
        System.out.println("the volume of the cylinder is :"+volumeOfCylinder);

    }
    public double getHeight(){
        return height;
    }

    @Override
    public void setRadius() {


    }
    @Override
    public double getRadius(){
        return radius;
    }

    @Override
    public int compare(SolidFigures o1, SolidFigures o2) {

        return 0;
    }


}
