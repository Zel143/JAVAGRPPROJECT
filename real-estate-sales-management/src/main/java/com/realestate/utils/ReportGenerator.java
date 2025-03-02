package com.realestate.utils;

import com.realestate.models.Lot;
import java.util.List;

public class ReportGenerator {

    public String generateReport(List<Lot> lots) {
        StringBuilder report = new StringBuilder();
        report.append("Real Estate Lots Report\n");
        report.append("========================\n");
        
        for (Lot lot : lots) {
            report.append("Location: ").append(lot.getLocation()).append("\n");
            report.append("Size: ").append(lot.getSize()).append(" sqr. meters\n");
            report.append("Price: ").append(lot.getPrice()).append("\n");
            report.append("Status: ").append(lot.isSold() ? "Sold" : "Available").append("\n");
            report.append("------------------------\n");
        }
        
        return report.toString();
    }
}