package arabicToRoman;

import java.util.List;

public class ArabicToRoman {
    public String convert(int arabicNumber){

        String romanNumber = "";
        String[] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] arabic = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int i = roman.length-1;

        while(arabicNumber>0 && arabicNumber <= 4999){
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
