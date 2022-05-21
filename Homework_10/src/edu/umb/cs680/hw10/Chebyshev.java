package edu.umb.cs680.hw10;

import java.util.List;

public class Chebyshev implements DistanceMetric {

    public double distance(List<Double> p1, List<Double> p2) {
        double maxOfCoordinates = 0;
        for (int i = 0; i < p1.size(); i++) {
            double tempMaxOfCoordinates = Math.abs(p1.get(i) - p2.get(i));
            if(tempMaxOfCoordinates > maxOfCoordinates) {
                maxOfCoordinates = tempMaxOfCoordinates;
            }
        }
        return maxOfCoordinates;
    }

}
