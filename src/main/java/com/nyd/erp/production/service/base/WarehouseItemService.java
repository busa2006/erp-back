package com.nyd.erp.production.service.base;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.base.WarehouseItem;
import com.nyd.erp.production.dto.base.warehouseItem.WarehouseItemRequestDto;
import com.nyd.erp.production.dto.base.warehouseItem.WarehouseItemResponseDto;
import com.nyd.erp.production.repository.base.WarehouseItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WarehouseItemService {
	private final WarehouseItemRepository warehouseItemRepository;
	
	public List<WarehouseItemResponseDto> findAll() {
		List<WarehouseItem> warehouseItemList = warehouseItemRepository.findAll();
		return warehouseItemList.stream().map(p -> new WarehouseItemResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<WarehouseItemRequestDto,WarehouseItem> warehouseItemSaveData) {
		warehouseItemSaveData.toEntityAndSave(warehouseItemRepository);
		
	}
}

