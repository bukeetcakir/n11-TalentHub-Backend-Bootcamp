package com.bukeetcakir.realestateapp.entity;

import com.bukeetcakir.realestateapp.enums.RealEstateType;

public class Villa extends RealEstate {
    public Villa() {
        this.setRealEstateType(RealEstateType.VILLA);
    }

    public Villa(int room, int livingRoom, double area, double price) {
        super(room, livingRoom, area, price);
        this.setRealEstateType(RealEstateType.VILLA);
    }
}
