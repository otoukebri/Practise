package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> reminders = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            reminders.put(a[i]%k, reminders.getOrDefault(a[i]%k, 0)+1);
        }
       
        int count = Math.min(reminders.getOrDefault(0, 0), 1);
        
        for(int i=1; i<=k/2; i++) {
        	if(i == k-i)
        		count += Math.min(reminders.getOrDefault(i, 0), 1);
        	//if(i != k-i)
        	else
        		count += Math.max(reminders.getOrDefault(i, 0), reminders.getOrDefault(k-i, 0));
        
        }
        System.out.println(count);
    }
}