import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
	  int aux;
		int[] n = new int[20];

		for (int i=0; i < n.length; i++) {
			n[i] = input.nextInt();
		}
		for (int i=0; i < (n.length / 2); i++) {
			aux = n[i];
			n[i] = n[n.length - 1- i];
			n[n.length - 1 -i] = aux;
		}
		for (int i=0; i < n.length; i++) {
			System.out.println("N["+ i +"] = " + n[i]);
		}
  }
}