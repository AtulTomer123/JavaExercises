public class FirstRepeated {
    public static void main(String[] args) {
        
        String str="hello";
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if (str.indexOf(c)!=str.lastIndexOf(c)) {
                System.out.println("the first repeated char is : "+c);
                break;
            }
        }
    }
}
