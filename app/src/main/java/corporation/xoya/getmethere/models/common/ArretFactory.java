package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class ArretFactory implements IFactory<Arret> {


    static public ArrayList<Arret> listOfElements;


    @Override
    public Arret make(int configuration) {

        Arret arret = null;

        switch (configuration) {
            case EMPTY:
                arret = new Arret();
                break;
        }
        if (arret != null) listOfElements.add(arret);
        return arret;
    }
}
