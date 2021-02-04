
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your favorite class?");
    String favoriteClass = scan.nextInt();
    System.out.println("Who is the teacher of that class?");
    String teacherClass = scan.nextInt();
    
    System.out.println("Your favorite class is" + favoriteClass + "and " + teacherclass + "teaches that class.");
  
  }
  static int (int birthYear, int currentYear)
  {
    int age = currentYear - birthYear;
    return age; 
  }
}