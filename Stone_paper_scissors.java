import java.util.Random;

public class Stone_paper_scissors {
    public static void main(String[] args) {
        
         String[] choices = {"Stone", "Paper", "Scissors"};
        
        // Create a random number generator
        Random random = new Random();
        
        // Randomly assign choices to three users
        String user1 = choices[random.nextInt(choices.length)];
        String user2 = choices[random.nextInt(choices.length)];
        String user3 = choices[random.nextInt(choices.length)];
        
        // Display the choices of each user
        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
        System.out.println("User 3: " + user3);
    }
}
