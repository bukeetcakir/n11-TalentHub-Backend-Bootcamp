package com.bukeetcakir.realestateapp.entity;

import com.bukeetcakir.realestateapp.enums.RealEstateType;

public class SummerHouse extends RealEstate {

    public SummerHouse() {
        setRealEstateType(RealEstateType.SUMMER_HOUSE);
    }

    public SummerHouse(int room, int livingRoom, double area, double price) {
        super(room, livingRoom, area, price);
        setRealEstateType(RealEstateType.SUMMER_HOUSE);
    }
}
