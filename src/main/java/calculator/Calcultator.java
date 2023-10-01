package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calcultator {

    public int add(int opG, int opD){
        return opG + opD;
    }

    public int divide(int opG, int opD){
        return opG / opD;
    }

    public Set<Integer> ensembleChiffre(int pNombre){
        // Initialisation des variables
        Set<Integer> list = new HashSet<>();
        String chaineNombre = String.valueOf(pNombre); // Conversion de pNombre(int) en chaineNombre(String) pour le traitement futur

        // Pour chaque element de chaineNombre
        for(int i = 0; i < chaineNombre.length(); i++){
            // On retransforme le i ème caractère de la chaine en entier
            try {
                int currentInt = Integer.parseInt(String.valueOf(chaineNombre.charAt(i)));
                // Si il n'est pas dans la liste
                if(!(list.contains(currentInt))){
                    // on l'ajoute
                    list.add(currentInt);
                }
            }
            catch(NumberFormatException ignored){}
        }
        return list;
    }
}
