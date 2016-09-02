package sample1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class sample3 {
	int i = 5;
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            Double y=sc.nextDouble();
            sc.nextLine();
            String s=sc.nextLine();
            sc.close();
            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
            
            Hashtable<Integer, String> a = new Hashtable<>();
            int b[] = {1,2,3};
            ArrayList<Integer> c = new ArrayList<>();
            c.add(3);
            c.add(2);
            c.add(1);
            c.add(0);
            c.remove(0);
            System.out.println(c.get(0));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder("abc");
            
    }
}