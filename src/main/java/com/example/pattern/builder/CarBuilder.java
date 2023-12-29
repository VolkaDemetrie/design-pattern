package com.example.pattern.builder;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seatCnt) {
        this.car.setSeat(seatCnt);
    }

    @Override
    public void setEngine(String engineNm) {
        this.car.setEngine(engineNm);
    }

    @Override
    public void setTripComputer(String tripComputerNm) {
        this.car.setTripComputer(tripComputerNm);
    }

    @Override
    public void setGPS(boolean isGps) {
        this.car.setGps(isGps);
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
