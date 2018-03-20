// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-11):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadowing");
    System.out.println("5. Overloading");
    System.out.println("6. Reverse Digits Method");
    System.out.println("7. First Array");
    System.out.println("8. Try Catch");
    System.out.println("9. Enchanced For");
    System.out.println("10. Search Student");
    System.out.println("11. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;
      case 2:
        System.out.println("Switch lab");
        System.out.println();
        FirstSwitch.main(null);
        break;
      case 3:
        System.out.println("Methods lab");
        System.out.println();
        Methods.main(null);
        break;
      case 4:
        System.out.println("Shadow lab");
        System.out.println();
        Shadow.main(null);
        break;
      case 5:
        System.out.println("Overloading lab");
        System.out.println();
        Arithmetic.main(null);
        break;
      case 6:
        System.out.println("Reverse Digit Method");
        System.out.println();
        Reverse.main(null);
        break;
      case 7:
        System.out.println("First Array lab");
        System.out.println();
        FirstArray.main(null);
        break;
      case 8:
        System.out.println("Try Catch");
        System.out.println();
        TryCatch.main(null);
        break;
      case 9:
        System.out.println("Enhanced For");
        System.out.println();
        EnhancedFor.main(null);
        break;
      case 10:
        System.out.println("Search Student");
        System.out.println();
        SearchStudent.main(null);
        break;
      case 11:
        System.out.println("Exiting....");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}