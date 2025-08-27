public class FirstNonRepeaded {
    
    public static void main(String[] args) {
        
        String str="swiss";
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if (str.indexOf(c)==str.lastIndexOf(c)) {
                System.out.println("first Non Repeated char is : "+c);
                break;
            }
        }
    }
}
