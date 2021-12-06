package review.java.fundamentals;

public class Cone extends SolidFigures{
    private static double height;
    public Cone(double radius,double height){
        super(radius);
       this. height = height;
        //System.out.println(height);
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public void surfaceArea(){
        double surfaceAreaOfCone = Math.PI*getRadius()*getHeight();
        System.out.println("the surface area of the cone is:"+ surfaceAreaOfCone);

    }
    @Override
    public void volume(){
        double volumeOfCone = 1/3*(Math.pow(getRadius(),2)*getHeight());
        System.out.println("the volume of the cone is:" +volumeOfCone);

    }
    public double getHeight(){
        return height;
    }

    @Override
    public void setRadius() {

    }
    public double getRadius(){
        return radius;
    }

    @Override
    public int compare(SolidFigures o1, SolidFigures o2) {
        return 0;
    }

}
