package fr.uga.iut2.genconf.controleur;

import java.util.HashMap;
import java.util.Map;


/**
 * L'enum Commande répertorie les actions que l'utilisa·teur/trice peut
 * entreprendre via l'IHM.
 *
 */
public enum Commande {

    QUITTER(0, "Quitter"),
    CREER_UTILISATEUR(1, "Créer un nouvel utilisateur"),
    CREER_CONFERENCE(2,"Créer une nouvelle conférence"),
    ;

    private final int code;
    private final String description;

    private static final Map<Integer, Commande> valueByCode = new HashMap<>();

    static {
        // On initialise une fois pour la durée de vie de l'application le
        // cache de la fonction `valueOfCode`
        for (Commande cmd: Commande.values()) {
            Commande.valueByCode.put(cmd.code, cmd);
        }
    }

    /**
     * Renvoie la variante de la classe enum dont le code est donné en
     * paramètre.
     *
     * @param code Le code de la variante à retourner.
     *
     * @return La variante de la classe enum dont le code est celui spécifié.
     */
    public static final Commande valueOfCode(int code) {
        Commande result = Commande.valueByCode.get(code);
        if (result == null) {
            throw new IllegalArgumentException("Invalid code");
        }
        return result;
    }

    private Commande(int code, String description) {
        assert code >= 0;
        this.code = code;
        this.description = description;
    }

    /**
     * Renvoie le synopsis mis en forme de la commande.
     *
     * @return Une chaîne de caractères sans retour à la ligne contenant le
     *     synopsis de la commande.
     */
    public String synopsis() {
        return this.code + " — " + this.description;
    };
}
