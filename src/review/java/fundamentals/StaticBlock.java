package review.java.fundamentals;

import java.util.Scanner;

public class StaticBlock {
    protected static final int numberOfCommittee=5;
    protected static final int numberOfsubCommittee = 2;
    static String name;
    static String agenda;
    static String time;
    static {
        name="ayele";
        //Scanner myScanner;

    }
    static {
        agenda ="how to prevent covid in our company";
    }
    public void decesion(){
        System.out.println("Enter the nam of the committes that participate");
        Scanner myScanner = new Scanner(System.in);

        name=myScanner.nextLine();
        name=myScanner.nextLine();
        name=myScanner.nextLine();
        name=myScanner.nextLine();
        name=myScanner.nextLine();
        System.out.println("Enter the agenda");

        agenda= myScanner.nextLine();
        System.out.println("Enter the time");
        time =myScanner.next();

        if (numberOfCommittee==5&&numberOfsubCommittee==2){
            System.out.println(" the meeting will be taking place");
        }else {
            System.out.println("themeeting will be on next week");
        }


    }
}
