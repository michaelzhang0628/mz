package michael.learn;

/*
 * In the following code the text is analyzed character 
 * by character to determine the vowels, spaces and letters used. 
 * Fill in the code that computes the number of spaces, vowels, and
 * consonants. 
 */
public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        int spaces = 0, vowels = 0, letters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces += 1;
            } else if (Character.isLetter(text.charAt(i))) {
                letters += 1;
                if (text.charAt(i) == 'a') {
                    vowels += 1;
                } else if (text.charAt(i) == 'e') {
                    vowels += 1;
                } else if (text.charAt(i) == 'i') {
                    vowels += 1;
                } else if (text.charAt(i) == 'o') {
                    vowels += 1;
                } else if (text.charAt(i) == 'u') {
                    vowels += 1;
                }
             }    
        }
        System.out.println("The text contained vowels: " + vowels + "\n" + 
        "consonants: " + (letters - vowels) + "\n" + "spaces: " + spaces);
                
    }
}
