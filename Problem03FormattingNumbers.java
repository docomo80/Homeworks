import java.util.Scanner;
import java.util.Locale;

public class Problem03FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();

        String intToHex = Integer.toHexString(a);
        System.out.printf("|" + "%-10s" + "|", intToHex.toUpperCase());
        System.out.printf(String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.printf("|" + "%10.2f" + "|", b);
        System.out.printf( "%-10.3f" + "|", c);
    }
}
