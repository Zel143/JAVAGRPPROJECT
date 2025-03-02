package com.realestate.services;

import com.realestate.models.Lot;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LotService {
    private List<Lot> lots;

    public LotService() {
        this.lots = new ArrayList<>();
    }

    public void addLot(Lot lot) {
        lots.add(lot);
    }

    public List<Lot> getAvailableLots() {
        return lots.stream()
                .filter(lot -> !lot.isSold())
                .collect(Collectors.toList());
    }

    public List<Lot> filterLots(double minSize, double maxSize, int block) {
        return lots.stream()
                .filter(lot -> lot.getSize() >= minSize && lot.getSize() <= maxSize && lot.getBlock() == block)
                .collect(Collectors.toList());
    }

    public void reserveLot(Lot lot) {
        if (lots.contains(lot) && !lot.isSold()) {
            lot.setReserved(true);
        }
    }

    public void sellLot(Lot lot) {
        if (lots.contains(lot) && !lot.isSold()) {
            lot.setSold(true);
        }
    }

    public List<Lot> getAllLots() {
        return lots;
    }
}