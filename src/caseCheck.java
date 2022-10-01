import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){ // here the check is done using ascii value

            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }


    }




}
