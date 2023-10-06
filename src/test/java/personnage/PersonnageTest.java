package personnage;

import org.junit.jupiter.api.Test;

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
}