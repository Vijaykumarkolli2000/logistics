package com.vk.logistics.service;

import org.springframework.stereotype.Service;

import com.vk.logistics.dto.ScenarioResultDTO;

@Service
public class CustomerCommunicationAgent {
    public void notifyCustomer(String shipmentId, ScenarioResultDTO scenario) {
        // Simulate notification (e.g., email, SMS, push)
        System.out.println("Notifying customer for shipment " + shipmentId + ": " + scenario.getRecommendationReason());
    }

    public void captureFeedback(String shipmentId, String feedback) {
        // Save feedback to S3 or DB (stub)
        System.out.println("Feedback for " + shipmentId + ": " + feedback);
    }
}
