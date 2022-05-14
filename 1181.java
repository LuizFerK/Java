import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
	  int l = input.nextInt();
		char t = input.next().toUpperCase().charAt(0);
		double sum = 0;
		double[][] m = new double[12][12];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		for(int j = 0; j < m.length; j++) {
			sum += m[l][j];
		}

		if (t == 'M') sum /= m.length;   
		System.out.println(String.format("%.1f", sum));
  }
}