package michael.exam.apcsa16;

public class RandomLetterChooser extends RandomStringChooser{

    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }
    
    private static String[] getSingleLetters(String str) {
        String[] ch = new String[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.substring(i, i+1);
        }   
        
        return ch;
    }
}
