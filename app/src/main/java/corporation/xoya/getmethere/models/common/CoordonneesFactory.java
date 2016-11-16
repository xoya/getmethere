package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import corporation.xoya.getmethere.Utils.BasicRandom;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public class CoordonneesFactory implements IFactory<Coordonnees> {

    static public List<Coordonnees> elements;
    static public CoordonneesFactory instance;

    private int min = -10000;
    private int max = 10000;


    public static CoordonneesFactory plz() {
        if (instance == null) instance = new CoordonneesFactory();
        return instance;
    }

    public CoordonneesFactory() {
        elements = new ArrayList<Coordonnees>();
    }


    @Override
    public Coordonnees random() {
        double value;
        Coordonnees coordonnees = make();
        // setting latitude
        coordonnees.latitude = BasicRandom.nextInt(min, max) / 100.0;
        coordonnees.longitude = BasicRandom.nextInt(min, max) / 100.0;
        return coordonnees;
    }

    @Override
    public Coordonnees make() {
        Coordonnees coordonnees = new Coordonnees();
        elements.add(coordonnees);
        return coordonnees;
    }

    @Override
    public List<Coordonnees> makeList(int number) {
        List<Coordonnees> list = new ArrayList<Coordonnees>();
        if (number > 0)
            for (int i = 0; i < number; i++) {
                list.add(make());
            }
        return list;
    }

    @Override
    public List<Coordonnees> randomList(int number) {
        List<Coordonnees> list = new ArrayList<Coordonnees>();
        if (number > 0)
            for (int i = 0; i < number; i++) {
                list.add(random());
            }
        return list;
    }

    @Override
    public CoordonneesConfigurator with() {
        return new CoordonneesConfigurator(make());

    }


    private class CoordonneesConfigurator implements IConfigurator<Coordonnees> {

        private Coordonnees coordonnees;

        public Coordonnees make() {
            return coordonnees;
        }

        public CoordonneesConfigurator(Coordonnees pcoordonnees) {
            this.coordonnees = pcoordonnees;
        }

        public CoordonneesConfigurator latitude(double platitude) {
            coordonnees.latitude = platitude;
            return this;
        }

        public CoordonneesConfigurator longitude(double plongitude) {
            coordonnees.longitude = plongitude;
            return this;
        }


    }
}
