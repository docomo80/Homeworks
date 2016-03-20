import java.util.Scanner;

public class Problem05ConvertFromDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();

        System.out.println( BaseConversion(number,10,7));
    }
    public static String BaseConversion(String number, int base1, int base2){
        return Integer.toString(Integer.parseInt(number, base1), base2);
    }
}
