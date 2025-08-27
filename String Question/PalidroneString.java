public class PalidroneString {

    public static void main(String[] args) {

        String str = "level";
        str = str.toLowerCase();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equals(str)) {
            System.out.println("String is palidrone : " + str);
        } else {
            System.out.println("String is not palidrone : " + str);
        }


        //using StringBuilder


        String str1="madam";
        String revString=new StringBuilder(str1).reverse().toString();

        if (revString.equals(str1)) {
             System.out.println("String is palidrone : " + str1);
        } else {
            System.out.println("String is not palidrone : " + str1);
        }
    }
}
