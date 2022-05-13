import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int workers = input.nextInt();
    int hours = input.nextInt();
    double valuePerHour = input.nextDouble();

    System.out.println("NUMBER = " + workers);
    System.out.println(String.format("SALARY = U$ %.2f" , hours * valuePerHour));
  }
}