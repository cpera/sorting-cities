package org.launchcode.comparators;

import org.launchcode.City;
import java.util.Comparator;


/**
 * Created by cpera on 6/15/2017.
 */
public class AreaComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        //return compare((int)o1.getPopulation(), (int)o2.getPopulation());
        double areaDiff = o2.getArea() - o1.getArea();

        if (areaDiff < 0)
            return -1;
        else if (areaDiff > 0)
            return 1;
        else
            return 0;
    }
}
