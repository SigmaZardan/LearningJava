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

    }
}
