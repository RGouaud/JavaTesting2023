package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CalcultatorTest {

    private final Calcultator calculator = new Calcultator();

    // ADD
    @Test
    void should_it_add_2_positives(){
        //GIVEN
        int opG = 2;
        int opD = 3;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(5, resultat);
    }

    @Test
    void should_it_add_1_positive_and_one_negative(){
        //GIVEN
        int opG = 2;
        int opD = -3;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(-1, resultat);
    }
    @Test
    void should_it_add_2_negatives_number(){
        //GIVEN
        int opG = -2;
        int opD = -3;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(-5, resultat);
    }

    @Test
    void should_it_add_1_positive_and_a_null(){
        //GIVEN
        int opG = 2;
        int opD = 0;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(2, resultat);
    }

    @Test
    void should_it_add_2_null(){
        //GIVEN
        int opG = 0;
        int opD = 0;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(0, resultat);
    }

    @Test
    void should_it_add_1_negative_and_a_null(){
        //GIVEN
        int opG = -2;
        int opD = 0;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(-2, resultat);
    }


    //DIVIDE
    @Test
    void should_it_divide_2_positives(){
        //GIVEN
        int opG = 6;
        int opD = 2;
        //WHEN
        int resultat = calculator.divide(opG,opD);
        //THEN
        assertEquals(3, resultat);
    }

    @Test
    void should_it_divide_1pos_1neg(){

        //GIVEN
        int opG = -6;
        int opD = 3;
        //WHEN
        int resultat = calculator.divide(opG,opD);
        //THEN
        assertEquals(-2, resultat);
    }

    @Test
    void should_it_divide_2_negatives(){

        //GIVEN
        int opG = -6;
        int opD = -3;
        //WHEN
        int resultat = calculator.divide(opG,opD);
        //THEN
        assertEquals(2, resultat);
    }

    @Test
    void could_the_result_not_be_int(){

        //GIVEN
        int opG = 2;
        int opD = 3;
        //WHEN
        int resultat = calculator.divide(opG,opD);
        //THEN
        assertEquals(2/3, resultat);
    }

    @Test
    void could_it_divide_by_0() {

        //GIVEN
        int opG = 2;
        int opD = 0;
        //WHEN
        Throwable exceptionCapturee = assertThrows(Throwable.class, () -> {
            calculator.divide(opG, opD);
        });

        assertNotNull(exceptionCapturee);
        assertEquals("/ by zero", exceptionCapturee.getMessage());
        //THEN
    }


    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",   // 1 + 2 = 3
            "5, 3, 8",   // 5 + 3 = 8
            "0, 0, 0",   // 0 + 0 = 0
            "-1, -1, -2" // -1 + (-1) = -2
    })
    void test_function_add(int a, int b, int resultatAttendu) {
        int somme = calculator.add(a, b);
        assertEquals(resultatAttendu, somme);
    }

    @ParameterizedTest
    @CsvSource({
            "-6, -3, 2", // -6 / -3 = 2
            "-6, 3, -2", // -6 / 3 = -2
            "6, 3, 2"    // 6 / 3 = 2
    })
    void test_function_divide(int a, int b, int resultatAttendu) {
        int division = calculator.divide(a, b);
        assertEquals(resultatAttendu, division);
    }


    @ParameterizedTest
    @CsvSource({
            "123456789, '1,2,3,4,5,6,7,8,9'",
            "112233, '1,2,3'", // doublons
            "-667, '6,7'", // négatif
            "76354, '7,6,3,5,4'" // ordre random
    })
    void test_function_ensembleChiffre(int given, String attendu) {
        Set<Integer> resultat = calculator.ensembleChiffre(given);
        String[] attenduArray = attendu.split(",");
        Set<Integer> attenduSet = new HashSet<>();
        for (String str : attenduArray) {
            attenduSet.add(Integer.parseInt(str.trim()));
        }
        assertEquals(attenduSet, resultat);
    }
}