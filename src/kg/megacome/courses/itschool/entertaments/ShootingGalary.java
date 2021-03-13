package kg.megacome.courses.itschool.entertaments;

import kg.megacome.courses.itschool.enums.Enums;

import java.time.LocalTime;

public class ShootingGalary extends EntertamentCenter {
    private Enums shootingGalT;

    public Enums getShootingGalT() {
        return shootingGalT;
    }

    public void setShootingGalT(Enums shootingGalT) {
        this.shootingGalT = shootingGalT;
    }

    public ShootingGalary(int age, String clientName, String nameOfEntertament, int serialNumber, int idOfAttraction,
                          int maxAllowed, boolean ageLimitation, LocalTime time, int cost, Enums shootingGalT) {
        super(age, clientName, nameOfEntertament, serialNumber, idOfAttraction, maxAllowed, ageLimitation, time, cost);
        this.shootingGalT = shootingGalT;
    }

    @Override
        public int costGenerator(){
            int a = 100;
            int b = 30;
            int c= (getAge() * a) + (getTime().getHour() * b);
            return c;
        }
        @Override
        public int serialNumberGenerator(){

            int a = 500;
            int b = 700;
            int c = 1000;
            int d =((getAge() * a) + (getTime().getHour() * b) + (getTime().getMinute() * c) * b);
            return d;
        }
    }

