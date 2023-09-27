package com.lockedme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        FileManager fm = new FileManager();

        while(true)
        {
            try
            {
                System.out.println();
                System.out.println("\t\tLockedMe.com");
                System.out.println("Developed by Mashudu Luvhengo");
                System.out.println("--------------------------------");
                System.out.println("\t\t\tMain Menu");
                System.out.println("--------------------------------");
                int mainMenuChoice;
                try
                {
                    System.out.println("\n1. View Files in directory\n2. Files Menu\n0. Exit");
                    System.out.println();
                    System.out.print("Pick your choice: ");
                    mainMenuChoice = sc.nextInt();
                }
                catch (Exception e)
                {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.nextLine(); // takes the invalid input
                    continue; // skips to the next iteration of the loop
                }

                switch (mainMenuChoice)
                {
                    case 1:
                        fm.listOfFiles();
                        break;
                    case 2:
                        try
                        {
                             while (true)
                            {
                                System.out.println("--------------------------------");
                                System.out.println("\t\t\tFile Menu");
                                System.out.println("--------------------------------");
                                int fileMenuChoice;

                                try
                                {
                                    System.out.println("\n1. Create a file\n2. Delete a file\n3. Search for a file\n0. Back to Main Menu");
                                    System.out.println();
                                    System.out.print("Pick your choice: ");
                                    fileMenuChoice = sc.nextInt();

                                }  catch (Exception e)
                                {
                                    System.out.println("Invalid input. Please enter a valid number.");
                                    sc.nextLine();
                                    continue;
                                }

                                switch (fileMenuChoice)
                                {
                                    case 1:
                                        fm.createFile();
                                        break;
                                    case 2:
                                        fm.deleteFile();
                                        break;
                                    case 3:
                                        fm.searchFile();
                                        break;
                                    default:
                                        System.out.println("Enter a valid number");
                                }
                                if (fileMenuChoice == 0)
                                {
                                    break;
                                }
                             }
                        }
                        catch (Exception ex)
                        {
                            System.out.println("Invalid input. Please enter a valid number.");
                            sc.nextLine(); // takes the invalid input
                            continue; // Skip to the next iteration of the loop
                        }
                        break;
                    case 0:
                        System.out.println("Thanks for using this app");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Choose a valid number");
                        break;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("An exception occurred in Main Menu: " + e);
            }
        }

    }
}