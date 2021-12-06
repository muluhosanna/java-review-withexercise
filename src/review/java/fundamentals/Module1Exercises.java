package review.java.fundamentals;

import java.util.ArrayList;

public class Module1Exercises {
    public static void main(String[] arg) {
        // examplesOnMarble();
        //examplesOnRanch();
        //exaplesOnSaticBlock();
        // examplesOnSphere();
        // examplesOnCone();
        // examplesOnCylinder();

        // examplesOnException();
        // exampamplesOnControlFlow();
        // checkPrime();
        System.out.println("hello world");
        System.out.println(PrimeAndEvenNumbers.num);
        System.out.println();
        PrimeAndEvenNumbers.function1();
        System.out.println(PrimeAndEvenNumbers.num2);
        PrimeAndEvenNumbers.num3 = 30;
        System.out.println(PrimeAndEvenNumbers.num3);
        System.out.println(PrimeAndEvenNumbers.num2);
        PrimeAndEvenNumbers.Inner.method1(2);
        moreOnComicInventory();
        //moreOnComicStore();
        //method2();


    }
    public static void method2(){
        int[]array = new int[21];
        for(int i =0;i <=20;i++){
            if(i==0){
                array[0]=0;
            }else if(i==1){
                array[1] =1;
            }else if(i>=2){
                array[i] =array[i-1] +array[i-2];
            }
            System.out.print(array[i]+ " ") ;
        }
        System.out.println();
    }
    public static void  moreOnComicStore(){
        ComicBookStore store = new ComicBookStore();
        store.message();

    }

    public static void moreOnComicInventory() {
        ComicBookInventory inventory = new ComicBookInventory();
        // inventory.buildMarbleInventory();
        for (MarbleComic marble : inventory.getMarbleList()) {
            System.out.println(marble.getIssueNumber());
        }
        System.out.println();
        for (ImageComic image : inventory.getImageList()) {
            System.out.println(image.getIssueNumber());

        }
        System.out.println();
        for (DcComic dc3 : inventory.getDcList()) {
            System.out.println(dc3.getIssueNumber());
            System.out.println();

        }
    }

    public static void examplesOnMarble() {
        MarbleComic myMarble = new MarbleComic("mulu", "java", "2013", "hero");
        IssueNumberGenerator myIssue = new IssueNumberGenerator();
        myIssue.getInstance();
        myIssue.setInitialAndId(myMarble.getId(), myMarble.getInitial());
        // myIssue.getNextIssueNumber();
        System.out.println(myIssue.getNextIssueNumber());
        System.out.println(myIssue.getNextIssueNumber());
        System.out.println(myIssue.getNextIssueNumber());
        System.out.println(myIssue.getNextIssueNumber());
        System.out.println(myIssue.getNextIssueNumber());
        System.out.println(myIssue.getNextIssueNumber());
        // System.out.println(myIssue.getNextIssueNumber());
        myMarble.setIssueNumber(myIssue.getNextIssueNumber());
        myMarble.getIssueNumber();
        // System.out.println(myMarble.getIssueNumber());// displays the next issue number
        //  System.out.println(myMarble.getIssueNumber());//displays the sma issue number
        // System.out.println(myMarble.getIssueNumber());// displays the same issue number


        // System.out.println(myMarble.getIssueNumber());
    }

    public static void examplesOnException() {
        Module1_4Exception myException = new Module1_4Exception();
        myException.exampleException();
    }

    public static void examplesOnCylinder() {
        Cylinder myCylinder = new Cylinder(4, 8);
        myCylinder.getHeight();
        System.out.println(myCylinder.getHeight());
        myCylinder.surfaceArea();
        myCylinder.volume();


    }

    public static void examplesOnCone() {
        Cone myCone = new Cone(2.00, 3.00);
        myCone.surfaceArea();
        myCone.volume();
        myCone.getHeight();
        System.out.println(myCone.getHeight());
        System.out.println(myCone.getRadius());

    }

    public static void examplesOnSphere() {
        Sphere mySphere = new Sphere(4);
        mySphere.surfaceArea();
        mySphere.volume();
    }

    public static void exaplesOnSaticBlock() {
        StaticBlock myBlock = new StaticBlock();
        myBlock.decesion();
    }

    public static void examplesOnRanch() {
        RanchHouse zuma = new RanchHouse();
        System.out.println(zuma.getExternalDoors());
        //zuma.hasHardwoodFloors();
        // System.out.println(zuma.hasHardwoodFloors());
    }

    public static void checkPrime() {
        PrimeAndEvenNumbers prime1 = new PrimeAndEvenNumbers();
        // PrimeAndEvenNumbers.Inner my new PrimeAndEvenNumbers.Inner();
        //my.method2();


        //PrimeAndEvenNumbers.Inner myInner = new PrimeAndEvenNumbers().Inner();
        // prime1.algorithmOfPrimes();
        //prime1.welcome();
        // prime1.evenNum();
        //prime1.shapes();
        //prime1.shape1();
        // prime1.shape2();
        //prime1.triangleDouble();
        // prime1.task3(-20,-2,10);
        // prime1.task4();
        //prime1.shape3();
        //prime1.randomNumber();
        //prime1.loop1();
        //prime1.loop2();
        //prime1.invertedTriangle();
        //prime1.sampleDollar();
        // prime1.sampleDollar2();
        // prime1
        //System.out .println(prime1.numberOfPrimesPerLine);
        // prime1.multiplication();
    }

    public static void exampamplesOnControlFlow() {
        ControlFlowAndOperators control = new ControlFlowAndOperators();
        // control.switch1();
        // control.month();
        // control.triangle1();
        //control.triangle3();
        //control.triangle4();
        //  control.triangle6();
        // control.task4();
        // control.triangle3();
        // control.task3(-10,2,-5);
        //control.task1();
        // control.task();
        control.pyramid();


    }

}

