package com.vk.logistics.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ShipmentDetailsDTO {
    private String shipmentId;
    private String origin; // e.g., "Chennai, India"
    private String destination; // e.g., "Colombo, Sri Lanka"
    private double weightKg;
    private double volumeM3;
    private LocalDate shipmentDate;
	public double getWeightKg() {
		// TODO Auto-generated method stub
		return 0;
	}
}
