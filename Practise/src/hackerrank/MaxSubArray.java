package hackerrank;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
        	
            int n = sc.nextInt();
            
            int max_till_here = sc.nextInt();
            int max_so_far = max_till_here;
            
            int max_non_cont = max_till_here; //this is to calculate max non contagious value
       
            for(int j=1; j<n; j++) {
                int next = sc.nextInt();
                
                max_till_here = Math.max(max_till_here + next, next);
                max_so_far = Math.max(max_so_far, max_till_here);
                
                max_non_cont = Math.max(max_non_cont, Math.max(max_non_cont + next, next));
            }
            System.out.println(max_so_far +" " +max_non_cont);
        }
	}
}
