import java.util.Scanner;

public class Problem08OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        String[] splitNumber = number.split(" ");
        int[] convertNumberToInt = new int[splitNumber.length];

        if (convertNumberToInt.length % 2 == 0) {

            for (int i = 0; i < convertNumberToInt.length; i++) {
                convertNumberToInt[i] = Integer.parseInt(splitNumber[i]);
            }
            for (int i = 0; i < convertNumberToInt.length - 1; i += 2) {
                if (convertNumberToInt[i] % 2 == 0 && convertNumberToInt[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even", convertNumberToInt[i], convertNumberToInt[i + 1]);
                }else if (convertNumberToInt[i] % 2 != 0 && convertNumberToInt[i + 1] % 2 != 0){
                    System.out.printf("%d, %d -> both are odd", convertNumberToInt[i], convertNumberToInt[i + 1]);
                }else {
                    System.out.printf("%d, %d -> different", convertNumberToInt[i], convertNumberToInt[i + 1]);
                }
                System.out.println( );
            }
        }else {

            System.out.println("Invalid length");

        }
    }
}
