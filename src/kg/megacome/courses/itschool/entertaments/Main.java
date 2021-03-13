package kg.megacome.courses.itschool.entertaments;

import kg.megacome.courses.itschool.Comparators.NameBowlingC;
import kg.megacome.courses.itschool.Comparators.SerialNumberC;
import kg.megacome.courses.itschool.Comparators.ShootingTimeGcomp;
import kg.megacome.courses.itschool.Comparators.SkatingArenaC;
import kg.megacome.courses.itschool.enums.Enums;
import sun.reflect.CallerSensitive;
import sun.reflect.generics.tree.Tree;


import java.time.LocalTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        LocalTime ellenCastilloT=LocalTime.of(21,50);
AquaE ellenCastillo=new AquaE(35,"Ellen Castillo",
        "Aqua Park", 26229939,30,70,true,ellenCastilloT,2500, Enums.ADULTS);

        LocalTime evelynCastilloT=LocalTime.of(15,45);
        AquaE evelynCastillo=new AquaE(14,"Evelyn Castillo",
                "Aqua Park", 24623296,25,70,false,evelynCastilloT,1500, Enums.CHILD);

        LocalTime saudeepAlvinT=LocalTime.of(19, 0);
        AquaE saudeepAlvin=new AquaE(24,"Saudeep Alvin",
                "Aqua Park", 98728446,22,70,true,saudeepAlvinT,2000, Enums.TEENAGER);

        LocalTime skippRussellT=LocalTime.of(13,40);
        AquaE skippRussell=new AquaE(18,"Skipp Russell",
                "Aqua Park", 64979476,25,70,false,skippRussellT,1800, Enums.TEENAGER);

        LocalTime sandeepRyanT=LocalTime.of(22,30);
        AquaE sandeepRyan=new AquaE(28,"Sandeep Ryan",
                "Aqua Park", 26229939,25,70,false,sandeepRyanT,2500, Enums.ADULTS);


        LocalTime alanoudCereliaT=LocalTime.of(17, 0);
        Bowling alanoudCerelia= new Bowling(31,"Alanoud Cerelia",
                "Bowling Court", 35436889,15,25,false,alanoudCereliaT,750, Enums.ADULTS);

        LocalTime anandCielT=LocalTime.of(15, 45);
        Bowling anandCiel=new Bowling(33,"Anand Ciel",
                "Bowling Court", 76324296,15,25,true,anandCielT,2000, Enums.ADULTS);

        LocalTime ashlandCoralynnT=LocalTime.of(18, 45);
        Bowling ashlandCoralynn=new Bowling(20,"Ashland Coralynn",
                "Bowling Court", 63778328,15,25,true,ashlandCoralynnT,2000, Enums.TEENAGER);

        LocalTime angharadCicelyT=LocalTime.of(14, 25);
        Bowling angharadCicely=new Bowling(32,"Angharad Cicely",
                "Bowling Court", 43825745,15,25,true,angharadCicelyT,2000, Enums.TEENAGER);

        LocalTime alanoodCassiettaT=LocalTime.of(17, 35);
        Bowling alanoodCassietta=new Bowling(19,"Alanood Cassietta",
                "Bowling Court", 76577733,15,25,true,alanoodCassiettaT,2000, Enums.TEENAGER);

LocalTime astridCienaT =LocalTime.of(16,15);
SkatingRing astridCiena= new SkatingRing(17,"Astrid Ciena","Skate Arena",
        26587747,1, 30,false, astridCienaT,200,Enums.TEENAGER);

LocalTime astredChelsiT =LocalTime.of(17,15);
        SkatingRing astredChelsi= new SkatingRing(17,"Astred Chelsi","Skate Arena",
                85468522,1, 30,true, astredChelsiT,250,Enums.ADULTS);
        LocalTime addieCharleaT =LocalTime.of(20,35);
        SkatingRing addieCharlea= new SkatingRing(29,"Addie Charlea","Skate Arena",
                87482467,1, 30,true, addieCharleaT,280,Enums.ADULTS);

        LocalTime aaminaBouxT =LocalTime.of(19,25);
        SkatingRing aaminaBoux= new SkatingRing(21,"Aamina Boux","Skate Arena",
                97427748,1, 30, true, aaminaBouxT,190,Enums.TEENAGER);

        LocalTime asaCorinaT =LocalTime.of(18,35);
        SkatingRing asaCorina= new SkatingRing(36,"Asa Corina","Skate Arena",
                77648764,1, 30,false, asaCorinaT,280,Enums.ADULTS);


        LocalTime jochebedCaraMaiT =LocalTime.of(19,25);
        ShootingGalary jochebedCaraMai= new ShootingGalary(36,"Jochebed Cara-Mai","Lucky Shot",
                85587584,35, 5,false, jochebedCaraMaiT,100,Enums.ADULTS);
        LocalTime maudChayceT =LocalTime.of(20,35);
        ShootingGalary maudChayce= new ShootingGalary(25,"Maud Chayce","Lucky Shot",
                83929785,35, 5,true, maudChayceT,120,Enums.TEENAGER);
        LocalTime gudridCaceyT =LocalTime.of(17, 35);
        ShootingGalary gudridCacey= new ShootingGalary(22,"Gudrid Cacey","Lucky Shot",
                83899266,35, 5,false, gudridCaceyT,120,Enums.TEENAGER);
        LocalTime sineadCondoleezzaT =LocalTime.of(18,35);
        ShootingGalary sineadCondoleezza= new ShootingGalary(34,"Sinead Condoleezza","Lucky Shot",
                62483474,35, 5,false, sineadCondoleezzaT,150,Enums.ADULTS);
        LocalTime anitaCaraRoseT =LocalTime.of(19,25);
        ShootingGalary anitaCaraRose= new ShootingGalary(25,"Anita Cara-Rose","Lucky Shot",
                77648764,35, 5,true, anitaCaraRoseT,100,Enums.TEENAGER);


        ArrayList<AquaE>aquaEArrayList= new ArrayList<>();
        aquaEArrayList.add(ellenCastillo);
        aquaEArrayList.add(evelynCastillo);
        aquaEArrayList.add(saudeepAlvin);
        aquaEArrayList.add(skippRussell);
        aquaEArrayList.add(sandeepRyan);

        ArrayList<Bowling>bowlingArrayList= new ArrayList<>();
        bowlingArrayList.add(alanoodCassietta);
        bowlingArrayList.add(anandCiel);
        bowlingArrayList.add(angharadCicely);
        bowlingArrayList.add(alanoudCerelia);
        bowlingArrayList.add(ashlandCoralynn);


        ArrayList<ShootingGalary>shootingGalaryArrayList= new ArrayList<>();
        shootingGalaryArrayList.add(jochebedCaraMai);
        shootingGalaryArrayList.add(maudChayce);
        shootingGalaryArrayList.add(gudridCacey);
        shootingGalaryArrayList.add(sineadCondoleezza);
        shootingGalaryArrayList.add(anitaCaraRose);


        ArrayList<SkatingRing>skatingRingArrayList= new ArrayList<>();
        skatingRingArrayList.add(aaminaBoux);
        skatingRingArrayList.add(addieCharlea);
        skatingRingArrayList.add(asaCorina);
        skatingRingArrayList.add(astridCiena);
        skatingRingArrayList.add(astredChelsi);
            System.out.println("=====Sorted By SerialNumber");
        TreeMap<AquaE,Integer> aquaETreeMap= new TreeMap<AquaE,Integer>(new SerialNumberC());
        aquaETreeMap.put(ellenCastillo,1);
        aquaETreeMap.put(evelynCastillo,2);
        aquaETreeMap.put(saudeepAlvin,3);
        aquaETreeMap.put(skippRussell,4);
        aquaETreeMap.put(sandeepRyan,5);
        Set<Map.Entry<AquaE,Integer>> entrySet = aquaETreeMap.entrySet();
        for (Map.Entry<AquaE,Integer> print:entrySet){
            System.out.println( print.getKey()+" the Value of TreeMap is: "+ print.getValue());
        }

            System.out.println("=====Sorted By Name");
            TreeMap<Bowling,Integer>bowlingIntegerTreeMap= new TreeMap<Bowling,Integer>(new NameBowlingC());
            bowlingIntegerTreeMap.put(alanoodCassietta,1);
            bowlingIntegerTreeMap.put(alanoudCerelia,2);
            bowlingIntegerTreeMap.put(angharadCicely,3);
            bowlingIntegerTreeMap.put(anandCiel,4);
            bowlingIntegerTreeMap.put(ashlandCoralynn,5);
            Set<Map.Entry<Bowling,Integer>>enterSet= bowlingIntegerTreeMap.entrySet();
            for(Map.Entry<Bowling,Integer>printName:enterSet){
                    System.out.println(printName.getKey()+ ",value of treeMap is: "+ printName.getValue());
            }
            System.out.println("=====Sorted By Time Arrived");
TreeMap<ShootingGalary,Integer>shootingGalaryIntegerTree=new TreeMap<ShootingGalary,Integer>(new ShootingTimeGcomp());
            shootingGalaryIntegerTree.put(jochebedCaraMai,1);
            shootingGalaryIntegerTree.put(maudChayce,2);
            shootingGalaryIntegerTree.put(gudridCacey,3);
            shootingGalaryIntegerTree.put(sineadCondoleezza,4);
            shootingGalaryIntegerTree.put(anitaCaraRose,5);
            Set<Map.Entry<ShootingGalary, Integer>>enterSetShoot= shootingGalaryIntegerTree.entrySet();
            for(Map.Entry<ShootingGalary, Integer>printTime:enterSetShoot){
                    System.out.println(printTime.getKey()+ "Value Of treeMap: "+ printTime.getValue());
            }

            System.out.println("=====Sorted By Limitation");
            TreeMap<SkatingRing,Integer>skatingRingIntegerTreeMap= new TreeMap<SkatingRing,Integer>(new SkatingArenaC());
            skatingRingIntegerTreeMap.put(aaminaBoux,1);
                    skatingRingIntegerTreeMap.put(addieCharlea,2);
            skatingRingIntegerTreeMap.put(asaCorina,3);
                    skatingRingIntegerTreeMap.put(astredChelsi,4);
            skatingRingIntegerTreeMap.put(astridCiena,5);
            Set<Map.Entry<SkatingRing, Integer>> eterSetSkating= skatingRingIntegerTreeMap.entrySet();
            for(Map.Entry<SkatingRing, Integer> printAge:eterSetSkating){
                    System.out.println(printAge.getKey()+" get value SkatingRing "+printAge.getValue());
            }

        }


    }

