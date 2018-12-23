package org.mql.platform.business.career;

import java.util.Optional;

import org.mql.platform.models.Experiment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ExperimentService {
	public Page<Experiment> getAllExperiment(Pageable page);
	public Experiment saveExperiment(Experiment experiment);
	public void removeExperiment(Long id);
	public Optional<Experiment> findExperimentById(Long id);
}
