import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class tema4 {
    public static void main(String[] args) {

        //1



        //2
        int[] my_array = {1, 3, 7, 29, 40, 77, 50};
        int[] new_array = new int[17];

        System.out.println("Source Array : "+Arrays.toString(my_array));

        for(int i=0; i < my_array.length; i++) {
             new_array[i] = my_array[i];
        }
        System.out.println("New Array: "+Arrays.toString(new_array));
        System.out.println();


        //3
        int Index_position = 5;
        int newValue = 23;

        System.out.println("Original Array : "+Arrays.toString(my_array));

        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
        System.out.println();


        //4
        int[] a={1, 512, 48, 85, 29, 17, 13, 53};

        Arrays.sort(a);

        System.out.println("min: "+a[0]+" max: "+a[a.length-1]);
        System.out.println();


        //5
        int[] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Array in original order: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        //System.out.println();


        //6
        int[] array1 = {5, 1, 3, 17, 7};
        int[] array2 = {6, 7, 17, 8, 5};
        List<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonElements.add(array1[i]);
                    break;
                }
            }
        }
        System.out.println("Common Elements: " + commonElements);
        System.out.println();


        //7


    }
}
