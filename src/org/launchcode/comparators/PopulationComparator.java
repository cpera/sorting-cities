package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        //return compare((int)o1.getPopulation(), (int)o2.getPopulation());
        return o2.getPopulation() - o1.getPopulation();

        /*
        if (o1.getPopulation() > o2.getPopulation()) {
            return o1.getPopulation();
        }
        else
        {
            return o2.getPopulation();
        }*/
    }
}
