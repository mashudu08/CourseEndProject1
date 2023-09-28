package com.lockedme;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    String filepath = "D:\\Files\\";
    Scanner sc = new Scanner(System.in);
    // method to create a new file
    public void createFile() throws IOException
    {
        System.out.println("--------------------------------");
        System.out.println("\t\tAdding a new file");
        System.out.println("--------------------------------");

        System.out.println("Enter a file name: ");
        String fileName = sc.next();

        File file = new File(filepath + fileName);
        if(file.exists() == true)
        {
            System.out.println("File already exists");
        }
        else
        {
            file.createNewFile();
            System.out.println("File created");
        }
    }

    // method to delete an existing file
    public void deleteFile() throws Exception
    {
        System.out.println("--------------------------------");
        System.out.println("\t\tDelete a new file");
        System.out.println("--------------------------------");
        System.out.println("Enter file name to Delete : ");
        String fileName = sc.next();

        File file = new File(filepath + fileName);
        if(file.exists() == true)
        {
            file.delete();
            System.out.println("File deleted");
        }
        else{
            System.out.println("File not found");
        }
    }

    // method to search for a file in the directory
    public void searchFile() throws Exception
    {
        System.out.println("--------------------------------");
        System.out.println("Search for a file in the directory");
        System.out.println("--------------------------------");
        System.out.print("Enter the name of the file you want to search for: ");
        String searchFileName = sc.nextLine();

        try
        {
            File fileDir = new File(filepath);
            String fileInfo[] = fileDir.list();
            boolean fileFound = false;

            // Linear search and added case-sensitive to retrieve correct file
            if(fileInfo != null)
            {
                for (String item : fileInfo)
                {
                    if (item.equals(searchFileName))
                    {
                        fileFound = true;
                        break; // exit loop if match found
                    }
                }

                if (fileFound == true)
                {
                    System.out.println("File '" + searchFileName + "' found in directory.");
                }
                else
                {
                    System.out.println("File '" + searchFileName + "' not found in directory.");
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // method retrieves and displays files sorted in ascending order using insertion algorithm
    public void listOfFiles() throws Exception
    {
        try {
            File fileDir = new File(filepath);
            String fileInfo[] = fileDir.list();

            if(fileInfo != null)
            {
                System.out.println("--------------------------------");
                System.out.println("\tFiles in the directory");
                System.out.println("--------------------------------");

                // sorting files in the directory in ascending order
                sortInAscending(fileInfo);

                for (String f : fileInfo)
                {
                    System.out.println(f);
                }
            }
            else {
                System.out.println();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // Using the insertion sort algorithm to sort the file names in ascending order
    public static void sortInAscending(String arr[])
    {
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            String key = arr[i];
            int j = i -1;
            while (j >= 0 && key.compareTo(arr[j]) < 0)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}