package org.mql.platform.business.career;

import java.util.Optional;

import org.mql.platform.models.Laureate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LaureateService {
	
	public Page<Laureate> getAllLaureate(Pageable page);
	public Laureate saveLaureate(Laureate laureate);
	public void removeLaureate(Long id);
	public Optional<Laureate> findLaureateById(Long id);
}
