package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class ArretFactory implements IFactory<Arret> {

    static public List<Arret> elements;
    static public ArretFactory instance;

    public static ArretFactory plz() {
        if (instance == null) instance = new ArretFactory();
        return instance;
    }

    public ArretFactory() {
        elements = new ArrayList<Arret>();
    }

    @Override
    public Arret random() {
        Arret arret = make();
        arret.station = StationFactory.plz().random();
        arret.arretSuivant = null;
        arret.arretPrecedent = null;
        arret.troncon = null;
        // // TODO: 16-Nov-16 ramdom pour troncon
        return arret;
    }

    @Override
    public Arret make() {
        Arret arret = new Arret();
        elements.add(arret);
        return arret;
    }

    @Override
    public List<Arret> makeList(int number) {
        List<Arret> list = new ArrayList<Arret>();
        if (number > 0)
            for (int i = 0; i < number; i++) {
                list.add(make());
            }
        return list;
    }

    @Override
    public List<Arret> randomList(int number) {
        List<Arret> list = new ArrayList<Arret>();
        if (number > 0)
            for (int i = 0; i < number; i++) {
                list.add(random());
            }
        return list;
    }

    @Override
    public ArretFactory.ArretConfigurator with() {
        return new ArretFactory.ArretConfigurator(make());

    }

    private class ArretConfigurator implements IConfigurator<Arret> {

        private Arret arret;

        public Arret make() {
            return arret;
        }

        public ArretConfigurator(Arret parret) {
            this.arret = parret;
        }

        public ArretFactory.ArretConfigurator arretPrecedent(Arret parret) {
            arret.arretPrecedent = parret;
            return this;
        }

        public ArretFactory.ArretConfigurator arretSuivant(Arret parret) {
            arret.arretSuivant = parret;
            return this;
        }

        public ArretFactory.ArretConfigurator station(Station pstation) {
            arret.station = pstation;
            return this;
        }

        public ArretFactory.ArretConfigurator troncon(Troncon ptroncon) {
            arret.troncon = ptroncon;
            return this;
        }


    }
}
