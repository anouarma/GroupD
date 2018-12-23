package org.mql.platform.business.career;

import java.util.Optional;

import org.mql.platform.models.Education;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EducationService {
	public Page<Education> getAllEducation(Pageable page);
	public Education saveEducation(Education education);
	public void removeEducation(Long id);
	public Optional<Education> findEducationById(Long id);
}
