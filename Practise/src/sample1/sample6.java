package sample1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sample6 {
   public static void main(String[] args){
     String username = "a12345678901234567890123456789";
     String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
     Pattern r = Pattern.compile(pattern);
     Matcher m = r.matcher(username);
      
     if (m.find( )) {
        System.out.println("Valid");
     } else {
        System.out.println("Invalid");
     }
   }
}