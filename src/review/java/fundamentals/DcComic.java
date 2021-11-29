package review.java.fundamentals;

public class DcComic extends ComicBooks{
    public DcComic(String author, String title, String yearOfpublication, String character) {
        super(author,title,yearOfpublication,character);
    }


    @Override
    public String getInitial() {
        return "DC";
    }

    public boolean getIsTellingPastHistory(){
        return true;
    }
    @Override
    public boolean getIsItAllAboutScience(){
        return  false;
    }
    @Override
    public boolean getDoesIttransferKnowledge(){
        return true;
    }
    @Override
    public void setTitle() {

    }



    @Override
    public int getId() {
        return  970076;
    }

    public void setCharacter() {

    }

    @Override
    public void setPrice() {

    }

    @Override
    public void setYearOfpublication() {

    }

    @Override
    public void setVolume() {

    }

    @Override
    public void setAuthor() {

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String getCharacte() {
        return null;
    }

    @Override
    public double getPrice() {
        return 7.00;
    }


    @Override
    public String getYearOfpublication() {
        return null;
    }

    @Override
    public String getVolume() {
        return volume;
    }

}
