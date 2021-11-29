package review.java.fundamentals;

public class IssueNumberGenerator {
    private static  IssueNumberGenerator issue;
    private static int id = 970076;
    private static String initial;
    public synchronized IssueNumberGenerator getInstance(){//let us skip static
        if (issue==null){
            issue = new IssueNumberGenerator();
        }
        return issue;
    }
    protected IssueNumberGenerator(){}
    public void setInitialAndId(int id,String initial){this.id =id;
        this.initial =initial;

    }
    public synchronized String getNextIssueNumber(){
        return initial + "" + id++;
    }
   public int getRecentId(){
       return id;
    }
}
