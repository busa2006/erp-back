package com.nyd.erp.production.service.base;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nyd.erp.common.model.save.SaveData;
import com.nyd.erp.production.domain.base.Process;
import com.nyd.erp.production.dto.base.process.ProcessRequestDto;
import com.nyd.erp.production.dto.base.process.ProcessResponseDto;
import com.nyd.erp.production.repository.base.ProcessRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProcessService {
	private final ProcessRepository processRepository;
	
	public List<ProcessResponseDto> findAll() {
		List<Process> processList = processRepository.findAll();
		return processList.stream().map(p -> new ProcessResponseDto(p)).collect(Collectors.toList());
	}	
	
	public void save(SaveData<ProcessRequestDto,Process> processSaveData) {
		processSaveData.toEntityAndSave(processRepository);
	}
}

