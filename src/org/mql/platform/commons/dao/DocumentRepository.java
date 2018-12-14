package org.mql.platform.commons.dao;

import org.mql.platform.commons.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface DocumentRepository extends JpaRepository<Document, Integer> {


}
