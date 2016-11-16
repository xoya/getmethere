package corporation.xoya.getmethere.models.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xhabloo on 09-Nov-16.
 */

public interface IFactory<K> {

    public K make();

    public K random();

    public List<K> makeList(int number);

    public List<K> randomList(int number);

    public IConfigurator<K> with();

}
