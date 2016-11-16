package corporation.xoya.getmethere.Utils;

import java.util.Random;

/**
 * Created by xhabloo on 16-Nov-16.
 */

public class BasicRandom {

    static Random rand;


    static public int nextInt (int pmin, int pmax){

        if ( rand == null ) rand = new Random(System.currentTimeMillis());

        int randomNum = rand.nextInt((pmax - pmin) + 1) + pmin;

        return randomNum;
    }


}
