import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int checks = 0;
        int swaps = 0;
        int[] array = new int[]{9, 5, 8, 2, 7};
        boolean wereSwaps = true;

        for (int j = 0; j < array.length && wereSwaps; j++) {
            wereSwaps = false;
            for (int i = 0; i < array.length - 1 - j; i++) {
                checks++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swaps++;
                    wereSwaps = true;
                }

            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("liczba porównań: " + checks);
        System.out.println("liczba porównań: " + swaps);
    }

}

