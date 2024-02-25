package com.bukeetcakir.realestateapp.entity;

import com.bukeetcakir.realestateapp.enums.RealEstateType;

public abstract class RealEstate {
    private int room;
    private int livingRoom;
    private double area;
    private double price;
    private RealEstateType realEstateType;

    public RealEstate() {
        this.room = 0;
        this.livingRoom = 0;
        this.price = 0;
        this.area = 0;
        this.realEstateType = null;
    }

    public RealEstate(int room, int livingRoom, double area, double price) {
        this.room = room;
        this.livingRoom = livingRoom;
        this.area = area;
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "room=" + room +
                ", livingRoom=" + livingRoom +
                ", area=" + area +
                ", price=" + price +
                ", realEstateType=" + realEstateType +
                '}';
    }
}
