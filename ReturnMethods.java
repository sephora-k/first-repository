import java.util.Scanner;
  public class ReturnMethods{
     public static void main(String[] args){

      ReturnMethods m = new ReturnMethods();
      int number = m.method1();
      System.out.println("Method 3 returned"+number+" via method1 and method2");
      Index.main(null);
      }

     public int method1(){
       System.out.println("Method 1 here and I am calling Method 2");
        return method2();
     }
     public int method2(){
       System.out.println("Hi Method 1, from Method 2, I am calling Method 3");
       return method3();
     }
      public int method3(){
        System.out.println("Hi Method 2, from Method 3, tell Method 1 I said hello.");
        return 5;
     }

 }
