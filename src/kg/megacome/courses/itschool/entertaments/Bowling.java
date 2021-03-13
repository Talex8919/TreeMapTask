package kg.megacome.courses.itschool.entertaments;

import kg.megacome.courses.itschool.enums.Enums;

import java.time.LocalTime;

public class Bowling extends EntertamentCenter {
    private Enums bowlingCatT;




    public Enums getBowlingCatT() {
        return bowlingCatT;
    }

    public void setBowlingCatT(Enums bowlingCatT) {
        this.bowlingCatT = bowlingCatT;
    }

    public Bowling(int age, String clientName, String nameOfEntertament,
                   int serialNumber, int idOfAttraction, int maxAllowed, boolean ageLimitation, LocalTime time, int cost, Enums bowlingCatT) {
        super(age, clientName, nameOfEntertament, serialNumber, idOfAttraction, maxAllowed, ageLimitation, time, cost);
        this.bowlingCatT = bowlingCatT;
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


