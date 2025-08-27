public class LongestSubstring {

    public static void main(String[] args) {
        
        String str="abcdebsfopn";
        str=str.toLowerCase();

        String result="";
        String longest="";

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if (result.indexOf(c)!=-1) {
                if (result.length()>longest.length()) {
                    longest=result;
                }
              result=result.substring(result.indexOf(c)+1)+c;
            }
            else{
                result+=c;
            }

            if (result.length()>longest.length()) {
                longest=result;
            }
        }
        System.out.println("longest string is : "+longest);
        System.out.println("longest length is : "+longest.length());
    }
}