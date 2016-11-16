package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class Station {

    /**
     *  localisation sur carte
     */
    public Coordonnees coordonnees;

    /**
     *  liste des lignes passantes par cette station.
     */
    public List<Ligne> lignesPassantes;

}
