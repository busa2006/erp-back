package com.nyd.erp.production.service.production;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.production.ProductionReceive;
import com.nyd.erp.production.dto.production.receive.ProductionReceiveRequestDto;
import com.nyd.erp.production.dto.production.receive.ProductionReceiveResponseDto;
import com.nyd.erp.production.repository.production.ProductionReceiveRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductionReceiveService {
	private final ProductionReceiveRepository productionReceiveRepository;
	
	public List<ProductionReceiveResponseDto> findAll() {
		List<ProductionReceive> productionReceiveList = productionReceiveRepository.findAll();
		return productionReceiveList.stream().map(p -> new ProductionReceiveResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<ProductionReceiveRequestDto,ProductionReceive> productionReceiveSaveData) {
		productionReceiveSaveData.toEntityAndSave(productionReceiveRepository);
	}
}

