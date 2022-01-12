package com.nyd.erp.production.service.base;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.base.ProcessItem;
import com.nyd.erp.production.dto.base.processItem.ProcessItemRequestDto;
import com.nyd.erp.production.dto.base.processItem.ProcessItemResponseDto;
import com.nyd.erp.production.repository.base.ProcessItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProcessItemService {
	private final ProcessItemRepository processItemRepository;
	
	public List<ProcessItemResponseDto> findAll() {
		List<ProcessItem> processItemList = processItemRepository.findAll();
		return processItemList.stream().map(p -> new ProcessItemResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<ProcessItemRequestDto,ProcessItem> processItemSaveData) {
		processItemSaveData.toEntityAndSave(processItemRepository);
		
	}
}

