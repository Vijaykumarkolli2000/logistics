package com.vk.logistics.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vk.logistics.dto.CustomerPreferencesDTO;
import com.vk.logistics.dto.ScenarioResultDTO;

@Service
public class CostTimeOptimizerService {

    public ScenarioResultDTO optimize(List<ScenarioResultDTO> scenarios, CustomerPreferencesDTO prefs) {
        if (prefs.isPrioritizeCost()) {
            return scenarios.stream()
                    .min(Comparator.comparingDouble(s -> s.getEstimatedCost()))
                    .orElse(null);
        }

        if (prefs.isPrioritizeTime()) {
            return scenarios.stream()
                    .min(Comparator.comparingDouble(s -> s.getEstimatedTimeHours()))
                    .orElse(null);
        }

        if (prefs.isPrioritizeCarbon()) {
            return scenarios.stream()
                    .min(Comparator.comparingDouble(s -> s.getEstimatedEmissionsKgCO2()))
                    .orElse(null);
        }

        return scenarios.get(0); // fallback
    }
}



