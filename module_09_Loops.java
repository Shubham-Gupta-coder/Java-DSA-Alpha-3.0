import java.util.*;

public class module_09_Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //? Question 1
        //! How many times hello is printed
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello");
        //     i += 2;
        // }

        //* Solution: Answer: 2

        //////////////////////////////////////////////////////////////////////////////////////////

        //? Question 2
        //! read a set of integers , print the sum of even and odd integers

        //* Solution:
        //! Can't do - Question is not understandable


        //////////////////////////////////////////////////////////////////////////////////////////

        //? Question 3
        //! Write a program to find the factorial of any number entered by the user.

        //* Solution:
        // int number = sc.nextInt();
        // int multiple = 1;
        // if (number == 0) {
        //     System.out.println("1");
        // } else {
        //     for (int i = 1; i <= number; i++) {
        //         multiple *= i;
        //     }
        // }
        // System.out.println(multiple);

        //////////////////////////////////////////////////////////////////////////////////////////

        //? Question 4
        //! Multiplication table of an number input by user

        //* Soultion: 
        // System.out.print("Enter the number: ");
        // int number = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(number + " x " + i + " = " + number*i);
        // }

        //////////////////////////////////////////////////////////////////////////////////////////

        //? Question 5
        //! What is wrong with this program
        // for (int i = 0; i <= 5; i++) {
        //     System.out.println("i = " + i);
        // }
        // System.out.println("i after the loop = "+ i );

        //* Soultion: i is limited to the loop only so can not work outside loop
    }
}


