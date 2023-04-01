package org.enca.textworkshop;

import java.util.Arrays;

public class TextOperations {

    public void printAllLine(String data)
    {
        System.out.print(data);
    }

    public void printAllUpperCaseLetters(String data)
    {
        int totalLength=data.length();
        for(int i=0;i<totalLength;i++)
        {
            if(data.substring(i,i+1).equals(data.substring(i,i+1).toUpperCase()))
            {
                System.out.print(data.substring(i,i+1));
            }
        }
    }
    public void stringAddress()
    {
        //here, JVM automatically decide to allocate only one memory for "dog" String value.
        String s1="dog";
        String s2="dog";

        //here, JVM doesn't control the value of String. it allocates two different spaces for s3 and s4.
        String s3=new String("cat");
        String s4=new String("cat");

        if(s1==s2)
        {
            System.out.println("s1 and s2 allocates the same memory address.");
        }
        if(s3==s4)
        {
            System.out.println("s3 and s4 allocate the same memory address.");
        }
        else
        {
            System.out.println("s3 and s4 don't allocate the same memory addresses.");
        }
    }

    public void BlankEmptyTest()
    {
        String myText="";
        System.out.println("String val is empty true/false? : "+myText.isEmpty());

        myText=" ";
        System.out.println("String val is empty true/false? : "+myText.isEmpty());

        myText=" ";
        System.out.println("String val isBlank true/false? : "+myText.isBlank());

        myText="r";
        System.out.println("String val isBlank true/false? : "+myText.isBlank());
    }

    public void replaceSample()
    {
        String sampleStr="Here is my sample fruits:apple,banana,watermelon,cherry.";

        String fruitStartStr=sampleStr.replaceAll(sampleStr.substring(0,sampleStr.indexOf(":")+1),"");

        String cleanedData=fruitStartStr.substring(0,fruitStartStr.indexOf("."));
        //System.out.println(cleanedData);
        String[] myFruits=cleanedData.split(",");
        Arrays.stream(myFruits).forEach(s -> System.out.println(s));

        System.out.println("\nTop three fruits are  %s , %s and %s.".formatted(myFruits[0],myFruits[1],myFruits[2]));
    }

    public void stripSample()
    {
        String messyData="test data" +
                "       for messy test." +
                "   <html>" +
                "           <div> here is My Title</div>" +
                "</html>";

        System.out.format("%s",messyData.strip());

        String firstName="          Marc      ";
        System.out.format("%s",firstName.strip());
        System.out.format("%s",firstName.trim());

    }

}
