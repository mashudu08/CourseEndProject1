package com.lockedme;

import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("LockedMe.com");
            System.out.println("Developed by Mashudu Luvhengo");
            System.out.println("--------------------------------");
            System.out.println("Main Menu");
            System.out.println();
            System.out.println("1. View Files in directory\n2. Files Menu\n3. Exit");
            System.out.println();
            System.out.print("Pick your choice: ");
            int input = sc.nextInt();

            switch(input)
            {
                case 1:
                    System.out.println("Files");
                    break;
                case 2:
                    System.out.println("File menu");
                    break;
                case 3:
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