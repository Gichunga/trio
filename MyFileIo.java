/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

/**
 *
 * @author Steve
 */
  import java.util.*;
import java.io.*;


public class MyFileIo {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {


        FileIo textAnalyzer = new FileIo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String filename = sc.next();

        textAnalyzer.analyzeText(filename);

        System.out.println("Number of Lines: " + textAnalyzer.getLineCount());
        System.out.println("Number of Words: " + textAnalyzer.getWordCount());
        System.out.println("Letter Counts");
        int[] frequencies = textAnalyzer.getFrequencies();
        for (int k = 0; k < frequencies.length; k++)
            System.out.println("Frequency of " + (char)('A'+ k) +
                    ": "+frequencies[k] + " ");
        System.out.println();
    }

}
    
    

