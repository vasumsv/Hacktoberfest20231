import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        // Create an empty dynamic array
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Add elements to the dynamic array
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        // Access elements by index
        System.out.println(dynamicArray.get(0)); // Output: 1
        System.out.println(dynamicArray.get(1)); // Output: 2
        System.out.println(dynamicArray.get(2)); // Output: 3

        // Modify elements by index
        dynamicArray.set(1, 4);

        // Get the size of the dynamic array
        int size = dynamicArray.size();
        System.out.println("Size: " + size); // Output: 3

        // Remove elements by value
        dynamicArray.remove(Integer.valueOf(3));

        // Iterate through the dynamic array
        for (Integer item : dynamicArray) {
            System.out.println(item);
        }

        // Clear the dynamic array
        dynamicArray.clear();

        // Check if the dynamic array is empty
        boolean isEmpty = dynamicArray.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}
