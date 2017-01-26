package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DPArrayDivideGame {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    for(int x=0; x<t; x++){
	        int n = s.nextInt();
	        int[] a  = new int[n];
	        for(int i=0; i<n; i++){
	            a[i] = s.nextInt();
	        }

	        Set<Long> aSumSet = new HashSet<Long>();
	        long aSum = 0;
	        boolean allZeros = true;
	        for(int i=0; i<n; i++){
	            aSum += a[i];
	            aSumSet.add(aSum);
	            if(a[i] != 0){
	                allZeros = false;
	            }
	        }

	        if(allZeros){
	            System.out.println(n-1);
	        } else {
	            int res = findMaxDeepness(aSumSet, 0, aSum);
	            System.out.println(res);
	        }
	    }
	}

	public static int findMaxDeepness(Set<Long> pSum, long min, long max){
	    if((max + min) % 2 == 0 && pSum.contains((max + min)/2)){
	        return 1 + Math.max(findMaxDeepness(pSum, min, (max + min)/2), findMaxDeepness(pSum,(max + min)/2, max));
	    } else {  
	        return 0;
	    }

	}

}
