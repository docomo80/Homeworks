import java.util.Scanner;

public class Problem06ConvertFromBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        System.out.println( BaseConversion(number,7,10));
    }
    public static String BaseConversion(String number, int base1, int base2){
        return Integer.toString(Integer.parseInt(number, base1), base2);
    }
}