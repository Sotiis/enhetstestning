/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.systemintegration.driver;

import se.systemintegration.climate.City;
import se.systemintegration.climate.Coordinates;
import se.systemintegration.climate.Temperature;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pbfot
 */
public final class Driver {
    private Driver(){}

    public static void main(String... args){
        final City city = new City("Umeå",
                "Sweden",
                new Coordinates(63.8258f, 63.8258f),
                new Temperature(-2));
        System.out.println(city);
        city.setTemperature(5);
        System.out.println(city);
        
        final List<City> cities = new ArrayList<>(10);

        cities.add(city);

        for(int i = 0; i != 10; i++){
            cities.add(new City(Integer.toString(i),
                    Integer.toString(i+10),
                    new Coordinates(i+20, i+30),
                    new Temperature(i+40)));
            city.setTemperature(i);
        }
        
        //forEach to print cities in new line
        cities.forEach((cityElement) -> {
            System.out.println(cityElement);
        });
    }
}
