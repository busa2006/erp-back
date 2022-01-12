package com.nyd.erp.production.service.base;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.base.ItemProcess;
import com.nyd.erp.production.dto.base.itemProcess.ItemProcessRequestDto;
import com.nyd.erp.production.dto.base.itemProcess.ItemProcessResponseDto;
import com.nyd.erp.production.repository.base.ItemProcessRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemProcessService {
	private final ItemProcessRepository itemProcessRepository;
	
	public List<ItemProcessResponseDto> findAll() {
		List<ItemProcess> itemProcessList = itemProcessRepository.findAll();
		return itemProcessList.stream().map(p -> new ItemProcessResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<ItemProcessRequestDto,ItemProcess> itemProcessSaveData) {
		itemProcessSaveData.toEntityAndSave(itemProcessRepository);
		
	}
}

