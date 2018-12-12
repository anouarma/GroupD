package org.mql.platform.business.career;

import org.mql.platform.models.Education;
import org.mql.platform.models.Experiment;
import org.mql.platform.models.Technology;

import java.util.List;

public interface LaureateService {

  List<Technology> getAllTechnologies();

  List<Education> getAllEducations();

  List<Experiment> getAllExperiments();


  Technology getTechnology(Integer id);

  Education getEducation(Integer id);

  Experiment getExperiment(Integer id);


  boolean addOrUpdateTechnology(Technology technology);

  boolean addOrUpdateEducation(Education education);

  boolean addOrUpdateExperiment(Experiment experiment);


  void deleteTechnology(Integer id);

  void deleteEducation(Integer id);

  void deleteExperience(Integer id);
}
