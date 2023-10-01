package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.InstanceOfAssertFactories.throwable;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
class CalcultatorTest {
    private Calcultator calculator = new Calcultator();

    // ADD
    @Test
    void should_it_add_2_positivs(){
        //GIVEN
        int opG = 2;
        int opD = 3;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(5, resultat);
    }

    @Test
    void should_it_add_1_positiv_and_one_negative(){
        //GIVEN
        int opG = 2;
        int opD = -3;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(-1, resultat);
    }
    @Test
    void should_it_add_2_negativs_number(){
        //GIVEN
        int opG = -2;
        int opD = -3;
        //WHEN
        int resultat = calculator.add(opG,opD);
        //THEN
        assertEquals(-5, resultat);
    }

    @Test
    void should_it_add_1_positiv_and_a_null(){
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
    void should_it_divide_2_positivs(){
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

        // Vous pouvez maintenant vérifier la exceptionCapturée
        assertNotNull(exceptionCapturee);
        assertEquals("/ by zero", exceptionCapturee.getMessage());
        //THEN
    }
}