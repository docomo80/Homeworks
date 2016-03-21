import  java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Problem07RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int max = input.nextInt();

        Random rn = new Random();
        if ( min < max){
            int range = (max - min) + 1;

        System.out.println( );
            for (int i = 0; i <= max - min ; i++) {
                int randomNum =  rn.nextInt(range) + min;
                System.out.println(randomNum);
            }
        }else if (min > max){
            int range = (min - max) + 1;

            for (int i = 0; i <= min - max ; i++) {
                int randomNum =  rn.nextInt(range) + max;
                System.out.println(randomNum);
            }
        }else if (min == max){
            System.out.println(min);
        }

    }
}
