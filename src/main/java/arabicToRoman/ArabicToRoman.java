package arabicToRoman;

public class ArabicToRoman {
    public String convert(int arabicNumber){
        if(arabicNumber == 1) {
            return "I";
        }
        if(arabicNumber == 2){
            return "II";
        }
        if(arabicNumber == 3){
            return "III";
        }
        return null;
    }
}
