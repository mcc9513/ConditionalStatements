import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");
        int number = scanner.nextInt();
        String message = (number > 212) ? "Water is boiling!" : "Water is not boiling!";
        System.out.println(message);
    }
}
