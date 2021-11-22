package review.java.fundamentals;
//import java.lang.String;
public abstract class OopHouse implements HouseInterface{
    private int externalDoors;
    private int internalDoors;
    private int numberOfWindows;
    private int numberOfGarageDoors;
    private String exteriorColor;
    private String roofType;
    private boolean hasHardwoodFloors;
    private boolean hasBasement;
    public OopHouse(){
        this(2,10,9,2,"White","Shingle");//initialization
    }
    public OopHouse(int externalDoors, int internalDoors, int numberOfWindows, int numberOfGarageDoors) {
        this(externalDoors,internalDoors,numberOfWindows,numberOfGarageDoors ,"white", "composite");
    }

    public OopHouse(int externalDoors, int internalDoors, int numberOfWindows, int numberOfGarageDoors, String exteriorColor, String roofType) {
        this.externalDoors = externalDoors;
        this.internalDoors = internalDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfGarageDoors = numberOfGarageDoors;
        this.exteriorColor = exteriorColor;
        this.roofType = roofType;
    }
    public void hasBasement(boolean basement){
        hasBasement = basement;
    }
    public void hasHardwoodFloors(boolean hardwoodFloors){
        hasHardwoodFloors =hardwoodFloors;
    }

    public int getExternalDoors() {
        return externalDoors;
    }

    public int getInternalDoors() {
        return internalDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getNumberOfGarageDoors() {
        return numberOfGarageDoors;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public String getRoofType() {
        return roofType;
    }
}
