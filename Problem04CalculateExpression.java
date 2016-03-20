import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Problem04CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double formulaOne = Math.pow((a * a + b * b) / (a * a - b * b),((a + b + c) / Math.sqrt(c)));
        double formulaTwo = Math.pow(a * a + b * b - c * c * c, a - b);
        double difference = (formulaOne + formulaTwo) / 2 - ((a + b + c) / 3);

        System.out.printf("%.2f\n", formulaOne);
        System.out.printf("%.2f\n", formulaTwo);
        System.out.printf("%.2f\n", difference);

    }
}
