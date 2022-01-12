package com.nyd.erp.production.service.production;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.production.ProductionOrder;
import com.nyd.erp.production.dto.production.order.ProductionOrderRequestDto;
import com.nyd.erp.production.dto.production.order.ProductionOrderResponseDto;
import com.nyd.erp.production.repository.production.ProductionOrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductionOrderService {
	private final ProductionOrderRepository productionOrderRepository;
	
	public List<ProductionOrderResponseDto> findAll() {
		List<ProductionOrder> productionOrderList = productionOrderRepository.findAll();
		return productionOrderList.stream().map(p -> new ProductionOrderResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<ProductionOrderRequestDto,ProductionOrder> productionOrderSaveData) {
		productionOrderSaveData.toEntityAndSave(productionOrderRepository);
	}
}

