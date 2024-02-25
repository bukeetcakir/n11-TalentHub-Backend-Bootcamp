package com.bukeetcakir.realestateapp.service;

import com.bukeetcakir.realestateapp.entity.RealEstate;
import com.bukeetcakir.realestateapp.enums.RealEstateType;

import java.util.List;
import java.util.stream.Collectors;

public class RealEstateService {
    private final List<RealEstate> realEstates;

    public RealEstateService(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public double totalPriceByRealEstateType(RealEstateType realEstateType) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getRealEstateType() == realEstateType)
                .mapToDouble(RealEstate::getPrice)
                .sum();
    }

    public double totalPriceOfAllRealEstates() {
        return realEstates.stream()
                .mapToDouble(RealEstate::getPrice)
                .sum();
    }

    public double calculateAreaByRealEstateType(RealEstateType realEstateType) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getRealEstateType() == realEstateType)
                .mapToDouble(RealEstate::getArea)
                .average()
                .orElse(0);
    }

    public double calculateAverageAreaOfAllRealEstates() {
        return realEstates.stream()
                .mapToDouble(RealEstate::getArea)
                .average()
                .orElse(0);
    }

    public List<RealEstate> filterRealEstatesByRoomAndLivingRoom(int room, int livingRoom) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getRoom() == room
                        && realEstate.getLivingRoom() == livingRoom)
                .collect(Collectors.toList());
    }
}
