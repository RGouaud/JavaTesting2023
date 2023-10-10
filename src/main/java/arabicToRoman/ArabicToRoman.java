package arabicToRoman;

public class ArabicToRoman {
    public String convert(int arabicNumber){
        if(arabicNumber == 1) {
            return "I";
        }
        if(arabicNumber == 2){
            return "II";
        }
        return null;
    }
}
