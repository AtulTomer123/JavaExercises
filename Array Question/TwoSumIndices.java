public class TwoSumIndices {

    public static void main(String[] args) {
        
        int[] arr={23,87,45,2,9,11,12,3};
        int target=12;
        boolean found=false;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if (arr[i]+arr[j]==target) {

                    System.out.print("Indicies :[" + "index of " +i + " +  "+"index of "+ j+"] : "+target);
                    found=true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
    }
}