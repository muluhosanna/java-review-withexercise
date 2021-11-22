package review.java.fundamentals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Module1_4Exercise {
    private static int k;
    Scanner myScanner;

    public static void main(String[] arg){
        leapYear();
        //test();
        //monday();
        //tuesday();
        //avg();
       // send(1,"xyz","amazon");

    }

    public static void leapYear() {
        System.out.println("Enter a four digit number");
        Scanner myScanner = new Scanner(System.in);
        k = myScanner.nextInt();
        //System.out.println(k);
        int length = String.valueOf(k).length();
       // System.out.println(length);
        //String .valueOf(k).lastIndexOf(0);

        try {
            if (length == 4 && k % 4 == 0) {
                System.out.println("it is leap year");
            } else if (length!=4){
                System.out.println("the number you entered is in valid");


            }else if (length==4&&k%4!=0){
                System.out.println("it is not leap year");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException ax) {
            System.out.println(ax.getMessage());
        } catch (ExceptionInInitializerError mr) {
            System.out.println(mr.getMessage());
        } catch (StackOverflowError nx) {
            System.out.println(nx.fillInStackTrace());
        }
    }

    public static void test() {
        int[] m = {1, 2, 3, 4, 5};
        {

            System.out.println("");
        }

        try {
            System.out.println(m.length);
            System.out.println(m[6]);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());
        }

    }

    public static void check() throws IllegalArgumentException{
        int age = 20;
        String name = "kebede";
        if (age > 20) {
            throw new IllegalArgumentException("the person can not drink coffee");
        } else {
            System.out.println("it will be possibl");

        }

    }

    public static void monday() {
        System.out.println("Enter name");
        Scanner rem = new Scanner(System.in);
        String name1 = rem.nextLine();
        System.out.println("enter name");
        String name2 = rem.nextLine();


        if (name2!= name1) {
            throw new IllegalArgumentException("all the posible");
        } else {
            System.out.println("possible");


        }
    }
    public static void tuesday(){
        try{
            int a=5;
            int b=0;
            int result =a/b;
            System.out.println("the quient" +result);
        }catch (ArithmeticException ex){
            System.out.println("not possible" +ex.getMessage());
        }finally {
            System.out.println("excute the final block" );

        }
        }
        public static void avg()throws ArithmeticException{//throws are use to explicitly throw an Exception
        try {
            throw (new ArithmeticException("Demo"));//throw is used to throw Exception
            //throw (new IllegalArgumentException());
        }catch (ArithmeticException e){// catch used to the Exception
            System.out.println("Excution exception");

        }finally {
            System.out.println("print what evere");
        }
        }
        public static void send(int destination,String data,String partner)throws IOException,FileNotFoundException{
        System.out.println("\n Inside");
        if (destination==0){
            throw new FileNotFoundException();
        }else if (destination==1){
            throw new IOException();
        }
        System.out.println("\n end send ..");
        }
}



