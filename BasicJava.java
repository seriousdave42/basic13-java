import java.util.ArrayList;

public class BasicJava {
    public void print1To255 () {
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255 () {
        for (int i = 1; i <= 255; i+=2) {
            System.out.println(i);
        }
    }

    public void printSum0To255 () {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Current sum: " + sum);
        }
    }

    public void printArray (int[] arr) {
        for (int number : arr) {
            System.out.println(number);
        }
    }

    public void maxArrayValue (int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty!");
        }
        else {
            int max = arr[0];
            for (int number : arr) {
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("Max value = " + max);
        }
    }

    public void averageArrayValue (int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty!");
        }
        else {
            float sum = 0;
            for (int number : arr) {
                sum += number;
            }
            float average = sum/arr.length;
            System.out.println("Average value = " + average);
        }
    }

    public ArrayList<Integer> oddArray1To255() {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i += 2) {
            oddArray.add(i);
        }
        return oddArray;
    }

    public int greaterThanY(int[] arr, int y) {
        int greater = 0;
        for (int number : arr) {
            if (number > y) {
                greater++;
            }
        }
        return greater;
    }

    public void squareArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public void eliminateNegatives (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }   
    }

    public float[] maxMinAvg (int[] arr) {
        float[] output = new float[] {0, 0, 0};
        if (arr.length == 0) {
            System.out.println("Array is empty!");
        }
        else {
            float max = arr[0];
            float min = arr[0];
            float sum = 0;
            for (int number : arr) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                sum += number;
            }
            output[0] = max;
            output[1] = min;
            output[2] = sum/arr.length;   
        }
        return output;
    }

    public void shiftArray (int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty!");
        }
        else {
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
        }
    }
}