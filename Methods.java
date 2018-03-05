import java.util.Scanner;
  public class Methods{
     public static void main(String[] args){

		 Methods m = new Methods();
		 m.method1();
	 }

     public void method1(){
       System.out.println("Method 1 here and I am calling Method 2");
        method2();
     }
     public void method2(){
       System.out.println("Hi Method 1, from Method 2, I am calling Method 3");
        method3();
     }
      public void method3(){
        System.out.println("Hi Method 2, from Method 3, tell Method 1 I said hello.");
     }

 }
