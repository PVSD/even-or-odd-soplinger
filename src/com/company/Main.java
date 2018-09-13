package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter an integer: ");

        Scanner integerInput = new Scanner(System.in);

        int intInput = integerInput.nextInt();

        if (intInput%2 == 0)
        {
            System.out.println("The Integer " + intInput + " is even");
        }
        else {
            System.out.println("The Integer " + intInput + " is odd");
        }




    }
}
