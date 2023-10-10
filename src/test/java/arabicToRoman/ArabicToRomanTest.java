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
    void conversion_1(){
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(1);
        //Then
        assertThat(romanNumber).isEqualTo("I");
    }

    @Test
    void conversion_2() {
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(2);
        //Then
        assertThat(romanNumber).isEqualTo("II");
    }
    @Test
    void conversion_3() {
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(3);
        //Then
        assertThat(romanNumber).isEqualTo("III");
    }

    @Test
    void conversion_10(){
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(10);
        //Then
        assertThat(romanNumber).isEqualTo("X");
    }

    @Test
    void conversion_20() {
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(20);
        //Then
        assertThat(romanNumber).isEqualTo("XX");
    }
    @Test
    void conversion_30() {
        //Given
        ArabicToRoman convertisseur = new ArabicToRoman();
        //When
        String romanNumber = convertisseur.convert(30);
        //Then
        assertThat(romanNumber).isEqualTo("XXX");
    }
}