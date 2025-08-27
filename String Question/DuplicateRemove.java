import java.util.*;
public class DuplicateRemove {
    
    public static void main(String[] args) {
        
        String str="hello world";
        str=str.toLowerCase();
        String result="";

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
           
            if (result.indexOf(c)==-1) {
                result+=c;
            }
        }
        System.out.println("After remove String is : "+result);



        //using set of collections

    

        String str1 = "helooooolldnhybaajnn";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i)); // duplicate automatically ignore ho jayega
        }

        // set ko string mein convert karo
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }

        System.out.println("After Removing The duplicate : "+sb.toString());
    }
}

    
