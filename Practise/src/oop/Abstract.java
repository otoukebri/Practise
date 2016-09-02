package oop;

import java.util.Scanner;

public class Abstract {
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
      	System.out.printf("Total is: $%,.2f%n", 11.3);
      	System.out.printf("Total: %-10.1f: ", 11.3);
      	System.out.printf("% 4d", 11);
      	System.out.printf("%20.10s\n", "hi");
      	String s = "Hello World";
      	System.out.printf("The String object %s is at hash code %h%n", s, s);
	}
}

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book {

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
	}
}