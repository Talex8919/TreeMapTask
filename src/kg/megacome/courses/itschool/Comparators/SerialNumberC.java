package kg.megacome.courses.itschool.Comparators;

import kg.megacome.courses.itschool.entertaments.AquaE;

import java.util.Comparator;

public class SerialNumberC implements Comparator<AquaE> {

    @Override
    public int compare(AquaE o1, AquaE o2) {
        return o1.getSerialNumber()- o2.getSerialNumber();
    }
}
