// File: AddElementInArray.java
// Problem: Add an element to the end of array (returns new array)
// Approach: Create a new array of size+1 and copy elements, add new element
// Time: O(n), Space: O(n)
public class AddElementInArray {
    public static int[] addElement(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
        newArr[arr.length] = element;
        return newArr;
    }
}
