import java.util.Random;

public class Main {
    public static void main(String args[]){
        Random random = new Random();
      // Generates random number from 0-100
        int ranNum = random.nextInt(100);   
        System.out.println("Your generated random number is: "+ranNum);
    }
}
