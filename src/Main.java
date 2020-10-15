import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int[] numbers = new int[]{5,4,8,9,6,3,7,4,2,85,63,45,10};
        int ranNum = random.nextInt(numbers.length-1);
        int a = numbers[ranNum];
        System.out.print("Your generated random number is:  ");
        System.out.println(a);
        System.out.println("Enter a number and I will generate a random number in its range");
        int max = sc.nextInt();
        System.out.println("Random is " + max);
        System.out.println("Sum of two random numbers generated from it");
        System.out.println(sum(max));
    }

    public static int sum(int maxNum){
        int a = random.nextInt(maxNum), b = random.nextInt(maxNum);
        return a + b ;	
    }
}
