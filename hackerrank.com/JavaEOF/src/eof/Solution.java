package eof;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//public class eof.Solution {
//    public static void main(String[] args) {
//
//        Scanner line = new Scanner(System.in);
//        int counter = 0; // Initialized out of loop.
//        while (line.hasNextLine()) {
//            String ln = line.nextLine();
//            System.out.println(counter  +" "+ln);
//            counter++;
//        }
//        }
//    }

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {

        //create the File
        File file = new File("resources/mystrings");

        //send the file into Scanner so it can read from the file
        Scanner scanner = new Scanner(file);

        //initialize the counter variable
        int counter = 1;

        //read in the file line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(counter  +" "+ line);
            counter++;
        }
    }
}