package review.java.fundamentals;

public class MarbleComic extends ComicBooks{
    public MarbleComic(String author, String title, String yearOfpublication, String character){
        super(author,title,yearOfpublication,character);
        System.out.println();
    }

    @Override
    public String getInitial() {
        return "MR";
    }

    @Override
    public void setTitle() {
        System.out.println("title");


    }
  //  @Override
    public void setIssueNumber(){
       this.issueNumber = issueNumber;
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
    public int getId() {
        return  970076;
    }

    public void setCharacter() {
        System.out.println("character");

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
        return null;
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
        return 35;
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
