import java.util.Scanner;

public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sequenceOfNumbers = input.nextLine();

        String[] splitNumbers = sequenceOfNumbers.split(" ");
        int[] parseToIntNumbers = new int[splitNumbers.length];

        for (int i = 0; i < parseToIntNumbers.length; i++) {
            parseToIntNumbers[i] = Integer.parseInt(splitNumbers[i]);
        }
        oddOrEven(parseToIntNumbers);
    }
    public static void oddOrEven( int[] parseToIntNumbers){ // create a metod
        if (parseToIntNumbers.length % 2 == 0){
            for (int i = 0; i < parseToIntNumbers.length; i++) {
                if (parseToIntNumbers[i] % 2 == 0){
                    System.out.print(parseToIntNumbers[i] + " ");
                }
            }
        }else if (parseToIntNumbers.length % 2 != 0){
            for (int i = 0; i < parseToIntNumbers.length; i++) {
                if (parseToIntNumbers[i] % 2 != 0 ){
                    System.out.print(parseToIntNumbers[i] + " ");
                }
            }
        }
    }
}
