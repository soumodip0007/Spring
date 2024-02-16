package com.spring.constructorInjection;

public class Square {
   private int a;
   private int b;
   private int c;
   
   public Square(int a, int b, int c) {
	   this.a = a;
	   System.out.println("Constructor : int");
	   System.out.println(b);
	   System.out.println(c);
   }
   public Square(double a) {
	   this.a = (int) a;
	   System.out.println("Constructor : double");
   }
   public Square(String a) {
	   this.a = Integer.parseInt(a);
	   System.out.println("Constructor : String");
   }
   
   public void sq() {
	   System.out.println("Square is= " + (this.a * this.a));
   }
}
