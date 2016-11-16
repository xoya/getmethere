package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class Trajet {
    /**
     * liste des points d'arrets dans le sens de l'aller. Ces coordonnées sont utilisées pour traitement et calcul
     */
    public ArrayList<Arret> aller;

    /**
     * liste des points d'arrets dans le sens du retour. Ces coordonnées sont utilisées pour traitement et calcul
     */
    public ArrayList<Arret> retour;

    /**
     * liste des coordonnées complètes formant le trajet dans le sens aller. Ces coordonnées sont utilisées pour affichage réel sur la carte
     */
    public ArrayList<Coordonnees> allerReel;

    /**
     * liste des coordonnées complètes formant le trajet dans le sens retour. Ces coordonnées sont utilisées pour affichage réel sur la carte
     */
    public ArrayList<Coordonnees> retourReel;

}
