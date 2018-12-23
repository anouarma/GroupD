package org.mql.platform.business.career.impl;

import java.util.Optional;

import org.mql.platform.business.career.EducationService;
import org.mql.platform.dao.EducationRepository;
import org.mql.platform.models.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public class EducationServiceDefault implements EducationService {
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Override
	public Page<Education> getAllEducation(Pageable page) {
		return educationRepository.findAll(page);
	}

	@Override
	public Education saveEducation(Education education) {
		return educationRepository.save(education);
	}

	@Override
	public void removeEducation(Long id) {
		educationRepository.deleteById(id);
	}

	@Override
	public Optional<Education> findEducationById(Long id) {
		return educationRepository.findById(id);
	}

}
