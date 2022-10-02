import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next().toLowerCase();

        // this is enhanced switch statement used in Java

        switch(fruit){
            case "apple" ->System.out.println("Red Fruit");
            case "mango"-> System.out.println("Yellow Fruit");
            case "coconut"-> System.out.println("Black Fruit");
            case "grapes"-> System.out.println("Green Fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

         // this is a case where the break statement is not used.
        int day = scanner.nextInt();
        switch(day){

            case 1,2,3,4,5 -> System.out.println("WeekDay");
            case 6,7 -> System.out.println("WeekEnd");
            default -> System.out.println("Please enter a valid day!!");
        }

      // we ca also use the switch statement in a nested form;
    }
}
