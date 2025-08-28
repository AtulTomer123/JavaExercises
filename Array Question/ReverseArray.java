
public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = { 4, 6, 23, 64, 23, 75, 87, 34, 56 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
