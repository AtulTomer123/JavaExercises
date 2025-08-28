public class DuplicateArray {

    public static void main(String[] args) {

        int[] arr = { 32, 54, 65, 34, 56, 23, 32, 87, 23 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element is : " + arr[j]);
                }
            }
        }
    }
}
