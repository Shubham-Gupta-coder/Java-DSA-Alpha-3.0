import java.util.*;

public class module_08_Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ? Question 1
        // ! Write a Java program to get a number from the user and print whether it is positive or negative

        // * Solution:
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // if (num > 0) {
        //     System.out.println("Positive");
        // } else if (num < 0) {
        //     System.out.println("Negative");
        // } else {
        //     System.out.println("it is a zero");
        // }

        //////////////////////////////////////////////////////////////////////////////////////////

        // ? Question 2
        // ! Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
        // ! double temp = 103.5;

        // * Solution:
        // double temp = 103.5;
        // if (temp>100) {
        //     System.out.println("You have Fever");
        // } else {
        //     System.out.println("Enjoy! You do not have fever");
        // }

        //////////////////////////////////////////////////////////////////////////////////////////

        // ? Question 3
        // ! Write a Java program to input week number (1-7) and print day of week name using switch case

        // * Solution:
        // System.out.print("Enter Week Number: ");
        // byte weekNum = sc.nextByte();
        // switch (weekNum) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid Number");
        //         break;
        // }

        //////////////////////////////////////////////////////////////////////////////////////////

        // ? Question 4
        // ! Value of x any y in the following program?
        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println(x +  " " + y);

        // * Soultion: x= false, y=63

        //////////////////////////////////////////////////////////////////////////////////////////

        // ? Question 5
        // ! Input the year and check for leap year

        // * Soultion:
        // System.out.print("Enter the year: ");
        // int year = sc.nextInt();
        // if (year%4 == 0 && year%100 != 0) {
        //     System.out.println("Leap Year");
        // }
        // else if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
        //     System.out.println("Leap Year");
        // } else {
        //     System.out.println("Not a leap year");
        // }
    }
}
