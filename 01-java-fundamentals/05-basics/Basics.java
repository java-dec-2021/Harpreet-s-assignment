import java.util.ArrayList;
import java.util.Arrays; 
public class Basics{
    public static void main(String[] args) {
        // print255();
        // printOdd255();
        // printSum();
        int[] arr1 = {-1,10, -5,-4,-3,-7};
        // iterateArr(arr1);
        // findMax(arr1);
        int[] arr2 = {2,10,3};
        // findAvg(arr2);
        // oddArray();
        // greaterThanY(arr2, 3);
        // greaterThanY(arr1, -6);
        int[] arr3 = {1, 5, 10, -2};
        // squareValues(arr3);
        noNegative(arr3);
    }
    public static void print255(){
        for (int i = 1; i<=255; i++)
            System.out.println(i);
    }
    public static void printOdd255() {
        for (int i=1; i<=255; i=i+2)
            System.out.println(i);
    }
    public static void printSum() {
        int sum = 0;
        for (int i = 0; i<=255; i++){
            sum = i + sum;
            System.out.println("New number: " + i + "Sum: " + sum);
        }
    }

    // iterating through x
    public static void iterateArr(int[] x) {
        for (int i = 0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void findAvg(int[] arr) {
        int avg = 0;
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = arr[i] + sum;
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }
    public static void oddArray() {
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i= 1; i<=255; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }
    public static void greaterThanY(int[] arr, int y) {
        int counter = 0;
        for(int num:arr){
            if(num > y) counter++;
        }
        System.out.println(counter);
    }
    public static void squareValues(int[] x) {
        for (int i=0; i<x.length; i++){
            x[i] = x[i] * x[i];
        }
    System.out.println(Arrays.toString(x));
    }
    public static void noNegative(int [] x) {
        for (int i=0; i<x.length; i++){
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
    System.out.println(Arrays.toString(x));
    }
}