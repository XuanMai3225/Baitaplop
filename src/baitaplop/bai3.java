package bai3;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input from keyboard: ");
        if (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println("Enter: " +input);
        }else{
            System.out.println("Cannot enter");
        }
        scanner.close();
    }
    
}
