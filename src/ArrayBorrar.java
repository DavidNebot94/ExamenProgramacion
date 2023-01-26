import java.util.Arrays;

public class ArrayBorrar {

    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 3, 4, 8, 9};
        int item = 4;

        arr = removeElement(arr, item);
        System.out.println(Arrays.toString(arr));
    }
}