
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your favorite class?");
    String favoriteClass = scan.next();
    System.out.println("Who is the teacher of that class?");
    String teacherClass = scan.next();
  }

  static int periodClass(String favoriteClass, String teacherClass) {
    System.out.println("Your favorite class is" + favoriteClass + "and " + teacherClass + "teaches that class.");
    if (favoriteClass == "art" && teacherClass == "Flavio") {
      return 5;
    }else if (favoriteClass == "programming" && teacherClass == "Gaber") {
      return 7;
    } else {
      return 0;
    }
  }

}