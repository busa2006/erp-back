package com.nyd.erp.production.service.production;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.production.ProductionResult;
import com.nyd.erp.production.dto.production.result.ProductionResultRequestDto;
import com.nyd.erp.production.dto.production.result.ProductionResultResponseDto;
import com.nyd.erp.production.repository.base.ItemProcessRepository;
import com.nyd.erp.production.repository.production.ProductionResultRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductionResultService {
	private final ProductionResultRepository productionResultRepository;
	
	public List<ProductionResultResponseDto> findAll() {
		List<ProductionResult> productionResultList = productionResultRepository.findAll();
		return productionResultList.stream().map(p -> new ProductionResultResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<ProductionResultRequestDto,ProductionResult> productionResultSaveData) {
		productionResultSaveData.toEntity();
		productionResultSaveData.save(productionResultRepository);
	}
	
}	

