package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? (Enter y or n): ");
        String ans = input.nextLine();

        if(ans.equalsIgnoreCase("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            ans = input.nextLine();

            if(ans.equalsIgnoreCase("y"))
            {
                System.out.print("Clean terminals and try starting again.");
            }
            else
            {
                System.out.print("Replace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car make a clicking noise? ");
            ans = input.nextLine();

            if(ans.equalsIgnoreCase("y"))
            {
                System.out.print("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                ans = input.nextLine();

                if(ans.equalsIgnoreCase("y"))
                {
                    System.out.print("Check spark plug connections.");
                }

                else
                {
                    System.out.print("Does the engine start and then die? ");
                    ans = input.nextLine();

                    if(ans.equalsIgnoreCase("n"))
                    {
                        System.out.print("Sorry there is no solution to your problem.");
                    }
                    else
                    {
                        System.out.print("Does your car have fuel injection? ");
                        ans = input.nextLine();

                        if(ans.equalsIgnoreCase("y"))
                        {
                            System.out.print("Get it in for service.");
                        }

                        else
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                }
            }
        }



















    }




}
