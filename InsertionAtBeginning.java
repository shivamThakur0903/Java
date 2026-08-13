import java.util.Arrays;

public class InsertionAtBeginning{
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40};
        int newValue = 5;

        // 1. Create a new array with one extra slot
        int[] newArray = new int[original.length + 1];

        // 2. Insert the new element at the beginning
        newArray[0] = newValue;

        // 3. Copy original array elements starting from index 1
        System.arraycopy(original, 0, newArray, 1, original.length);

        // Output: [5, 10, 20, 30, 40]
        System.out.println(Arrays.toString(newArray)); 
    }
}
