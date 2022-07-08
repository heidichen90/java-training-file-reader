package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        //enter the file to read
        Scanner keyboard = new Scanner(System.in);
        String fileContent ="";
        while (true){
            System.out.println("Enter a file name: ");
            var filename = keyboard.nextLine();
            try{
                 fileContent = Files.readString(Path.of(filename));
                 break;
            } catch (NoSuchFileException e){
                System.out.println("This file does not exit");
            } catch (IOException e){
                System.out.println("This file exit but cannot be read");
            }
        }

        //enter the line to read
        int n = 0;
        while(true){
            System.out.println("Enter the line to read: ");
            try {
                 n = Integer.parseInt(keyboard.nextLine());
                 break;
            } catch (NumberFormatException e){
                System.out.println("Please enter valid read line.");
            }
        }
        String[] lines = fileContent.split("\n");
        for( int i =0; i< n; i++){
            System.out.println(lines[i]);
        }

    }
}
