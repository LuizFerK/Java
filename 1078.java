import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(i + " x " + n + " = " + (n * i));
		}
  }
}