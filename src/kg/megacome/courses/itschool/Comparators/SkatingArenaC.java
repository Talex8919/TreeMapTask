package kg.megacome.courses.itschool.Comparators;

import kg.megacome.courses.itschool.entertaments.SkatingRing;

import java.util.Comparator;

public class SkatingArenaC implements Comparator<SkatingRing> {


    @Override
    public int compare(SkatingRing o1, SkatingRing o2) {
        return Boolean.compare(o1.isAgeLimit(),o2.isAgeLimit());
    }
}
