package L1PracticePrograms;

import java.util.Scanner;

public class L1Q10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double height;
        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        double totalInches = height / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + height +
                           " while in feet is " + feet +
                           " and inches is " + inches);

        input.close();
    }
}