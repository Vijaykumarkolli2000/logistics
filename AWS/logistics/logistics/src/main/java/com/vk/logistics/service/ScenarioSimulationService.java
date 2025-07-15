package com.vk.logistics.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.vk.logistics.dto.CustomerPreferencesDTO;
import com.vk.logistics.dto.ScenarioResultDTO;
import com.vk.logistics.dto.ShipmentDetailsDTO;

@Service
public class ScenarioSimulationService {
    // Simulate different transport modes (SEA, AIR, ROAD)
    public List<ScenarioResultDTO> simulateScenarios(ShipmentDetailsDTO shipment, CustomerPreferencesDTO prefs) {
        List<ScenarioResultDTO> results = new ArrayList<>();
        // Example: SEA
        results.add(simulateSea(shipment));
        // Example: AIR
        results.add(simulateAir(shipment));
        // Add more as needed
        return results;
    }

    private ScenarioResultDTO simulateSea(ShipmentDetailsDTO shipment) {
        ScenarioResultDTO dto = new ScenarioResultDTO();
        dto.setScenarioId(UUID.randomUUID().toString());
        dto.setTransportMode("SEA");
        dto.setEstimatedCost(estimateSeaCost(shipment));
        dto.setEstimatedTimeHours(72); // Example
        dto.setEstimatedEmissionsKgCO2(estimateSeaEmissions(shipment));
        return dto;
    }

    private ScenarioResultDTO simulateAir(ShipmentDetailsDTO shipment) {
        ScenarioResultDTO dto = new ScenarioResultDTO();
        dto.setScenarioId(UUID.randomUUID().toString());
        dto.setTransportMode("AIR");
        dto.setEstimatedCost(estimateAirCost(shipment));
        dto.setEstimatedTimeHours(12); // Example
        dto.setEstimatedEmissionsKgCO2(estimateAirEmissions(shipment));
        return dto;
    }

    // Dummy calculations (replace with real logic or API calls)
    private double estimateSeaCost(ShipmentDetailsDTO shipment) {
        return 1000 + shipment.getWeightKg() * 0.5;
    }
    private double estimateAirCost(ShipmentDetailsDTO shipment) {
        return 5000 + shipment.getWeightKg() * 2;
    }
    private double estimateSeaEmissions(ShipmentDetailsDTO shipment) {
        return shipment.getWeightKg() * 0.015;
    }
    private double estimateAirEmissions(ShipmentDetailsDTO shipment) {
        return shipment.getWeightKg() * 0.5;
    }
}
