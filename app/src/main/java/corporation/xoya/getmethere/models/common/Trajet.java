package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class Trajet {
    /**
     * liste des points d'arrets dans le 1er sens. Ces coordonnées sont utilisées pour traitement et calcul
     */
    public ArrayList<Arret> semiTrajetA;

    /**
     * liste des points d'arrets dans le deuxieme sens. Ces coordonnées sont utilisées pour traitement et calcul
     */
    public ArrayList<Arret> semiTrajetB;


}
