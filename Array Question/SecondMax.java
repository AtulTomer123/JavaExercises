public class SecondMax {
    
    public static void main(String[] args) {
        
        int[] arr={43,54,23,65,73,73,98,46,35,7};

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if (max<arr[i]) {
                secondMax=max;
                max=arr[i];
            }
            else if (secondMax <arr[i] && max!=arr[i]) {
                secondMax=arr[i];
            }
        }
        System.out.println("The SecondMax is : "+secondMax);
    }
}
