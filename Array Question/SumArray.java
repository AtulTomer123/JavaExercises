public class SumArray {
    
    public static void main(String[] args) {
        
        int[] arr={6,53,2,54,24,64,345,65};
        int sum=0;

        for(int i=0;i<arr.length;i++){

            sum+=arr[i];
        }
        System.out.println("Sum is : "+sum);
    }
}
