import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
		float first, media = 0, a = 0, b = 0;

		while (b != 2) {
			first = input.nextFloat();
			if (first >=0.0 && first <= 10.0) {
				a += first;
				b += 1;
			}else {
				System.out.print("nota invalida\n");
			}
		}
		
		media =(float) a / 2;
		
		System.out.printf("media = %.2f\n",media);
  }
}