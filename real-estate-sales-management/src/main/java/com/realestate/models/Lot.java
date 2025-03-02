package com.realestate.models;

public class Lot {
    private double size; // size in square meters
    private String location; // block number
    private double price; // price of the lot
    private boolean isSold; // status of the lot

    public Lot(double size, String location, double price) {
        this.size = size;
        this.location = location;
        this.price = price;
        this.isSold = false; // initially, the lot is available
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSold() {
        return isSold;
    }

    public void sell() {
        this.isSold = true;
    }

    public void reserve() {
        // Logic for reserving the lot can be added here
    }

    @Override
    public String toString() {
        return "Lot{" +
                "size=" + size +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", isSold=" + isSold +
                '}';
    }
}