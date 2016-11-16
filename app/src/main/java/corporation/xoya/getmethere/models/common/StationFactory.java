package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class StationFactory implements IFactory<Station> {

    static public ArrayList<Station> listOfElements;
    public StationConfigurator stationConfigurator;


    /**
     * stationconfigurator en phase de prototypage, le but : pouvoir instancier des stations et les configurer de cette facon
     * Station station = StationFactory.with().coordonnees(some coordinates).lignespassantes(some arraylist).make()
     */
    public class StationConfigurator {

        Station station;

        public Station make(){
            return station;
        }

        public StationConfigurator coordonnees(Coordonnees pcoordonnees) {
            station.coordonnees = pcoordonnees;
            return stationConfigurator;
        }


    }

    @Override
    public Station make(int configuration) {

        Station element = null;

        switch (configuration) {
            case EMPTY:
                element = new Station();
                break;
        }
        if (element != null) listOfElements.add(element);
        return element;
    }

    public StationConfigurator with() {
        // faire de station configurator un singleton au sein de la classe
        return stationConfigurator;

    }
}
