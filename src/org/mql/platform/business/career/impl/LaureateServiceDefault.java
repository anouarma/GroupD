package org.mql.platform.business.career.impl;

import java.util.Optional;

import org.mql.platform.business.career.LaureateService;
import org.mql.platform.dao.LaureateRepository;
import org.mql.platform.models.Laureate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class LaureateServiceDefault implements LaureateService {
	
	@Autowired
	private LaureateRepository laureateRepository; 
	
	@Override
	public Page<Laureate> getAllLaureate(Pageable page) {
		return laureateRepository.findAll(page);
	}

	@Override
	public Laureate saveLaureate(Laureate laureate) {
		return laureateRepository.save(laureate);
	}

	@Override
	public void removeLaureate(Long id) {
		laureateRepository.deleteById(id);
	}

	@Override
	public Optional<Laureate> findLaureateById(Long id) {
		return laureateRepository.findById(id);
	}

}
