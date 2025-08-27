public class CountOccurence {

    public static void main(String[] args) {
        String str = "hello";
        str = str.toLowerCase();
        String counted = "";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (counted.indexOf(c) != -1) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == c) {
                    count++;
                }

            }
            System.out.println(c + " : " + count);
            counted += c;
        }
        System.out.println(counted);
    }
}
