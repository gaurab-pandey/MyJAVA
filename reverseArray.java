/**public class reverseArray {
    public static void main(String[] args) {

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"," );
        }

        System.out.println();

        System.out.println("\nReversed Array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+",");
        }

    }

}**/


import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

       
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
          
            int temp = arr[i]; //temp= arr[0]=1
            arr[i] = arr[n - 1 - i]; //ar[i]=arr[4-1-0]=arr[4]=5
            arr[n - 1 - i] = temp;//arr[4]=temp=1
        }

       
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
