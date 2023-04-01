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

    public static String split(String data)
    {
        return data.replace(" ","");
    }

    public void compareToSample()
    {
        String orderStr1="artistic";

        String orderStr2="banana";

        //if first string comes before, compareTo will return negative value.
        //if first and second value is equally ordered, then compareTo will return 0.
        //if first string comes after from second, compareTo will return positive value.

        System.out.println(orderStr1.compareTo(orderStr2));

        orderStr1="banana";

        orderStr2="Banana";

        System.out.println(orderStr1.compareTo(orderStr2));
        System.out.println(orderStr1.compareToIgnoreCase(orderStr2));

    }

    public void containSample()
    {
        String strVar="test data for : contanins tample";

        System.out.println(strVar.contains(":"));
    }

    public void concatanationSample()
    {
        String str1="This is sample text val";
        String str2="this is the second val for test";

        System.out.println(str1+" "+str2);

        System.out.println(str1+4);

        System.out.println(str1+3+4);
        System.out.println(str1+(3+4));

        System.out.println(3+4);

        //if we add the length of string which we will concat, the jvm will allocate the exact memory for it. no more space.
        //this is important for performance tunning.
        StringBuilder anotherConcat=new StringBuilder(str1.length()+1+str2.length()).append(str1).append(" ").append(str2);
        System.out.println(anotherConcat);

        //stringbuffer is like stringbuilder. we can assume that just older version of stringbuilder.

        String strBuf=new StringBuffer().append(str1).append(" ").append(str2).toString();
        System.out.println(strBuf);

        //efficient looking and easy to read. But this is same as static concat via + sign.
        System.out.format("%s %s",str1,str2);

        //to Conclude, if you wanna to consider with memory optimization, you should select the way of String Builder.
    }

    public void someOtherUseful()
    {
        System.out.println("Erhan Arslan".startsWith("Z"));
        System.out.println("Erhan Arslan".endsWith("n"));

        String str1="erhan";
        String str2="arslan";

        System.out.println(str1.compareTo(str2));

        str1="apple";
        str2="apple";

        System.out.println("1- content equals of :"+str1.contentEquals(str2));

        str1=new String("apple");
        str2=new String("apple");

        System.out.println("2- object equals: "+(str1==str2));
        System.out.println("3- content equals: "+str1.contentEquals(str2));

        str1=" ";// if str1 equals to null, code will give null pointer exception.
        str2="";

        System.out.println("4- object equals: "+(str1==str2));
        System.out.println("5- content equals: "+str2.contentEquals(str1));


        // I tried to show this because of we don't need to convert stringbuffer to string to compare. we can use contentequals.
        //it doesn't care with the object type.
        StringBuffer s3=new StringBuffer("a");
        str1="a";
        System.out.println("6- string and buffer comparison: "+str1.contentEquals(s3));

        StringBuilder s4=new StringBuilder("a");

        System.out.println("string builder and str content equals: "+str1.contentEquals(s4));

    }

}
