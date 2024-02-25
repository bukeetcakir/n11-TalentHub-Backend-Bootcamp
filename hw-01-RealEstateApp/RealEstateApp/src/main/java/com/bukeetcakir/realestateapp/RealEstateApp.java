package com.bukeetcakir.realestateapp;

import com.bukeetcakir.realestateapp.entity.House;
import com.bukeetcakir.realestateapp.entity.RealEstate;
import com.bukeetcakir.realestateapp.entity.SummerHouse;
import com.bukeetcakir.realestateapp.entity.Villa;
import com.bukeetcakir.realestateapp.enums.RealEstateType;
import com.bukeetcakir.realestateapp.service.RealEstateService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RealEstateApp {

    public static void main(String[] args) {

        List<RealEstate> realEstateList = new ArrayList<>();
        realEstateList.add(new House(1, 1, 350, 500000));
        realEstateList.add(new House(2, 1, 450, 600000));
        realEstateList.add(new House(4, 1, 550, 700000));

        realEstateList.add(new SummerHouse(3, 1, 350, 500000));
        realEstateList.add(new SummerHouse(3, 2, 350, 700000));
        realEstateList.add(new SummerHouse(1, 1, 250, 300000));

        realEstateList.add(new Villa(3, 1, 350, 500000));
        realEstateList.add(new Villa(3, 2, 350, 700000));
        realEstateList.add(new Villa(2, 1, 250, 300000));

        RealEstateService realEstateService = new RealEstateService(realEstateList);

        System.out.println("Total Price of Houses: $" + realEstateService.totalPriceByRealEstateType(RealEstateType.HOUSE));
        System.out.println("Total Price of Villas: $" + realEstateService.totalPriceByRealEstateType(RealEstateType.VILLA));
        System.out.println("Total Price of Summer Houses: $" + realEstateService.totalPriceByRealEstateType(RealEstateType.SUMMER_HOUSE));
        System.out.println("Total Price of Real Estates: $" + realEstateService.totalPriceOfAllRealEstates());

        System.out.println("Average Area of Houses " + realEstateService.calculateAreaByRealEstateType(RealEstateType.HOUSE) + " m²");
        System.out.println("Average Area of Villas " + realEstateService.calculateAreaByRealEstateType(RealEstateType.VILLA) + " m²");
        System.out.println("Average Area of Summer Houses " + realEstateService.calculateAreaByRealEstateType(RealEstateType.SUMMER_HOUSE) + " m²");
        System.out.println("Average Area of Estates " + realEstateService.calculateAverageAreaOfAllRealEstates() + " m²");

        List<RealEstate> filteredRealEstate = realEstateService.filterRealEstatesByRoomAndLivingRoom(1, 1);
        System.out.println("1 Room and 1 Living Room RealEstates: " + filteredRealEstate);


    }

}
