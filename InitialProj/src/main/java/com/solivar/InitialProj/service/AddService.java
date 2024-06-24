package com.solivar.InitialProj.service;

import org.springframework.stereotype.Service;

import com.solivar.InitialProj.data.AddDTO;
import com.solivar.InitialProj.data.AddEntity;
import com.solivar.InitialProj.data.AddRepository;

import jakarta.transaction.Transactional;

@Service
public class AddService {
	
	private AddRepository addRepository;
	
	public AddService(AddRepository addRepository) {
		this.addRepository = addRepository;
	}
	
	@Transactional
	public AddDTO addNum(AddDTO addDTO) {
		AddEntity addEntity = new AddEntity();
		addEntity.setNum1(addDTO.getNum1());
		addEntity.setNum2(addDTO.getNum2());
		addEntity.setSum(addDTO.getNum1()+addDTO.getNum2());
		addRepository.save(addEntity);
		addDTO.setAddSeqId(addEntity.getAddSeqId());
		addDTO.setSum(addEntity.getSum());;
		return addDTO;
		
	}

}
