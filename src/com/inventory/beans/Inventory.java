/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inventory.beans;

/**
 *
 * @author rajan.chaturvedi
 */
public class Inventory {
    private int Id;
    private String batteryModel;
    private String mobileModel;
    private String capacity;
    private String brand;
    private String type;
    private String polarity;
    private String batteryType;
    private String connectortype;
    private String pinDetail;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the batteryModel
     */
    public String getBatteryModel() {
        return batteryModel;
    }

    /**
     * @param batteryModel the batteryModel to set
     */
    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    /**
     * @return the mobileModel
     */
    public String getMobileModel() {
        return mobileModel;
    }

    /**
     * @param mobileModel the mobileModel to set
     */
    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    /**
     * @return the capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the polarity
     */
    public String getPolarity() {
        return polarity;
    }

    /**
     * @param polarity the polarity to set
     */
    public void setPolarity(String polarity) {
        this.polarity = polarity;
    }

    /**
     * @return the batteryType
     */
    public String getBatteryType() {
        return batteryType;
    }

    /**
     * @param batteryType the batteryType to set
     */
    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    /**
     * @return the connectortype
     */
    public String getConnectortype() {
        return connectortype;
    }

    /**
     * @param connectortype the connectortype to set
     */
    public void setConnectortype(String connectortype) {
        this.connectortype = connectortype;
    }

    /**
     * @return the pinDetail
     */
    public String getPinDetail() {
        return pinDetail;
    }

    /**
     * @param pinDetail the pinDetail to set
     */
    public void setPinDetail(String pinDetail) {
        this.pinDetail = pinDetail;
    }
    
}