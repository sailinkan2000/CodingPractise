import java.util.Scanner; 
 
public class QuizProgram { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    int score = 0; 
     
    System.out.println("Welcome to the Quiz Program!"); 
     
    // Question 1 
    System.out.println("Question 1: What is the capital of France?"); 
    System.out.println("a. London"); 
    System.out.println("b. Paris"); 
    System.out.println("c. Berlin"); 
    String answer1 = input.nextLine().toLowerCase(); 
    if (answer1.equals("b")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Sorry, the correct answer is Paris."); 
    } 
     
    // Question 2 
    System.out.println("Question 2: What is the largest planet in our solar system?"); 
    System.out.println("a. Jupiter"); 
    System.out.println("b. Earth"); 
    System.out.println("c. Mars"); 
    String answer2 = input.nextLine().toLowerCase(); 
    if (answer2.equals("a")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Sorry, the correct answer is Jupiter."); 
    } 
     
    // Display final score 
    System.out.println("Your final score is: " + score); 
  } 
} 