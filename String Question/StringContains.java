public class StringContains {
    
    public static void main(String[] args) {
        
        String str="1234a5";
        boolean onlydigits=false;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if (!Character.isDigit(c)) {
               onlydigits=false;
               break;
                
            }
          
        }
        if (onlydigits) {
            System.out.println("true : "+str);
        }
        else{
            System.out.println("false :"+str);
        }
    }
}
