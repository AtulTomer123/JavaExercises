import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String s1="listen";
        String s2="silent";

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if (s1.length()!=s2.length()) {
            System.out.println("Not Anagram");

            return;
        }
        char[] ch=s1.toCharArray();
        char[] ch1=s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if (Arrays.equals(ch, ch1)) {
            System.out.println("Anagram String");
        }else{
            System.out.println("not anagram");
        }

    }
}
