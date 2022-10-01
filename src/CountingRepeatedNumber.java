public class CountingRepeatedNumber {

    public static void main(String[] args){


        int ans = countingFunction(223523466,2);
        System.out.printf("The occurrence of the entered number:" + ans);



    }

    static int countingFunction(int number, int numberToFind){
        int count = 0;

        while(number > 0){

            int remainder = number % 10;
            if(remainder == numberToFind){
                count++;
            }
            number  = number / 10;
        }
        return count;


    }
}
