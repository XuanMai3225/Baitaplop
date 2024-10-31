package bai4;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt(); 
            System.out.println("Entered integer: " +input);
        } else {
            System.out.println("Enter a new integer");
        }
        scanner.close();
    }
    
}
