import java.util.ArrayList;

// Superclass
abstract class DifferenceArraysAndArrayLists {
    public void demonstrate() {
        System.out.println("\nDemonstrating differences between Arrays and ArrayLists.");
    }
}

// Subclass for Array demonstration
class ArrayExample extends DifferenceArraysAndArrayLists {
    @Override
    public void demonstrate() {
        super.demonstrate();
        System.out.println("\nArray Demonstration:");
        int[] numberArray = new int[3]; // Fixed-size array of 3 elements
        numberArray[0] = 10;
        numberArray[1] = 20;
        numberArray[2] = 30;
        
        // Accessing elements in an array
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Element at index " + i + ": " + numberArray[i]);
        }
    }
}

// Subclass for ArrayList demonstration
class ArrayListExample extends DifferenceArraysAndArrayLists {
    @Override
    public void demonstrate() {
        super.demonstrate();
        System.out.println("\nArrayList Demonstration:");
        
        // Demonstrating an ArrayList
        ArrayList<Integer> numberList = new ArrayList<>(); // Dynamic ArrayList
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40); // Can add elements dynamically
        
        // Accessing elements in an ArrayList
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Element at index " + i + ": " + numberList.get(i));
        }
        
        // Removing an element dynamically
        numberList.remove(2); // Removes element at index 2
        System.out.println("\nAfter removing index 2:");
        for (int num : numberList) {
            System.out.println(num);
        }
    }
}

// Main class to execute the examples
public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        DifferenceArraysAndArrayLists arrayExample = new ArrayExample();
        arrayExample.demonstrate();
        
        DifferenceArraysAndArrayLists arrayListExample = new ArrayListExample();
        arrayListExample.demonstrate();
    }
}
