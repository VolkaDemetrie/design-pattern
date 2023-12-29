package com.example.pattern.builder.client;

import com.example.pattern.builder.Car;
import com.example.pattern.builder.CarBuilder;
import com.example.pattern.builder.CarManualBuilder;
import com.example.pattern.builder.Manual;
import com.example.pattern.builder.director.Director;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class ClientApplication {

    public void makeCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual manual = manualBuilder.getProduct();
    }
}
