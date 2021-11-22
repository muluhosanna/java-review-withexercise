package review.java.fundamentals;

public abstract class ComicBooks implements ComicBookInterface{
    protected String title;
    protected String author;
    protected String character;
    protected double price;
    protected String issueNumber;
    private String yearOfpublication;
    protected String volume;
    protected static int id = 970076;
   // protected String initial;
    protected ComicBooks(boolean real) {

    }

    //the following are methods that we apply in this class
    //borrow()
    //rent()
    //buy
    //return()
    //create shelf
    //use book Id to make shelf,for selling,returning,buying, etc
    //create list of the marble dc and image comic book
    //create inventory of 10 items of image, marble and dc books
    public ComicBooks(String author,String title,String yearOfpublication,String character ){
        this.author =author;
        this.character =character;
        this.title  = title;
        this.yearOfpublication = yearOfpublication;
        //id =++id;
    }

    //protected abstract String issueNumber();

    public void setIssueNumber(String issueNumber){
        this.issueNumber =issueNumber;
    }
   // public abstract void setInitial();
    public abstract String getInitial();

    public abstract void setTitle();
   // public abstract void setId();
    public abstract int getId();

    public void setCharacter(String character){
        this.character = character;
    };


    public abstract void setPrice();


    public abstract void setYearOfpublication();


    public abstract void setVolume();


    public abstract void setAuthor();

    public abstract String getTitle();


    public abstract String getAuthor();


    public abstract String getCharacte();

    public abstract double getPrice();

    public  String getIssueNumber(){
        return issueNumber;
    }

    public abstract String getYearOfpublication();
    public String getVolume(){
        return volume;
    };
    }


