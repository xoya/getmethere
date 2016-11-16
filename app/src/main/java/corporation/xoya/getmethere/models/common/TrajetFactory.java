package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class TrajetFactory implements IFactory<Trajet> {

    static public ArrayList<Trajet> listOfElements;


    @Override
    public Trajet make(int configuration) {

        Trajet element = null;

        switch (configuration) {
            case EMPTY:
                element = new Trajet();
                break;
        }
        if (element != null) listOfElements.add(element);
        return element;
    }
}
