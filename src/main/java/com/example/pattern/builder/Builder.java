package com.example.pattern.builder;

/**
 * @author : volka <volka5091@gmail.com>
 * description    :
 */
public interface Builder {
    void reset();
    void setSeats(int seatCnt);
    void setEngine(String engineNm);
    void setTripComputer(String tripComputerNm);
    void setGPS(boolean isGps);
}
