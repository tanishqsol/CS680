package edu.umb.cs680.hw12;

import java.util.Comparator;

public class TimeStampComparator implements Comparator<ApfsElement> {

    @Override
    public int compare(ApfsElement o1, ApfsElement o2) {
        return o2.creationTime.compareTo(o1.creationTime);
    }
}
