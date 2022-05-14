import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
		int count = 0;
		double avrg = 0;
		double x;
		
		for (int i = 0; i < 6; i++) {
			x = input.nextDouble();
			if (x > 0) {
				count++;
				avrg += x;
			}
		}
		
		avrg = avrg / count;
		System.out.println(count + " valores positivos");
		System.out.println(String.format("%.1f", avrg));
  }
}