package arabicToRoman;

public class ArabicToRoman {
    public String convert(int arabicNumber){

        String romanNumber = "";

        while(arabicNumber <=3 && arabicNumber >0){
            arabicNumber -= 1;
            romanNumber += "I";
        }
        if(romanNumber.isEmpty()){
            return null;
        }
        return romanNumber;
    }
}
