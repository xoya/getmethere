package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class StationFactory implements IFactory<Station> {

    static public List<Station> elements;
    static public StationFactory instance;

    public static StationFactory plz() {
        if (instance == null) instance = new StationFactory();
        return instance;
    }

    public StationFactory() {
        elements = new ArrayList<Station>();
    }

    @Override
    public Station random() {
        Station station = make();
        station.coordonnees = CoordonneesFactory.plz().random();
        station.lignesPassantes = new ArrayList<Ligne>();
        //// TODO: 16-Nov-16  implementer random pour lignePassantes
        return station;
    }

    @Override
    public Station make() {
        Station station = new Station();
        elements.add(station);
        return station;
    }

    @Override
    public List<Station> makeList(int number) {
        List<Station> list = new ArrayList<Station>();
        if (number > 0)
            for (int i = 0; i < number; i++) {
                list.add(make());
            }
        return list;
    }

    @Override
    public List<Station> randomList(int number) {
        List<Station> list = new ArrayList<Station>();
        if (number > 0)
            for (int i = 0; i < number; i++) {
                list.add(random());
            }
        return list;
    }

    @Override
    public StationConfigurator with() {
        return new StationConfigurator(make());

    }

    /**
     * stationconfigurator en phase de prototypage, le but : pouvoir instancier des stations et les configurer de cette facon
     * Station station = StationFactory.with().coordonnees(some coordinates).lignespassantes(some arraylist).make()
     */
    private class StationConfigurator implements IConfigurator<Station> {

        private Station station;

        public Station make() {
            return station;
        }

        public StationConfigurator(Station pstation) {
            this.station = pstation;
        }

        public StationConfigurator coordonnees(Coordonnees pcoordonnees) {
            station.coordonnees = pcoordonnees;
            return this;
        }

        public StationConfigurator lignesPassantes(List<Ligne> plignesPassantes) {
            station.lignesPassantes = plignesPassantes;
            return this;
        }


    }
}
