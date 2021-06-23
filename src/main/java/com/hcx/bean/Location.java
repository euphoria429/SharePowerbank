package com.hcx.bean;

public class Location {
    private Integer locationId;

    private String locationCity;

    private String locationDistrict;

    private String locationAddress;

    private String locationAlias;

    private Integer locationAmount;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity == null ? null : locationCity.trim();
    }

    public String getLocationDistrict() {
        return locationDistrict;
    }

    public void setLocationDistrict(String locationDistrict) {
        this.locationDistrict = locationDistrict == null ? null : locationDistrict.trim();
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress == null ? null : locationAddress.trim();
    }

    public String getLocationAlias() {
        return locationAlias;
    }

    public void setLocationAlias(String locationAlias) {
        this.locationAlias = locationAlias == null ? null : locationAlias.trim();
    }

    public Integer getLocationAmount() {
        return locationAmount;
    }

    public void setLocationAmount(Integer locationAmount) {
        this.locationAmount = locationAmount;
    }
}