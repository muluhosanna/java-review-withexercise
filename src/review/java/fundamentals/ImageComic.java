package review.java.fundamentals;

public class ImageComic extends ComicBooks{
    public ImageComic(String author, String title, String yearOfpublication, String character) {
        super(author, title, yearOfpublication, character);
        id = ++id;
    }

    public String getInitial(){
        return "IM";
    }


    @Override
    public void setTitle() {

    }

    public void setId(){this.id =id;

    }
    public int getId(){
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
   // @Override
    //public void setIssueNumber(){
      //  this.issueNumber = issueNumber;
    //}


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
        return 2.00;
    }

    @Override
    public String getIssueNumber() {
        return issueNumber;
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
