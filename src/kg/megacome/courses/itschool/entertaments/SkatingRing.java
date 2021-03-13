package kg.megacome.courses.itschool.entertaments;

import kg.megacome.courses.itschool.enums.Enums;

import java.time.LocalTime;

public class SkatingRing extends EntertamentCenter{

    private Enums skatingRCat;

    public Enums getSkatingRCat() {
        return skatingRCat;
    }

    public void setSkatingRCat(Enums skatingRCat) {
        this.skatingRCat = skatingRCat;
    }

    public SkatingRing(int age, String clientName, String nameOfEntertament, int serialNumber, int idOfAttraction,
                       int maxAllowed, boolean ageLimitation, LocalTime time, int cost, Enums skatingRCat) {
        super(age, clientName, nameOfEntertament, serialNumber, idOfAttraction, maxAllowed, ageLimitation, time, cost);
        this.skatingRCat = skatingRCat;
    }
    @Override
    public int costGenerator() {
        int a = 100;
        int b = 30;
        int c= (getAge() * a) + (getTime().getHour() * b);
        return c;
    }
    @Override
    public int serialNumberGenerator() {

        int a = 500;
        int b = 700;
        int c = 1000;
        int d =((getAge() * a) + (getTime().getHour() * b) + (getTime().getMinute() * c) * b);
        return d;
    }
}
