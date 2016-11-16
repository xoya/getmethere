package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class LigneFactory implements IFactory<Ligne> {

    static public ArrayList<Ligne> listOfElements;


    @Override
    public Ligne make(int configuration) {

        Ligne element = null;

        switch (configuration) {
            case EMPTY:
                element = new Ligne();
                break;
        }
        if (element != null) listOfElements.add(element);
        return element;
    }
}
