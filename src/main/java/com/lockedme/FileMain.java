package com.lockedme;

import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("LockedMe.com");
            System.out.println("Developed by Mashudu Luvhengo");
            System.out.println("--------------------------------");
            System.out.println("Main Menu");
            System.out.println("--------------------------------");
            System.out.println("1. View Files in directory\n2. Files Menu\n0. Exit");
            System.out.println();
            System.out.print("Pick your choice: ");
            int mainMenuChoice = sc.nextInt();

            switch(mainMenuChoice)
            {
                case 1:
                    System.out.println("Files");
                    break;
                case 2:
                    while(true) {
                        System.out.println("--------------------------------");
                        System.out.println("File Menu");
                        System.out.println("--------------------------------");
                        System.out.println("1. Create a file\n2. Delete a file\n3. Search for a file\n0. Back to Main Menu");
                        System.out.println();
                        System.out.println("Pick your choice: ");
                        int fileMenuChoice = sc.nextInt();

                        switch(fileMenuChoice) {
                            case 1:
                                System.out.println("Adding new file");
                                break;
                            case 2:
                                System.out.println("Deleting file");
                                break;
                            case 3:
                                System.out.println("Searching file");
                                break;
                            default:
                                System.out.println("Enter a valid number");
                        }
                        if(fileMenuChoice == 0){
                            break;
                        }
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
    }
}