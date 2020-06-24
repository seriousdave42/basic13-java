import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava basic13 = new BasicJava();

        // basic13.print1To255();

        // basic13.printOdd1To255();

        // basic13.printSum0To255();

        int[] test = new int[]{4,-8,22,38,0,-101};
        
        // basic13.printArray(test);

        // basic13.averageArrayValue(test);

        // basic13.maxArrayValue(test);

        // ArrayList<Integer> testList = basic13.oddArray1To255();
        // for (Integer number : testList) {
        //     System.out.println(number);
        // }

        // int target = -500;
        // System.out.println(basic13.greaterThanY(test, target));

        // basic13.squareArray(test);
        // basic13.printArray(test);

        // basic13.eliminateNegatives(test);
        // basic13.printArray(test);

        // for (float number : basic13.maxMinAvg(test)) {
        //     System.out.println(number);
        // }

        basic13.shiftArray(test);
        basic13.printArray(test);
    }
}