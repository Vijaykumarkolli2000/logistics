package com.vk.logistics.dto;

import lombok.Data;

@Data
public class ScenarioResultDTO {
    private String scenarioId;
    private String transportMode;
    private double estimatedCost;
    private double estimatedTimeHours;
    private double estimatedEmissionsKgCO2;
    private String recommendationReason;
	public String getRecommendationReason() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getScenarioId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTransportMode() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEstimatedCost() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEstimatedTimeHours() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEstimatedEmissionsKgCO2() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTransportMode(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setScenarioId(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setEstimatedCost(double estimateSeaCost) {
		// TODO Auto-generated method stub
		
	}
	public void setEstimatedTimeHours(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setEstimatedEmissionsKgCO2(double estimateSeaEmissions) {
		// TODO Auto-generated method stub
		
	}
}
