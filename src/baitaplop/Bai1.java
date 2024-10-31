package baitaplop;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " +name);
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Age: " +age);
        
        System.out.print("Enter gender: ");
        String gender = scanner.next();
        System.out.println("Gendar: " +gender);
        scanner.nextLine();
        
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        System.out.println("Major: " +major);
        
        System.out.print("Enter GPA: ");
        float GPA = Float.parseFloat(scanner.nextLine());
        System.out.println("GPA: " +GPA);
        
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("City: " +city);
        scanner.close();     
    }
}
