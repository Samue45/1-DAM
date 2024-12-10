package Programming.Unit2.String;

public class Exercise7 {

    static String word (String word){
        String lower = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            // Convert to lowercase if it's an uppercase letter
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); // Convert to lowercase by adding 32

            }
            lower += c;
        }

        return lower;
    }
}
