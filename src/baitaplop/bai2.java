package bai2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;    
public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("Day_Month_Year");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " +name);

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Age: " +age);

        System.out.print("Enter BirthYear (Day_Month_Year): ");
        String BirthYear = scanner.nextLine();
        Date BirthYear = null; 

        try {
            BirthYear = DateFormat.parse(BirthYearInput);
        } catch (ParseException e) {
            System.out.println("ERROR.Enter (Day_Month_Year)");
            return;
        }
        System.out.println("BirthYear: " +DateFormat.format(BirthYear));

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Gender: " + gender);

        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        System.out.println("Major: " + major);

        System.out.print("Enter GPA: ");
        float GPA = Float.parseFloat(scanner.nextLine())
        System.out.println("GPA: " +GPA);

        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("City: " +city);
        scanner.close(); 
    }
    
}
