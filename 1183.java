import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
	  double sum = 0;
		char o = input.next().toUpperCase().charAt(0);
		double[][] m = new double[12][12];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j > i) sum += m[i][j];
			}
		}

		if (o == 'M') sum /= ((m.length * m.length) - 12) / 2;
		System.out.println(String.format("%.1f", sum));
  }
}