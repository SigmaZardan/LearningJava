import java.util.Scanner;

public class Largest {

    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // finding the largest among these three inputs
      int max = a;

      if( b > max){

          max = b;
      }

      if(c > max ){
          max = c;
      }

      System.out.println(max);

    }
}

// we can alo use some optimized method to get the maximum among three numbers


