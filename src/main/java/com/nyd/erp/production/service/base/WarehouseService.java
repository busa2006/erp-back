package com.nyd.erp.production.service.base;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.base.Warehouse;
import com.nyd.erp.production.dto.base.warehouse.WarehouseRequestDto;
import com.nyd.erp.production.dto.base.warehouse.WarehouseResponseDto;
import com.nyd.erp.production.repository.base.WarehouseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WarehouseService {
	private final WarehouseRepository warehouseRepository;
	
	public List<WarehouseResponseDto> findAll() {
		List<Warehouse> warehouseList = warehouseRepository.findAll();
		return warehouseList.stream().map(p -> new WarehouseResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<WarehouseRequestDto,Warehouse> warehouseSaveData) {
		warehouseSaveData.toEntityAndSave(warehouseRepository);
	}
}

