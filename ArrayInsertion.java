import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int elementToInsert = 25;
        int targetIndex = 2; // Insert at index 2 (third position)

        // 1. Create a new array with +1 size
        int[] newArray = new int[originalArray.length + 1];

        // 2. Build the new array
        for (int i = 0; i < newArray.length; i++) {
            if (i < targetIndex) {
                // Copy elements before the target index
                newArray[i] = originalArray[i];
            } else if (i == targetIndex) {
                // Insert the new element at the target index
                newArray[i] = elementToInsert;
            } else {
                // Copy remaining elements, shifting their index by 1
                newArray[i] = originalArray[i - 1];
            }
        }

        // Output: [10, 20, 25, 30, 40, 50]
        System.out.println(Arrays.toString(newArray));
    }
}
