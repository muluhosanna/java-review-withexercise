package review.java.fundamentals;
import java.util.ArrayList;
public class ComicBookInventory {
    ArrayList<MarbleComic> marbleList;
    ArrayList<ImageComic> imageList;
    ArrayList<DcComic> dcList;
    //private IssueNumberGenerator myIssue;

    public ComicBookInventory() {
        marbleList = new ArrayList<>();//
        imageList = new ArrayList<>();
        dcList = new ArrayList<>();
      // IssueNumberGenerator myIssue = new IssueNumberGenerator();
        buildMarbleInventory();
        buildImageInventory();
        biuldDcInventory();


    }
    public ArrayList<DcComic>getDcList(){
        return dcList;
    }

    public void biuldDcInventory() {
        ArrayList<DcComic>dc1 = new ArrayList<>();
        DcComic dcComic = new DcComic("Ferdiland","Moderen Algebra","2017","decent");
        IssueNumberGenerator myIssue = new IssueNumberGenerator();
        myIssue.getInstance();
        myIssue.setInitialAndId(dcComic.getId(),dcComic.getInitial());
        for (int i= 1;i<=10;i++){
            dcComic = new DcComic("Ferdiland","Moderen Algebra","2017","decent");
            dcComic.setIssueNumber(myIssue.getNextIssueNumber());
            dc1.add(dcComic);
        }
        dcList.addAll(dc1);


    }

    public ArrayList<ImageComic>getImageList(){
        return imageList;
    }

    private void buildImageInventory() {
        ArrayList<ImageComic>image1 = new ArrayList<>();
        ImageComic myImage1 = new ImageComic("Luther","Moderen Alegbra","20221","pattern");
        IssueNumberGenerator myIssue =new IssueNumberGenerator();
        myIssue.getInstance();
        myIssue.setInitialAndId(myImage1.getId(),myImage1.getInitial());
        for (int i=1;i<=10;i++){
            myImage1 = new ImageComic("Luther","Moderen Alegbra","20221","pattern");
            myImage1.setIssueNumber(myIssue.getNextIssueNumber());
            image1.add(myImage1);

        }
        imageList.addAll(image1);

    }

    //public IssueNumberGenerator getMyIssue(){
       // return myIssue;
   // }
      public ArrayList<MarbleComic> getMarbleList(){
        return marbleList;
      }


    public void buildMarbleInventory() {
        MarbleComic myMarble1 = new MarbleComic("Carzy", "Functional", "2011", "hero");
        ArrayList<MarbleComic> marble1 = new ArrayList<>();
        IssueNumberGenerator myIssue =new IssueNumberGenerator();
      myIssue.getInstance();
        myIssue.setInitialAndId(myMarble1.getId(), myMarble1.getInitial());
       // myIssue1.getNextIssueNumber();
       for (int i = 1; i <=10;i++) {
           myMarble1 = new MarbleComic("Carzy", "Functional", "2011", "hero");
          myMarble1.setIssueNumber(myIssue.getNextIssueNumber());
           //myMarble1.getIssueNumber();
           //myMarble1.getIssueNumber();
           //System.out.println(myIssue.getNextIssueNumber());
               marble1.add(myMarble1);
              // marble1.add(myMarble1);
            }

        marbleList.addAll(marble1);

    }
}
