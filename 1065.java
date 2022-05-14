import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			int x = input.nextInt();
			
			if (x == 0) System.out.println("NULL");
			else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");
			else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");
			else if (x % 2 != 0 && x > 0) System.out.println("ODD POSITIVE");
			else if (x % 2 != 0 && x < 0) System.out.println("ODD NEGATIVE");
		}
  }
}