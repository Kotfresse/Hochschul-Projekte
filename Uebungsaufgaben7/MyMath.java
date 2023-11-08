
/**
 * @author Tri Nguyen
 **/
import java.math.BigDecimal;
import java.math.BigInteger;

public class MyMath {
    public static void main(String[] args) {
        /*int[] numbers = new int[21];
        for (int i = 0; i < 21; i++) {
            numbers[i] = (i + 1);
            System.out.print(numbers[i] + ",");
        }
        System.out.println("Sum of numbers: " + addAll(numbers));
        System.out.println("Product of numbers: " + multiplyAll(numbers));
        System.out.println("Concatenation of numbers: " + catAll(numbers));
        long[] numbers2 = new long[21];
        for (int i = 0; i < 21; i++) {
            numbers2[i] = (i + 1);
            System.out.print(numbers2[i] + ",");
        }
        System.out.println("Sum of numbers: " + addAll(numbers2));
        System.out.println("Product of numbers: " + multiplyAll(numbers2));
        System.out.println("Concatenation of numbers: " + catAll(numbers2));
        double[] numbers3 = new double[21];
        for (int i = 0; i < 21; i++) {
            numbers3[i] = (i + 1);
            System.out.print(numbers3[i] + ",");
        }
        System.out.println("Sum of numbers: " + addAll(numbers3));
        System.out.println("Product of numbers: " + multiplyAll(numbers3));
        System.out.println("Concatenation of numbers: " + catAll(numbers3));

        System.out.println("Reverse of 123: " + reverse(123));
        System.out.println("Reverse of 120: " + reverse(120));
        System.out.println("Reverse of -431: " + reverse(-134));

        System.out.println("Minimum of numbers: " + min(numbers));
        System.out.println("Maximum of numbers: " + max(numbers));
        System.out.println("Minimum of numbers: " + min(numbers2));
        System.out.println("Maximum of numbers: " + max(numbers2));
        */
        long[] longs = new long[5];
        for (int i = 0; i < longs.length; i++) {
            longs[i] = MyIO.readLong("Bitte gebe eine Zahl ein: ");
        }
        mergeSort(longs);
        for (long l : longs) {
            System.out.println(l);
        }
    }

    public static int addAll(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static long addAll(long[] numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double addAll(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static BigInteger multiplyAll(int[] numbers) {
        BigInteger product = new BigInteger("1");
        for (int i = 0; i < numbers.length; i++) {
            product = product.multiply(new BigInteger("" + numbers[i]));
        }
        return product;
    }

    public static BigInteger multiplyAll(long[] numbers) {
        BigInteger product = new BigInteger("1");
        for (int i = 0; i < numbers.length; i++) {
            product = product.multiply(new BigInteger("" + numbers[i]));
        }
        return product;
    }

    public static BigDecimal multiplyAll(double[] numbers) {
        BigDecimal product = new BigDecimal("1");
        for (int i = 0; i < numbers.length; i++) {
            product = product.multiply(new BigDecimal("" + numbers[i]));
        }
        return product;
    }

    public static String catAll(int[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static String catAll(long[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static String catAll(double[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static String catAll(String[] numbers) {
        String cat = "";
        cat += numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cat += ", " + numbers[i];
        }
        return cat;
    }

    public static int reverse (int i){
        boolean negative = false;
        if (i < 0) {
            negative = true;
            i = -i;
        }
        int reverse = 0;
        while (i != 0) {
            reverse = reverse * 10 + i % 10;
            i = i / 10;
        }
        if (negative) {
            reverse = -reverse;
        }
        return reverse;
    }
    public static long reverse (long i){
        boolean negative = false;
        if (i < 0) {
            negative = true;
            i = -i;
        }
        long reverse = 0;
        while (i != 0) {
            reverse = reverse * 10 + i % 10;
            i = i / 10;
        }
        if (negative) {
            reverse = -reverse;
        }
        return reverse;
    }
    
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static double min(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static long min(long[] numbers) {
        long min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static float min(float[] numbers) {
        float min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static double max(double[] numbers) {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static long max(long[] numbers) {
        long max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static float max(float[] numbers) {
        float max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (a.equals(BigInteger.ZERO)) {
            return b;
        }
        return gcd(b.mod(a), a);
    }
    public static int lcm(int a, int b) {
        return (a*b)/gcd(a, b);
    }
    public static boolean isPrime(long n){
        if (n <2) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n%2 == 0 || n%3 == 0) {
            return false;
        }
        for(long d=3;d*d<= n;d+=2){
            if(n%d==0){
                return false;
            }
        }
        return true;
    }
    public static long nextPrime (long n){
        if (n <= 1) {
            return 2;
        }
        long prime = n;
        boolean found = false;
        while (!found) {
            prime++;
            if (isPrime(prime)) {
                found = true;
            }
        }
        return prime;
    }
    public static boolean probablebigPrime(BigInteger n){
        return n.isProbablePrime(10);
    }
    public static BigInteger nextbigPrime (BigInteger n){
        return n.nextProbablePrime();
    }
    public static long[] mergeSort(long[] longs){
        mergesort(longs);
        return longs;
    }
    public static int[] mergeSort(int[] ints){
        mergesort(ints);
        return ints;
    }
    public static double[] mergeSort(double[] doubles){
        mergesort(doubles);
        return doubles;
    }
    public static float[] mergeSort(float[] floats){
        mergesort(floats);
        return floats;
    }
    private static void mergesort(int[] arr) {
        if (arr == null) {
            return;
        }

        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

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
    private static void mergesort(double[] arr) {
        if (arr == null) {
            return;
        }

        if (arr.length > 1) {
            int mid = arr.length / 2;

            double[] left = new double[mid];
            double[] right = new double[arr.length - mid];

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
    private static void mergesort(float[] arr) {
        if (arr == null) {
            return;
        }

        if (arr.length > 1) {
            int mid = arr.length / 2;

            float[] left = new float[mid];
            float[] right = new float[arr.length - mid];

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
    private static void mergesort(long[] arr) {
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
