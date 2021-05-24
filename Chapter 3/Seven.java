import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        int correctAnswer = 2;
        
        System.out.println(question+"\n1."+choiceOne+"\n2."+choiceTwo+"\n"+choiceThree+"\n");

        Scanner ans = new Scanner(System.in);
        System.out.println("Enter the index of correct answer.");
        if(ans.nextInt()==correctAnswer){
            System.out.println("Congrats! That's the correct answer");
        } else {
            System.out.println("You are wrong. Shame on you!");
        }
        ans.close();
    }
}
