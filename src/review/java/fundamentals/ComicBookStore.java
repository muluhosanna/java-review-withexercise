package review.java.fundamentals;

import java.util.Scanner;

public class ComicBookStore {
    private ComicBookInventory inventory;
    //private ComicBookInterface interface1;
    private Scanner scanner;
    public ComicBookStore(){
        inventory = new ComicBookInventory();

        buyBook();
        rentBook();
        returnBook();

        }
        public void message(){
        System.out.println("Welcome To Comic Book Store");
        System.out.println("What books would you like?");
        System.out.println("\nMr-marble comic" +"\nIm-image comic" + "\nDc-dc comic");
        System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        System.out.println("Do you want to buy or rent?");
        System.out.println("\nB-buy" +"\n-rent");
        String m2 = scanner.next();


        }

    private void returnBook() {
    }

    private void rentBook() {
    }

    private void buyBook() {
    }
}



