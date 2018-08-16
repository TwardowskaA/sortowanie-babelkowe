import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int[] unsorted = new int[]{9, 5, 8, 2, 7};

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj typ sortowania:");
        String x = scan.nextLine();
        if (x.equals("rosnąco")) {
            int[] sorted = BubbleSort.sort(unsorted, new IntegerAscComparator());
            System.out.println(Arrays.toString(sorted));
        } else if (x.equals("malejąco")) {
            int[] sorted = BubbleSort.sort(unsorted, new IntegerDscComparator());
            System.out.println(Arrays.toString(sorted));
        }

    }

    private static int[] sort(int[] array, Comparator<Integer> comparator) {

        int[] copy = Arrays.copyOf(array, array.length);
        boolean wereSwaps = true;

        while (wereSwaps) {
            wereSwaps = false;
            for (int i = 0; i < copy.length - 1; i++) {
                if (comparator.compare(copy[i], copy[i + 1]) > 0) {
                    int temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                    wereSwaps = true;
                }

            }


        }
        return copy;
    }
}


