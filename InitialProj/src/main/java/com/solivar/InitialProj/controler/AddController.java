package com.solivar.InitialProj.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solivar.InitialProj.data.AddDTO;
import com.solivar.InitialProj.service.AddService;

@RestController
@RequestMapping("/api")
public class AddController {
	
	private AddService addService;
	
	public AddController(AddService addService) {
		this.addService = addService;
	}
	
	@PostMapping("/sum")
	public ResponseEntity<AddDTO> addNum(@RequestBody AddDTO addDTO) {
		
		AddDTO addDTO2 = addService.addNum(addDTO);
		
		return ResponseEntity.ok(addDTO2);
		
		
	}

}
