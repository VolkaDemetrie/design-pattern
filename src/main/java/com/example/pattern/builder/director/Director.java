package com.example.pattern.builder.director;

import com.example.pattern.builder.Builder;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V12");
        builder.setTripComputer("Trip");
        builder.setGPS(true);
    }


    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("V8");
        builder.setTripComputer("Trip");
        builder.setGPS(true);
    }
}
