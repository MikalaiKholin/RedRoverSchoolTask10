public class Sequence {
    public static int[] reverse(int n){
        if (n <= 0) return new int[] {0};
        int arr [] = new int[n];
        for (int i = n; i > 0; i--) arr[i - 1] = n - i + 1;
        return arr;
    }
}
