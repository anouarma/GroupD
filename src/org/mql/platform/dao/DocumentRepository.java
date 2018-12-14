package org.mql.platform.dao;

import org.mql.platform.commons.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface DocumentRepository extends JpaRepository<Document, Integer> {


}
