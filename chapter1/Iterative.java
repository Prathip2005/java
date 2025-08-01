import java.util.Scanner;

public class Iterative {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int a = pr.nextInt();

        if (a % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
    }
}




