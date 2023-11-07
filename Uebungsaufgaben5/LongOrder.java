/**
 * @author Tri Nguyen
 **/
public class LongOrder {
    public static void main(String[] args) {
        long[] longs = new long[5];
        for (int i = 0; i < longs.length; i++) {
            longs[i] = MyIO.readLong("Bitte gebe eine Zahl ein: ");
        }
        mergeSort(longs);
        for (long l : longs) {
            System.out.println(l);
        }
        order(41,33,98);
    }
    public static void order(long a, long b, long c){
        long[] longs = new long[3];
        longs[0] = a;
        longs[1] = b;
        longs[2] = c;
        mergeSort(longs);
        for (int i = 0; i < longs.length; i++)System.out.println(longs[i]);
    }

    public static void mergeSort(long[] arr) {
        if (arr == null) {
            return;
        }

        if (arr.length > 1) {
            int mid = arr.length / 2;

            long[] left = new long[mid];
            long[] right = new long[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            mergeSort(left);
            mergeSort(right);

            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < left.length) {
                arr[k++] = left[i++];
            }

            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    }
}
