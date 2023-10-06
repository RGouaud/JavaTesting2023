package personnage;

public class Personnage {
    public String orientation(int fois){
        return switch (fois%4) {
            case 0 -> "Est";
            case 1 -> "Sud";
            case 2 -> "Ouest";
            case 3 -> "Nord";
            default -> "Inconnu";
        };
    }

}
