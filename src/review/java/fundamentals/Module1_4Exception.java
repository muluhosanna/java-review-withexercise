package review.java.fundamentals;

public class Module1_4Exception {
    RanchHouse house;
    public void exampleException(){
        RanchHouse[] house = {new RanchHouse(),new RanchHouse(), new RanchHouse()};
        try{
            System.out.println(house[3].getExteriorColor());

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch (NullPointerException ax){
            System.out.println(ax.getMessage());
        }


    }

}
