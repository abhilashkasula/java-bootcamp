package com.parking;

import java.util.ArrayList;
import java.util.List;

public class Attendant implements Observer{
    private final List<ParkingLot> parkingLots;

    public Attendant() {
        this.parkingLots = new ArrayList<>();
    }

    public boolean addParkingLot(ParkingLot parkingLot) {
        return this.parkingLots.add(parkingLot);
    }

    public boolean park() {
        boolean result = false;

        for (ParkingLot parkingLot : this.parkingLots) {
            result = result || parkingLot.park();
        }

        return result;
    }

    @Override
    public void observe(ParkingLotStatus status) {
        System.out.println(status);
    }
}
