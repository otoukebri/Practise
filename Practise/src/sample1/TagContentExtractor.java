package sample1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();
         validContent(line);
             //Write your code here
         
         testCases--;
      }
      in.close();
   }
    
   public static void validContent(String line) {
       char []allChars = line.toCharArray();
       String tempLine = line;
       
       for(int i=0; i<allChars.length; i++) {
    	   //if()
       }
   }
}