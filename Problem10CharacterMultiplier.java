import java.util.Scanner;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.nextLine();
        String secondString = input.nextLine();

        characterMultiplier(firstString, secondString);
    }
    public static void characterMultiplier(String firstString, String secondString){

        int sum = 0;

        char[] splitNumber1 = firstString.toCharArray();
        char[] splitNumber2 = secondString.toCharArray();

        if (splitNumber1.length > splitNumber2.length) {

            for (int i = 0, k = 0; i < splitNumber1.length; i++, k++) {
                if (i < splitNumber2.length) {
                    sum += splitNumber1[i] * splitNumber2[i];
                } else if (i >= splitNumber2.length) {
                    sum += splitNumber1[i];
                }
            }
        } else if (splitNumber1.length == splitNumber2.length) {
            for (int i = 0, k = 0; i < splitNumber1.length; i++, k++) {
                sum += splitNumber1[i] * splitNumber2[i];
            }

        } else if (splitNumber1.length < splitNumber2.length){
            for (int i = 0, k = 0; i < splitNumber2.length; i++, k++) {
                if (i < splitNumber1.length) {
                    sum += splitNumber1[i] * splitNumber2[i];
                } else if (i >= splitNumber1.length) {
                    sum += splitNumber2[i];
                }
            }
        }
        System.out.println(sum);


    }
}
