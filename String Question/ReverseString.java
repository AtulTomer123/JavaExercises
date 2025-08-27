
public class ReverseString {

    public static void main(String[] args) {
        String str = "java";
        str = str.toLowerCase();
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);



        //using String Builder
        String str1="i am a java developer";
        String revString=new StringBuilder(str1).reverse().toString();

        System.out.println(revString);
    }
}
