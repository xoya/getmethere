package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public interface IFactory<K> {


    final static public int EMPTY = 0;
    public K make(int configuration);




}
