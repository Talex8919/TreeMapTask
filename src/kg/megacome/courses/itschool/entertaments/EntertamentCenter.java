package kg.megacome.courses.itschool.entertaments;

import kg.megacome.courses.itschool.interfaces.CostInterface;
import kg.megacome.courses.itschool.interfaces.SerialNumberInterface;

import java.time.LocalTime;

public abstract class EntertamentCenter implements CostInterface, SerialNumberInterface {
    private int age;
    private String clientName;
    private String entertName;
    private int serialNumber;
    private int attractId;
    private int maxAllowed;
    private boolean ageLimit;
    private LocalTime time;
    private int cost;


    public EntertamentCenter(int age, String clientName, String nameOfEntertament, int serialNumber, int idOfAttraction,
                             int maxAllowed, boolean ageLimitation, LocalTime time, int cost) {
        this.age = age;
        this.clientName = clientName;
        this.entertName = nameOfEntertament;
        this.serialNumber = serialNumber;
        this.attractId = idOfAttraction;
        this.maxAllowed = maxAllowed;
        this.ageLimit = ageLimitation;
        this.time = time;
        this.cost = cost;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEntertName() {
        return entertName;
    }

    public void setEntertName(String entertName) {
        this.entertName = entertName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getAttractId() {
        return attractId;
    }

    public void setAttractId(int attractId) {
        this.attractId = attractId;
    }

    public int getMaxAllowed() {
        return maxAllowed;
    }

    public void setMaxAllowed(int maxAllowed) {
        this.maxAllowed = maxAllowed;
    }

    public boolean isAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(boolean ageLimit) {
        this.ageLimit = ageLimit;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "EntertamentCenter{" +
                "age=" + age +
                ", clientName='" + clientName + '\'' +
                ", nameOfEntertament='" + entertName + '\'' +
                ", serialNumber=" + serialNumber +
                ", idOfAttraction=" + attractId +
                ", maxAllowed=" + maxAllowed +
                ", ageLimitation=" + ageLimit +
                ", time=" + time +
                ", cost=" + cost +
                '}';
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

