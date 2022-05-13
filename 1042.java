import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int sort[] = {a,b,c};
    int tmp[] = {a,b,c};
    
    Arrays.sort(sort);

    for (int i = 0; i < sort.length; i++) {
        System.out.println(sort[i]);
    }
    System.out.println();
    for (int i = 0; i < tmp.length; i++) {
        System.out.println(tmp[i]);
    }
  }
}