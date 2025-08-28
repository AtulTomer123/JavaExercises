public class MaxAndMin {
    
    public static void main(String[] args) {
        
        int[] arr = { 4, 6, 23, 64, 23, 75, 87, 34, 56 };

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            
            if (max<arr[i]) {
                max=arr[i];
            }
            else if (min>arr[i]) {
                min=arr[i];
            }
        }

        System.out.println("Maximum Number is : "+max);
        System.out.println("Minimum Number is : "+min);
    }
}
