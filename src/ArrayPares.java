public class ArrayPares {
        public static void main(String[] args) {
                int[] array = { 2, 8, 5, 7, 14, 4, 71, 33, 10, 6, 9, 0 };

                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + ",");
                }
                for (int i = 0; i < array.length; i++) {
                        array[i]++;
                }
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + ",");
                }
        }
}