package week1.day2;

public class Calculator {
	
      static int a=5;
      static int b=2;
      static int c=6;
     static float d=5.63f;
     static float e=6.39f;
     static double f=589d;
     static double g=65d;
    public void add() {
    	System.out.println("add");
    }
    public void sub() {
    	System.out.println("sub");
    }
    public void mul() {
    	System.out.println("mul");
    }
    public void div() {
    	System.out.println("div");
    }
      public static void main(String[] args) {
			System.out.println(a+b+c);
			System.out.println(a-b);
			System.out.println(f*g);
			System.out.println(d/e);
			
			Calculator obj=new Calculator();
			obj.add();
			obj.sub();
			obj.mul();
			obj.div();
			
     }}
     
     
     



