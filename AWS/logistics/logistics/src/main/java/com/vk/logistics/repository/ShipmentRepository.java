package com.vk.logistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.logistics.entity.ShipmentEntity;

public interface ShipmentRepository extends JpaRepository<ShipmentEntity, String> {
	
}
