package corporation.xoya.getmethere.models.common;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class Arret {
    /**
     *  la station
     */
    public Station station;

    /**
     *  l'Arret suivant dans le trajet
     */
    public Arret arretSuivant;

    /**
     *  l'Arret precedent dans le trajet
     */
    public Arret arretPrecedent;

    /**
     *  le tronçon entre cet arret et le suivant
     */
    public Troncon troncon;

}
