package edu.umb.cs680.hw11;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (int)o1.getPrice() - (int)o2.getPrice();
    }
}
