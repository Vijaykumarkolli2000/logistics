package com.vk.logistics.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vk.logistics.dto.CustomerPreferencesDTO;
import com.vk.logistics.dto.ScenarioResultDTO;
import com.vk.logistics.dto.ShipmentDetailsDTO;
import com.vk.logistics.entity.ShipmentEntity;
import com.vk.logistics.service.CostTimeOptimizerService;
import com.vk.logistics.service.CustomerCommunicationAgent;
import com.vk.logistics.service.DecisionOptimizationAgent;
import com.vk.logistics.service.ScenarioSimulationService;
import com.vk.logistics.service.ShipmentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/shipments")
@RequiredArgsConstructor
public class ShipmentController {
    private ShipmentService shipmentService;
    private ScenarioSimulationService scenarioService;
    private CostTimeOptimizerService optimizer;
    private DecisionOptimizationAgent decisionAgent;
    private CustomerCommunicationAgent comms;

    @PostMapping("/recommend")
    public ResponseEntity<ScenarioResultDTO> recommendScenario(
            @RequestBody ShipmentDetailsDTO shipment,
            @RequestParam CustomerPreferencesDTO prefs) {
        // 1. Save shipment
        ShipmentEntity entity = shipmentService.saveShipment(shipment);

        // 2. Simulate scenarios
        List<ScenarioResultDTO> scenarios = scenarioService.simulateScenarios(shipment, prefs);

        // 3. Optimize
        ScenarioResultDTO best = optimizer.optimize(scenarios, prefs);

        // 4. Log and recommend
        ScenarioResultDTO recommended = decisionAgent.recommendBestScenario(scenarios, prefs, entity.getShipmentId());

        // 5. Notify customer
        comms.notifyCustomer(entity.getShipmentId(), recommended);

        return ResponseEntity.ok(recommended);
    }
}
