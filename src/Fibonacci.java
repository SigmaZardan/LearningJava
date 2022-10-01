import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Place for fibonacci: ");

        int number = scanner.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= number) {
            int temp = b;
            b = b + a;
            a = temp;

            count++;



        }

        System.out.printf("The %dth fibonacci number is %d",number,b);


    }
}
