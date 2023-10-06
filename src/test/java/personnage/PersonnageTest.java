package personnage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    @Test
    void orientation_simple_est(){
        //GIVEN
        Personnage perso = new Personnage();
        int fois = 0;
        String attendu = "Est";

        //WHEN
        String resultat = perso.orientation(fois);
        //THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @Test
    void orientation_simple_Sud(){
        //GIVEN
        Personnage perso = new Personnage();
        int fois = 1;
        String attendu = "Sud";

        //WHEN
        String resultat = perso.orientation(fois);
        //THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @Test
    void orientation_simple_Ouest(){
        //GIVEN
        Personnage perso = new Personnage();
        int fois = 2;
        String attendu = "Ouest";

        //WHEN
        String resultat = perso.orientation(fois);
        //THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @Test
    void orientation_simple_Nord(){
        //GIVEN
        Personnage perso = new Personnage();
        int fois = 3;
        String attendu = "Nord";

        //WHEN
        String resultat = perso.orientation(fois);
        //THEN
        assertThat(resultat).isEqualTo(attendu);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 'Est'",
            "5, 'Sud'",
            "6, 'Ouest'",
            "7, 'Nord'",
            "8, 'Est'",
            "9, 'Sud'",
            "10, 'Ouest'",
            "11, 'Nord"
    })
    @Test
    void orientation_Nord(int fois, String attendu){
        // GIVEN
        Personnage perso = new Personnage();
        // WHEN
        String resultat = perso.orientation(fois);

        assertThat(resultat).isEqualTo(attendu);
    }
}