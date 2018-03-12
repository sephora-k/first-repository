import java.util.Scanner;
  public class Arithmetic{
     public static void main(String[] args){
		 Arithmetic a = new Arithmetic();
		 Index.main(null);

		 System.out.println("2 + 3 = "+a.addNumbers(2,3));
		 System.out.println("2 + 3 + 5 = "+a.addNumbers(2,3,5));
     }

     public int addNumbers(int x, int y)
     {
		 return x + y;
	 }

	 public int addNumbers(int x, int y, int z)
	 {
	      return x + y + z;
	  }

  }