import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // well this code is still incomplete
        // cause this code cannot handle the input 2
        // i will come with the solution tomorrow
       // i gotta go to sleep now
        // good night in the context and for the development of the country
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        if(number <= 1){
            System.out.println("Neither prime nor composite");
        }



        int c = 2;

        while( c*c <= number){

            if(number % c == 0){
                System.out.println("It is not a prime number");
                break;
            }

            c++;
            System.out.println("It is a prime number");
        }


    }
}
