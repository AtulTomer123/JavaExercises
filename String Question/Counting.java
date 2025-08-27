// in this we count vowels,consonants,digits,and special charcters
public class Counting {
    public static void main(String[] args) {
        
        String str="hello@123.com";
        str=str.toLowerCase();
        int counts=0;
        int consonants=0;
        int digits=0;
        int special=0;
        

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if (Character.isLetter(c)) {
                
                if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                    counts++;
                }
                else{
                    consonants++;
                }
            }
            else if (Character.isDigit(c)) {
               digits++;
            }
            else{
                special++;
            }
                
            
        }

        System.out.println("Vowels : "+counts);
        System.out.println("Consotants : "+consonants);
        System.out.println("Digits : "+digits);
        System.out.println("Special Charcter : "+special);
    }
    
}
