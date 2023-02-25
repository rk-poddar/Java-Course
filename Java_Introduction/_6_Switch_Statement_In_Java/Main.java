package Java_Introduction._6_Switch_Statement_In_Java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the day number: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is " + dayName);

        sc.close();
    }
}
