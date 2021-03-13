package kg.megacome.courses.itschool.Comparators;

import kg.megacome.courses.itschool.entertaments.ShootingGalary;

import java.util.Comparator;

public class ShootingTimeGcomp implements Comparator<ShootingGalary> {

    @Override
    public int compare(ShootingGalary o1, ShootingGalary o2) {
        return o1.getTime().compareTo(o2.getTime());
    }
}
