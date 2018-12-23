package org.mql.platform.business.career;

import java.util.Optional;

import org.mql.platform.models.Technology;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TechnologyService {
	public Page<Technology> getAllTechnology(Pageable page);
	public Technology saveTechnology(Technology technology);
	public void removeTechnology(Long id);
	public Optional<Technology> findTechnologyById(Long id);
}
