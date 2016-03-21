import java.util.Scanner;

public class Problem02TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstCoordinates = input.nextLine();
        String secondCoordinates = input.nextLine();
        String thirdCoordinates = input.nextLine();

        String[] splitFirst = firstCoordinates.split(" +"); // split without space
        String[] splitSecond = secondCoordinates.split(" +");
        String[] splitThird = thirdCoordinates.split(" +");

        int[] splitFirstInt = new int[splitFirst.length];
        int[] splitSecondInt = new int[splitSecond.length];
        int[] splitThirdInt = new int[splitThird.length];

        for ( int i = 0; i < splitFirst.length; i++){ // get integer with loop
            splitFirstInt[i] = Integer.parseInt(splitFirst[i]);
        }
        int aX = splitFirstInt[0]; // assign numbers to int variable
        int aY = splitFirstInt[1]; // assign numbers to int variable

        for ( int i = 0; i < splitSecond.length; i++){
            splitSecondInt[i] = Integer.parseInt(splitSecond[i]);
        }
        int bX = splitSecondInt[0]; // assign numbers to int variable
        int bY = splitSecondInt[1]; // assign numbers to int variable

        for ( int i = 0; i < splitThird.length; i++){
            splitThirdInt[i] = Integer.parseInt(splitThird[i]);
        }
        int cX = splitThirdInt[0]; // assign numbers to int variable
        int cY = splitThirdInt[1]; // assign numbers to int variable

        int area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
        int positiveArea = Math.abs(area);// make number always positive

        System.out.println(positiveArea);

    }
}
