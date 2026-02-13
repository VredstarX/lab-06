package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city's name
     * @return
     * Name of city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Returns name of province the city is in
     * @return
     * Name of province
     */
    String getProvinceName(){
        return this.province;
    }


    /**
     * Compares cities
     * @param o
     * @return
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}