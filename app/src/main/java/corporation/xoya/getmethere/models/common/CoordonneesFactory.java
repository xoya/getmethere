package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class CoordonneesFactory implements IFactory<Coordonnees> {

    static public ArrayList<Coordonnees> listOfElements;


    @Override
    public Coordonnees make(int configuration) {

        Coordonnees element = null;

        switch (configuration) {
            case EMPTY:
                element = new Coordonnees();
                break;
        }
        if (element != null) listOfElements.add(element);
        return element;
    }
}
