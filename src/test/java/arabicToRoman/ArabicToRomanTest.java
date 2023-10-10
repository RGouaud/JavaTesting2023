package arabicToRoman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArabicToRomanTest {
    ArabicToRoman convertisseur;
    @BeforeEach
    void start(){convertisseur = new ArabicToRoman();}
    @Test
    void return_null(){
        //When
        String romanNumber = convertisseur.convert(0);
        //Then
        assertThat(romanNumber).isEqualTo(null);
    }

    @Test
    void conversion_1(){
        //When
        String romanNumber = convertisseur.convert(1);
        //Then
        assertThat(romanNumber).isEqualTo("I");
    }

    @Test
    void conversion_2() {
        //When
        String romanNumber = convertisseur.convert(2);
        //Then
        assertThat(romanNumber).isEqualTo("II");
    }
    @Test
    void conversion_3() {
        //When
        String romanNumber = convertisseur.convert(3);
        //Then
        assertThat(romanNumber).isEqualTo("III");
    }

    @Test
    void conversion_10(){
        //When
        String romanNumber = convertisseur.convert(10);
        //Then
        assertThat(romanNumber).isEqualTo("X");
    }

    @Test
    void conversion_20() {
        //When
        String romanNumber = convertisseur.convert(20);
        //Then
        assertThat(romanNumber).isEqualTo("XX");
    }
    @Test
    void conversion_30() {
        //When
        String romanNumber = convertisseur.convert(30);
        //Then
        assertThat(romanNumber).isEqualTo("XXX");
    }

    @Test
    void conversion_11(){
        //When
        String romanNumber = convertisseur.convert(11);
        //Then
        assertThat(romanNumber).isEqualTo("XI");
    }

    @Test
    void conversion_12(){
        //When
        String romanNumber = convertisseur.convert(12);
        //Then
        assertThat(romanNumber).isEqualTo("XII");
    }

    @Test
    void conversion_13(){
        //When
        String romanNumber = convertisseur.convert(13);
        //Then
        assertThat(romanNumber).isEqualTo("XIII");
    }
}