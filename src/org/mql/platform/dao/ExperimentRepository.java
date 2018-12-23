package org.mql.platform.dao;

import org.mql.platform.models.Experiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperimentRepository extends JpaRepository<Experiment, Long> {

}
