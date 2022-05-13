import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();

    System.out.println("X = " + (a + b) + "\n");
  }
}