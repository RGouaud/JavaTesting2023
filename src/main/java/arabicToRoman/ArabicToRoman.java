package arabicToRoman;

public class ArabicToRoman {
    public String convert(int arabicNumber){

        String romanNumber = "";

        while(arabicNumber <=30 && arabicNumber>=10){
            arabicNumber -= 10;
            romanNumber += "X";
        }
        if(arabicNumber==5){
            arabicNumber -= 5;
            romanNumber += "V";
        }
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
