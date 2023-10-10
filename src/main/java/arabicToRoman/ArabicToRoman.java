package arabicToRoman;

import java.util.List;

public class ArabicToRoman {
    public String convert(int arabicNumber){

        String romanNumber = "";
        String[] roman = {"I","IV","V","IX","X"};
        int[] arabic = {1,4,5,9,10};
        int i = roman.length-1;

        while(arabicNumber>0 && arabicNumber <= 38){
            if(arabicNumber >= arabic[i]){
                romanNumber += roman[i];
                arabicNumber -= arabic[i];
            }
            else{
                i--;
            }
        }
        if(romanNumber.isEmpty()){
            return null;
        }
        return romanNumber;
    }
}
