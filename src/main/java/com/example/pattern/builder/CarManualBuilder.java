package com.example.pattern.builder;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public class CarManualBuilder implements Builder {

    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seatCnt) {

    }

    @Override
    public void setEngine(String engineNm) {

    }

    @Override
    public void setTripComputer(String tripComputerNm) {

    }

    @Override
    public void setGPS(boolean isGps) {

    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
