package com.lockedme;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    Scanner sc = new Scanner(System.in);
    // method to create a new file
    public void createFile() throws IOException
    {
        System.out.println("--------------------------------");
        System.out.println("\t\t\tAdding a new file");
        System.out.println("--------------------------------");

        System.out.println("Enter a file name: ");
        String fileName = sc.next();

        File file = new File("D:\\Files\\" + fileName);
        if(file.exists() == true)
        {
            System.out.println("File already exists");
        }
        else{
            file.createNewFile();
            System.out.println("File created");
        }

    }

    // method to delete an existing file
    public void deleteFile() throws Exception
    {

    }

    // method to search for a file in the directory
    public void searchFile() throws Exception
    {

    }

}
