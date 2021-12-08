import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;
public class Puzzling{
    public static void main(String[] args) {
        // int[] puzzleArr = {3,5,1,2,9,8,13,25,32};
        // int[] arr1 ={ 2,2,2};
        // Object[] retVal = printSumReturnBig(puzzleArr);
        // System.out.println(Arrays.toString(retVal));
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // System.out.println(Arrays.toString(shuffleAndShow(names)));
        // alphabetScramble();
        Random r = new Random ();
    }
    public static Object[] printSumReturnBig(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for (int i =0; i<arr.length; i++){
            sum+=arr[i];
            if (arr[i] > 10){
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArr.toArray();
    }
    public static Object [] shuffleAndShow(String[] arr) {
        ArrayList<String> newArr = new ArrayList<String>();
        List<String> nameList = new ArrayList<String>();
        for (int i=0; i<arr.length; i++){
            nameList.add(arr[i]);
        }
        Collections.shuffle(nameList);
        for (int i=0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
            if (nameList.get(i).length() > 5) {
                newArr.add(nameList.get(i));
            }
        }
        return newArr.toArray();
    }
    public static void alphabetScramble() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i<= 'z'; i++){
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        System.out.print(alphabet);
        System.out.println(alphabet.get(alphabet.size()-1));
        System.out.println(alphabet.get(0));
        if(alphabet.get(0) == 'a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' || alphabet.get(0) == 'o' || alphabet.get(0) == 'u') {
            System.out.println("It's a vowel!!");
        }
    }
    public static int[] randomTen() {
        int[] randomArr = new int[10];
        Random r = new Random();
        for (int i =0; i < randomArr.length; i++){
            randomArr[i] = r.nextInt(10) +25;
        }
        return randomArr;
    }
}



