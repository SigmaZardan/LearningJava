import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        long result = 0;

        while(number > 0){

            long remainder = number % 10;
            result = result * 10 + remainder;
            number = number /10;



        }

        System.out.println("The reversed number is " + result);






    }
}