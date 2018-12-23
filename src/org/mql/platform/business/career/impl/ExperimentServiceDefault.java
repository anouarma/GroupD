package org.mql.platform.business.career.impl;

import java.util.Optional;

import org.mql.platform.business.career.ExperimentService;
import org.mql.platform.dao.ExperimentRepository;
import org.mql.platform.models.Experiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class ExperimentServiceDefault implements ExperimentService{
	
	@Autowired
	private ExperimentRepository experimentRepository;
	
	@Override
	public Page<Experiment> getAllExperiment(Pageable page) {
		return experimentRepository.findAll(page);
	}

	@Override
	public Experiment saveExperiment(Experiment experiment) {
		return experimentRepository.save(experiment);
	}

	@Override
	public void removeExperiment(Long id) {
		experimentRepository.deleteById(id);;
	}

	@Override
	public Optional<Experiment> findExperimentById(Long id) {
		return experimentRepository.findById(id);
	}
	
}
