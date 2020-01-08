package com.bibek.googlemapsactivity.model;

public class Latitudeandlongitude {
    private double lat;
    private double lon;
    private String marker;

    public double getLat() {
        return lat;
    }

    public Latitudeandlongitude(double lat, double lon, String marker) {
        this.lat = lat;
        this.lon = lon;
        this.marker = marker;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
