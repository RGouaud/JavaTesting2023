package arabicToRoman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArabicToRomanTest {
    @Test
    void return_null(){
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(0);
        //Then
        assertThat(romanNumber).isEqualTo(null);
    }

    @Test
    void convertion_1(){
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(1);
        //Then
        assertThat(romanNumber).isEqualTo("I");
    }
}