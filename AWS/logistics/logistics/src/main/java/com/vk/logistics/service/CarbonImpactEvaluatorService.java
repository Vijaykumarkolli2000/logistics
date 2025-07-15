package com.vk.logistics.service;

import org.springframework.stereotype.Service;

@Service
public class CarbonImpactEvaluatorService {
    // Simulate EcoTransIT API
    public double calculateEmissions(String mode, double weightKg, double distanceKm) {
        if ("SEA".equals(mode)) return weightKg * distanceKm * 0.013;
        if ("AIR".equals(mode)) return weightKg * distanceKm * 0.5;
        return weightKg * distanceKm * 0.05; // Default
    }
}
