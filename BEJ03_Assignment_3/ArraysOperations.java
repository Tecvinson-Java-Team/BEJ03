import java.util.HashMap;
import java.util.Map;

public class ArraysOperations {
    public static void main(String[] args) {
//        Initialize an array of non-negative integers
        int[] arr = {1, 4, 8, 2, 10, 30, 47, 2, 3, 8, 3, 4, 1, 4, 6, 2, 3, 0, 4};

//        Initialize the lowest and greatest numbers
        int greatestNum = arr[0];
        int lowestNum = arr[0];

//        Use the for loop to iterate over every member of the array to get the greatest number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatestNum) {
                greatestNum = arr[i];
            }
        }

//        Use the for loop to iterate over every member of the array to get the lowest number
        for (int j : arr) {
            if (j < lowestNum) {
                lowestNum = j;
            }
        }

//          Declare a HashMap to save the frequency of the members of the array
        HashMap<Integer, Integer> arrCountMap = new HashMap<>();

//        Iterate over the array elements to populate the HashMap and save the frequency of the array elements
        for (int k : arr) {
            if (arrCountMap.containsKey(k)) {
                arrCountMap.put(k, arrCountMap.get(k) + 1);
            } else {
                arrCountMap.put(k, 1);
            }
        }

//        Initialize the highest frequency
        int highestOccurringKey = 0;
        int highestOccurrenceValue = 0;

//        Iterate over the HashMap to get the array element with the highest frequency
        for (Map.Entry<Integer, Integer> entry : arrCountMap.entrySet()) {
            if (entry.getValue() > highestOccurrenceValue) {
                highestOccurrenceValue = entry.getValue();
                highestOccurringKey = entry.getKey();
            }
        }

//        Print out the lowest number, greatest number and the element with the highest frequency
        System.out.println("Lowest number is: " + lowestNum);
        System.out.println("Greatest number is: " + greatestNum);
        System.out.println("Highest occurring number is: " + highestOccurringKey);
    }
}
