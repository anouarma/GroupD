package org.mql.platform.business.career.impl;

import org.mql.platform.business.career.LaureateService;
import org.mql.platform.dao.EducationRepository;
import org.mql.platform.dao.ExperimentRepository;
import org.mql.platform.dao.TechnologyRepository;
import org.mql.platform.models.Education;
import org.mql.platform.models.Experiment;
import org.mql.platform.models.Technology;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class DefaultLaureateService implements LaureateService {

    private final TechnologyRepository technologyRepository;

    private final EducationRepository educationRepository;

    private final ExperimentRepository experienceRepository;

    public DefaultLaureateService(TechnologyRepository technologyRepository,
                                    EducationRepository educationRepository,
                                    ExperimentRepository experimentRepository) {
        this.technologyRepository = technologyRepository;
        this.educationRepository = educationRepository;
        this.experienceRepository = experimentRepository;
    }



    public List<Technology> getAllTechnologies() {
        return technologyRepository.findAll();
    }

    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }

    public List<Experiment> getAllExperiments() {
        return experienceRepository.findAll();
    }

    public Technology getTechnology(Integer id) {
        return technologyRepository.getOne(id);
    }

    public Education getEducation(Integer id) {
        return educationRepository.getOne(id);
    }

    public Experiment getExperiment(Integer id) {
        return experienceRepository.getOne(id);
    }

    @Transactional
    public boolean addOrUpdateTechnology(Technology technology) {
        return technologyRepository.save(technology) != null;
    }

    @Transactional
    public boolean addOrUpdateEducation(Education education) {
        return educationRepository.save(education) != null;
    }

    @Transactional
    public boolean addOrUpdateExperiment(Experiment experiment) {
        return experienceRepository.save(experiment) != null;
    }

    @Transactional
    public void deleteTechnology(Integer id) {
        technologyRepository.deleteById(id);
        ;
    }

    @Transactional
    public void deleteEducation(Integer id) {
        educationRepository.deleteById(id);
    }

    @Transactional
    public void deleteExperience(Integer id) {
        experienceRepository.deleteById(id);
    }
}
