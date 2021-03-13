package kg.megacome.courses.itschool.entertaments;

import kg.megacome.courses.itschool.enums.Enums;

import java.time.LocalTime;

public class AquaE extends EntertamentCenter {
    private Enums aquaTcat;

    public AquaE(int age, String clientName, String nameOfEntertament, int serialNumber, int idOfAttraction,
                 int maxAllowed, boolean ageLimitation, LocalTime time, int cost, Enums aquaTcat) {
        super(age, clientName, nameOfEntertament, serialNumber, idOfAttraction, maxAllowed, ageLimitation, time, cost);
        this.aquaTcat = aquaTcat;
    }



    public Enums getAquaTcat() {
        return aquaTcat;
    }

    public void setAquaTcat(Enums aquaTcat) {
        this.aquaTcat = aquaTcat;

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
