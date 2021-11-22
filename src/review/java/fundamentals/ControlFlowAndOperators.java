package review.java.fundamentals;

import java.util.Scanner;

public class ControlFlowAndOperators {
   // public static void main(String[] arg ){
   //  pyramid();

    //}
    public void fundamentalArray() {
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array[i][j][k] = i + j + k;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void SmallNumber() {

        int temp;
        int[] myArray1 = {14, 28, 15, 89, 46, 25, 94, 33, 82, 11, 37, 59, 68, 27, 16, 45, 24, 33, 72, 41};
        int min = myArray1[0];
        for (int f : myArray1) {
            if (f < min)
                min = f;
        }
        System.out.println("the lowest number is :" + min);
    }

    public void triangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1 + "" + "" +
                        " ");
            }
            System.out.println();
        }
    }

    public void triangle1() {
        int n = 5;

        for (int i = 1, p = 0; i <= n; i++, p += 2) {

            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

    }

    public void triangle2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                if (i % 2 != 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            System.out.println();
        }

    }

    public void triangle3() {
        int n = 5;
        for (int i = 1, p = 1; i <= 5; i++, p++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

    }

    public void task1() {
        int a;
        int b;

        System.out.println("enter an integer");
        Scanner num = new Scanner(System.in);
        a = num.nextInt();
        b = num.nextInt();
        double result = ((Math.pow(a, 2) + 3 * b) * 7) / (2 * (Math.pow(a * b, 2)));
        System.out.println(result);
    }

    public void task() {
        // int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 & j == 1) {
                    System.out.print("  ");
                } else if (i == 1 && j == 2) {
                    System.out.print(1 + " ");
                } else if (j == 2 * i - 1) {
                    System.out.print(1 + " ");

                } else if (j > 2 * i - 1) {
                    System.out.print(" ");
                } else if (j == 1 && 2 <= i && i <= 5) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }

    public void task11(int a, int b) {
        double result = ((Math.pow(a, 2) + 3 * b) * 7) / (2 * (Math.pow(a * b, 2)));
        System.out.println(result);
    }


    public void triangle5() {
        int m = 6;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(5);
                }
            }
            System.out.println();
        }
    }

    public void month() {
        System.out.println("Enter monthe here");
        Scanner rem = new Scanner(System.in);
        int month = rem.nextInt();

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else {
            System.out.println("May");
        }
    }

    public void switch1() {
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("janury");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("May");

        }
    }

    public void triangle6() {
        int r = 6;
        for (int i = 0; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j == 1) {
                    System.out.print(0 + " ");
                } else if (j == 2) {
                    System.out.print(1 + " ");

                } else if (j == 3) {
                    System.out.print(2 + " ");
                } else if (j == 4) {
                    System.out.print(3 + " ");
                } else if (j == 5) {
                    System.out.print(4 + " ");
                } else if (j == 6) {
                    System.out.print(5 + " ");
                }

            }
            System.out.println();

        }


    }

    public void task3(double V, double I, double R) {

        // I = V / R;
        //R = V / I;
        //V = I * R;
        // V=-10;
        //R=V/I;
        // I=-5;
        if (I < 0 && V >= 0 && R > 0) {
            I = V / R;
            //System.out.println("The uknown value is " + I);
            System.out.println("The current I" + "=" + V / R);
            System.out.println("The voltage V" + "=" + V);
            System.out.println("The resistance R" + "=" + R);
        } else if (R < 0 && V >= 0 & I > 0) {
            R = V / I;
            //System.out.println("The unknown value is :" + R);
            System.out.println("The resistance R " + "=" + V / I);
            System.out.println("the voltage V:" + "=" + V);
            System.out.println("The current I" + "=" + I);

        } else if (V < 0 && I > 0 && R > 0) {//it is logical that V<0 mean either
            V = I * R;
            //System.out.println("The unknown value is " + V);
            System.out.println("the voltage V" + "=" + I * R);
            System.out.println("The current I " + "=" + I);
            System.out.println("The resistance R" + "=" + R);
            //I and R can never be zero
            // System.out.println("the resistance is :" + V/I);//V can never be negative from the formula
        } else if (I > 0 && V > 0 && R > 0) {
            System.out.println("The current I" + "=" + I);
            System.out.println("The voltage V" + "=" + V);
            System.out.println("The resistance R" + "=" + R);
        } else if (I <= 0 && V < 0) {
            System.out.println("no information to calculate the resistance" + "R");
            System.out.println("no information to calculate the current:" + "I");
            System.out.println("no information to calculate the voltage:" + "V");
        } else if (I < 0 && R < 0) {
            System.out.println("no information to calculate the voltage:" + "V");
            System.out.println("no information to calculate the current:" + "I");
            System.out.println("no information to calculate the resistance:" + "R");
        } else if (V <= 0 && R < 0) {
            System.out.println("no information to calculate the current:" + "I");
            System.out.println("no information to calculate the resistance:" + "R");
            System.out.println("no information to calculate the voltage:" + "V");
        } else if (I < 0 && V < 0 && R < 0) {
            System.out.println("no information to calculate the current:" + "I");
            System.out.println("no information to calculate the resistance:" + "R");
            System.out.println("no information to calculate the voltage:" + "V");

        }

    }

    public void task4() {

        for (int i = 1; i <= 6; i++) {
            int k = 5;
            int m1 = 4;
            int m3 = 3;
            int m4 = 2;
            int m5 = 1;
            int m6 = 0;

            for (int j = 1; j <= 6; j++) {

                if (i == 1 && j == 1) {
                    System.out.print("  ");

                } else if (i == 1 && j == 2) {
                    System.out.print(5 + " ");

                } else if (i == 2 && j <= 2) {
                    System.out.print(m1++ + " ");
                } else if (i == 3 && j <= 3) {
                    System.out.print(m3++ + " ");

                } else if (i == 4 && j <= 4) {
                    System.out.print(m4++ + " ");
                } else if (i == 5 && j <= 5) {
                    System.out.print(m5++ + " ");
                } else if (i == 6 && j <= 6) {
                    System.out.print(m6++ + " ");
                } else if (j != 2 && j > i) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void pyramid() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 15; j++) {
                if (i ==1  && j <= 7 ) {
                    System.out.print(" ");
                }else if (i==1&&9<=j&&j<=15){
                    System.out.print(" ");
                }else if (i==2&&10<=j&&j<=15){
                    System.out.print(" ");
                }else if (i==3&&11<=j&&j<=15){
                    System.out.print(" ");
                }else if (i==4&&12<=j&&j<=15){
                    System.out.print(" ");
                }else if (i==5&&13<=j&&j<=15){
                    System.out.print(" ");
                }else if (i==6&&14<=j&&j<=15){
                    System.out.print(" ");
                }else if (i==7&&j==15){
                    System.out.print("");
                }
                else if (i == 2 && j <= 6 ) {
                    System.out.print(" ");
                } else if (i == 3 && j <= 5 ) {
                    System.out.print(" ");
                } else if (i == 4&& j <= 4 ) {
                    System.out.print(" ");
                } else if (i == 5 &&j <= 3 ) {
                    System.out.print(" ");
                    // System.out.print("*");
                } else if (i == 6 &&j <= 2) {
                    System.out.print(" ");
                } else if (i == 7 &&j==1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*"+ "");
                }
                //System.out.println();

            }
            System.out.println();

        }


    }
}

