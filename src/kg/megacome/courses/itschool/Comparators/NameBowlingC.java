package kg.megacome.courses.itschool.Comparators;

import kg.megacome.courses.itschool.entertaments.Bowling;

import java.util.Comparator;

public class NameBowlingC implements Comparator<Bowling> {


    @Override
    public int compare(Bowling o1, Bowling o2) {
        return o1.getClientName().compareTo(o2.getClientName());
    }
}
