package review.java.fundamentals;

public class TwoStoryHouse extends OopHouse{
    public TwoStoryHouse() {
        this(3, 18,20);
    }

    public TwoStoryHouse(int externalDoors, int internalDoors, int numberOfWindows) {
        super(externalDoors, internalDoors,numberOfWindows, 3,
                "Tan","Cedar");
    }

    @Override
    public void hasHardwoodFloors(boolean floor) {
        super.hasHardwoodFloors(floor);
    }


}
