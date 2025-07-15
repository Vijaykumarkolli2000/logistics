package com.vk.logistics.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.vk.logistics.dto.ShipmentDetailsDTO;
import com.vk.logistics.entity.ShipmentEntity;
import com.vk.logistics.repository.ShipmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShipmentService {
    private final ShipmentRepository shipmentRepository = null;

    public ShipmentEntity saveShipment(ShipmentDetailsDTO dto) {
        ShipmentEntity entity = new ShipmentEntity();
        BeanUtils.copyProperties(dto, entity);
        entity.setStatus("RECEIVED");
        return shipmentRepository.save(entity);
    }
}
