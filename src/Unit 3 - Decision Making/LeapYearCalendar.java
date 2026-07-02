import java.util.Scanner;

public class LeapYearCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What year do you want to check?"); int leapYear = input.nextInt();

        String result = (leapYear % 4 == 0 && (leapYear % 100 != 0 || leapYear % 400 == 0)) 
                        ? "Leap Year" 
                        : "Not a Leap Year";

        System.out.println(result);
        
        input.close(); 
    }
}