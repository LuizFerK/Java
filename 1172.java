import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
	  int[] x = new int[10];
		
		for (int i=0; i < x.length; i++) {
			x[i] = input.nextInt();
		}
		for (int i=0; i < x.length; i++) {
			if (x[i] <= 0) x[i] = 1;
		}
		for (int i=0; i < x.length; i++) {
			System.out.println("X["+ i +"] = " + x[i]);
		}
  }
}