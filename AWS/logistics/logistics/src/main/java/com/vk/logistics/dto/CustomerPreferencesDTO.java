package com.vk.logistics.dto;

import java.util.List;

import lombok.Data;

@Data
public class CustomerPreferencesDTO {
    private boolean prioritizeCost;
    private boolean prioritizeTime;
    private boolean prioritizeCarbon;
    private List<String> preferredModes; // e.g., ["SEA", "AIR"]
	public boolean isPrioritizeCost() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isPrioritizeTime() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isPrioritizeCarbon() {
		// TODO Auto-generated method stub
		return false;
	}
}
