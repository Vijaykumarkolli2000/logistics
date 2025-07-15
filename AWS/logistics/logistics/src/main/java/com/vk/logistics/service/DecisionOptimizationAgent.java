package com.vk.logistics.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vk.logistics.dto.CustomerPreferencesDTO;
import com.vk.logistics.dto.ScenarioResultDTO;
import com.vk.logistics.repository.ScenarioLogRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DecisionOptimizationAgent {
    private final ScenarioLogRepository logRepo = null;

    public ScenarioResultDTO recommendBestScenario(List<ScenarioResultDTO> scenarios, CustomerPreferencesDTO prefs, String shipmentId) {
        ScenarioResultDTO best = scenarios.get(0); // Use optimizer logic here
        // Save all scenarios to DB
        for (ScenarioResultDTO s : scenarios) {
            ScenarioLogEntity log = new ScenarioLogEntity();
            log.setShipmentId(shipmentId);
            log.setScenarioId(s.getScenarioId());
            log.setTransportMode(s.getTransportMode());
            log.setEstimatedCost(s.getEstimatedCost());
            log.setEstimatedTimeHours(s.getEstimatedTimeHours());
            log.setEstimatedEmissionsKgCO2(s.getEstimatedEmissionsKgCO2());
            log.setRecommended(s == best);
            logRepo.save(log);
        }
        return best;
    }
}
