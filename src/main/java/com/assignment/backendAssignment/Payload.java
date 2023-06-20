package com.assignment.backendAssignment;


//"loadingPoint": "delhi",
//        "unloadingPoint": "jaipur",
//        "productType": "chemicals",
//        "truckType": "canter",
//        "noOfTrucks": "1",
//        "weight": "100",
//        optional:"comment": "",
//        “shipperId” : “shipper:<UUID>”,
//        “Date” : “dd-mm-yyyy”


import java.util.UUID;

public class Payload {
    private int loadId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private int weight;
    private String shipperId;
    private String date;

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    public Payload(int loadId, String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String shipperId, String date) {
        this.loadId = loadId;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.shipperId = UUID.randomUUID().toString();
        this.date = date;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
