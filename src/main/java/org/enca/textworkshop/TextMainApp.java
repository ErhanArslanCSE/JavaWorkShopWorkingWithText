package org.enca.textworkshop;

import java.io.*;

/**
 * workshop for Java Text Lesson for Dummies
 * @tutor Erhan Arslan
 */
public class TextMainApp
{
    public static void main( String[] args )
    {
        File dataFile=new File("D:\\IntellijProjects\\JavaWorkShopWorkingWithText\\src\\main\\resources/TextDataForWorkshop");
        String line ="";
        try {
            BufferedReader reader=new BufferedReader(new FileReader(dataFile));
            String currentLine = reader.readLine();
            line += currentLine ;
            while (currentLine!=null) {
                currentLine=reader.readLine();
                line += currentLine ;
            }

            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        TextOperations textOpt=new TextOperations();

        //textOpt.printAllUpperCaseLetters(line);

        //shows the memory allocating of String initializing.
        //textOpt.stringAddress();

        //textOpt.BlankEmptyTest();

        //textOpt.replaceSample();

        //textOpt.stripSample();

        //System.out.println(TextOperations.split("dsadsa dsa dsa d sa"));

        //textOpt.compareToSample();

        //textOpt.containSample();

        //textOpt.concatanationSample();

        textOpt.someOtherUseful();
    }
}
