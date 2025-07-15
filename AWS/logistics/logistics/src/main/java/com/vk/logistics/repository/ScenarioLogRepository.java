package com.vk.logistics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.logistics.entity.ScenarioLogEntity;

public interface ScenarioLogRepository extends JpaRepository<ScenarioLogEntity, Long> {
    List<ScenarioLogEntity> findByShipmentId(String shipmentId);
}
