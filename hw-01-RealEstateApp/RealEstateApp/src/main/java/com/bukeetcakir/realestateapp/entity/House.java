package com.bukeetcakir.realestateapp.entity;

import com.bukeetcakir.realestateapp.enums.RealEstateType;

public class House extends RealEstate {

    public House() {
        this.setRealEstateType(RealEstateType.HOUSE);
    }

    public House(int room, int livingRoom, double area, double price) {
        super(room, livingRoom, area, price);
        this.setRealEstateType(RealEstateType.HOUSE);

    }
}
