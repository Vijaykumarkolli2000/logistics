package com.vk.logistics.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentEntity {
    @Id
    private String shipmentId;
    private String origin;
    private String destination;
    private double weightKg;
    private double volumeM3;
    private LocalDate shipmentDate;
    private String status;
	public String getShipmentId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
}
