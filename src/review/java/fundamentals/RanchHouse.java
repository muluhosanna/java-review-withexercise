package review.java.fundamentals;

public class RanchHouse extends OopHouse {
    public RanchHouse(){
        this(3,12,10);
    }
    public RanchHouse(int externalDoors, int internalDoors, int numberOfWindows){
        super(externalDoors, internalDoors,numberOfWindows, 2,
                "Medium Gray","Composite"
        );

    }
    @Override
    public void hasBasement(boolean basement ) {
        super.hasBasement(basement);
    }

    @Override
    public void hasHardwoodFloors(boolean floor) {
        super.hasHardwoodFloors(floor);
    }

}
