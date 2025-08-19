package github_test1;

public class ReverseString {
    public static void main(String[] args) {

        String originalString = "Whatever";
        String reversedString = "";

        for( int i = originalString.length()-1; i >= 0 ; i--){
            reversedString += originalString.charAt(i);
        }


        String whatver =  "Hello";
        System.out.println(reversedString);

    }
}
