package org.mql.platform.business.career.impl;

import java.util.Optional;

import org.mql.platform.business.career.TechnologyService;
import org.mql.platform.dao.TechnologyRepository;
import org.mql.platform.models.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class TechnologyServiceDefault implements TechnologyService{
	
	@Autowired
	private TechnologyRepository technologyRepository;
	@Override
	public Page<Technology> getAllTechnology(Pageable page) {
		return technologyRepository.findAll(page);
	}

	@Override
	public Technology saveTechnology(Technology technology) {
		return technologyRepository.save(technology);
	}

	@Override
	public void removeTechnology(Long id) {
		technologyRepository.deleteById(id);
	}

	@Override
	public Optional<Technology> findTechnologyById(Long id) {
		return technologyRepository.findById(id);
	}

}
