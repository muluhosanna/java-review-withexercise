package review.java.fundamentals;

import java.util.Scanner;

public class PrimeAndEvenNumbers {
    private double V;
    private double R;
    private double I;
    static int num;
    protected static final  int num2=6;
    protected static int num3 =40;
    protected static int num4;

    static String word;
    public  class Inner{
        public static void method1(int value){

            System.out.println(num2*value);

        }
        public void method2(){
            System.out.println(num3);

        }

    }

    int numberOfprimes;//display the first 50 prime numbers
    final int numberOfPrimesPerLine = 10;// the number of prime numbers perline
    int number = 2; //the first number to be tested
    int divisor = 2;
    int count = 1;// count of the number of prime numbersc
    Scanner s = new Scanner(System.in);
    static {
        num=97;
        word="sample";
        System.out.println(num);
    }
    static {
        num=37;
    }
    static {
        //num2=9;
    }
    public static void function1(){
        int m= num+2;
        System.out.println(m);
    }


    public void algorithmOfPrimes() {
        System.out.println("enter the number");
        numberOfprimes = s.nextInt();

        //int count = 0;
        // repeatedly find the number of prime numbers
        while (count < numberOfprimes) {
            // Assume the number if prime
            boolean isprime = true;// is the current number prime?
            //test whether the number is prime or not
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isprime = false;
                    break;

                }
            }
            if (isprime) {

                System.out.println(number);
                //if (count % numberOfPrimesPerLine == 0) {
                // System.out.println(number);
            }
            number++;
            count++;


        }

    }


    public void welcome() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Welcome to Java");
        }
    }

    public void multiplication() {
        System.out.println("     Multiplication table");
        for (int j = 1; j <= 9; j++) {
            System.out.print(" " + j);
        }
        System.out.print(" ");
        System.out.print("\n------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);

            }
            System.out.println();
        }

    }

    public void evenNum() {
        int number = 2;
        int count = 0;
        int numberOfEven;
        System.out.println("enter your number");
        numberOfEven = s.nextInt();
        while (count < numberOfEven) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
            count++;
        }


    }

    public void shapes() {
        int odd = 1;
        for (int i = 1; i <= 4; i++) {
            int k = 0;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i >= j) {
                    k = k + 1;
                } else {
                    k = k - 1;

                }
                System.out.print(k);

            }
            System.out.println(" ");
            //odd=odd+2;
        }
    }

    public void shape1() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    public void shape2() {
        int size = 6;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j);


            }
            System.out.println();
            size = size - 1;
        }
    }

    public void shape3() {
        int spaceSize = 5;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void randomNumber() {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        System.out.println("what is " + number1 + "+" + number2 + "?");
        int answer = s.nextInt();
        while (number1 + number2 != answer) {
            System.out.println("wrong answer try another" + "what is " + number1 + "+" + number2 + "?");
            answer = s.nextInt();
        }
        System.out.println("you got it");
    }

    public void loop1() {
        int i = 1;
        while (i < 100) {
            if (i % 2 == 0) {//the loop terminates when i=98 if we use i++ here
                System.out.println(i);

            }
            i++;

        }
    }

    public void loop2() {
        //how create a number and relate to that number that matches to it
        int num = (int) (Math.random() * 10);
        int guess = -1;
        while (guess != num) {
            System.out.println("Enter your guess");
            guess = s.nextInt();
            if (guess == num) {
                System.out.println("the number is:" + num);
            } else if (guess > num) {

                System.out.println("the number you entered is too high");

            } else {
                System.out.println("the number is too low");
            }
        }
    }

    public void triangleDouble() {
        int k = 5;
        //int j;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= k; j++, k--) {

                System.out.print("");
            }

            for (int j = 1; j <= 6; j++) {

                System.out.print(" ");

                if (i >= 6 && j == 1) {
                    System.out.print(6 + " ");
                } else if (5 <= i && i <= 6 && j == 2) {
                    System.out.print(5 + " ");

                } else if (4 <= i && i <= 6 && j == 3) {
                    System.out.print(4 + " ");

                } else if (3 <= i && i <= 6 && j == 4) {
                    System.out.print(3 + " ");
                } else if (2 <= i && i <= 6 && j == 5) {
                    System.out.print(2 + " ");
                } else if (j == 6) {
                    System.out.print(1 + " ");
                }


            }
            System.out.println();
            // k=k-1;

        }
    }

    public void task3(double V, double I, double R) {

        I = V / R;
        R = V / I;
        V = I * R;
        // V=-10;
        //R=V/I;
        // I=-5;
        if (I == -1 || I < 0) {
            System.out.println("The uknown value is " + I);
            System.out.println("The resistance is :" + R);
            System.out.println("The voltage is :" + V);
        } else if (R == -1 || R < 0) {
            System.out.println("The unknown value is :" + R);
            System.out.println("The curent will be " + I);
            System.out.println("the voltage :" + V);

        } else if (V == -1 || V < 0) {
            System.out.println("The unknown value is " + V);
            System.out.println("the current is:" + I);
            System.out.println("the resistance is :" + R);
        } else if (I > 0 && V > 0 && R > 0) {
            System.out.println(I);
            System.out.println(V);
            System.out.println(R);
        }

    }

    public void invertedTriangle() {
        int spaceSize = 1;
        for (int i =1;i<=6;i++) {

            for (int j=1;j<=6;j++) {

                if (i >j) {
                    System.out.print(" ");
                } else if (i ==j) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();

        }
    }
    public void sampleDollar(){
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                if (i%2!=0){
                    System.out.print("#" +" ");
                }else {
                    System.out.print("$" +" ");
                }
            }
            System.out.println();
        }
    }
    public void sampleDollar2() {

        int m = 5;
        for (int i = 1, k = 1; i < m; i++, k++) {
            for (int j = i; j <= m; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < i; j++) {
                System.out.print(k + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k +" ");

            }
            System.out.println();
        }}
    public void task4(){

        for (int i=1;i<=6;i++){
            int k=5;
            int m1 =4;
            int m3 =3;
            int m4 =2;
            int m5 =1;
            int m6 =0;

            for (int j=1;j<=6;j++){

                if (i==1&&j==1){
                    System.out.print(" ");

                }


                else if(i==1&&j==2){
                    System.out.print(5+  " ");

                }else if (i==2&&j<=2){
                    System.out.print(m1++ + " ");
                }else if (i==3&&j<=3){
                    System.out.print(m3++ +" ");

                }

                else if (i==4&&j<=4){
                    System.out.print(m4++ +" ");
                }
                else if (i==5&& j<=5){
                    System.out.print(m5++ +" ");
                }else if(i==6&&j<=6){
                    System.out.print(m6++  + " ");
                } else if (j!=2&&j>i){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}






