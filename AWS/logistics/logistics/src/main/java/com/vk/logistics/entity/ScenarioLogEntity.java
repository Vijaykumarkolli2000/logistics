package com.vk.logistics.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ScenarioLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shipmentId;
    private String scenarioId;
    private String transportMode;
    private double estimatedCost;
    private double estimatedTimeHours;
    private double estimatedEmissionsKgCO2;
    private boolean recommended;
}
