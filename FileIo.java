/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

/**
 *
 * @author The Trio
 */

import java.util.*;
import java.io.*;


public class FileIo
{

    private int lineCount = 0;

    private int wordCount = 0;

    private int[] frequencies = new int[26];

    public int getLineCount()
    {
        return lineCount;
    }

    public int getWordCount()
    {
        return wordCount;
    }

    public int[] getFrequencies()
    {
        return frequencies;
    }

    public void analyzeText(String fileName)
    {

        String currentLine;

        for (int x = 0; x < frequencies.length; x++) frequencies[x] = 0;

        Scanner myFileIn = null;


        try
        {
            myFileIn = new Scanner(new File(fileName));

        } catch (FileNotFoundException e)
        {
            System.out.println("File: "+fileName+" is not found.");
        }


        while (myFileIn.hasNextLine())
        {

            currentLine = myFileIn.nextLine();

            lineCount++;

            String[] words = currentLine.split(" ");

            wordCount += words.length;

            for (int j=0; j < currentLine.length(); j++)
            {

                char ch = Character.toUpperCase(currentLine.charAt(j));

                if (ch <= 'Z' && ch >= 'A')
                {

                    int temp = ch - 'A';

                    frequencies[temp] ++;
                }
                else ;
            }

        }
    }
    
}