package org.mql.platform.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laureate extends Student {
    private int yearGraduation;

    @ManyToMany
    @JoinTable(
            name = "laureate_technology",joinColumns = @JoinColumn(name = "laureate_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "technology_id", referencedColumnName = "id")
    )
    private List<Technology> technologies = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "laureate_education",joinColumns = @JoinColumn(name = "laureate_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "education_id", referencedColumnName = "id")
    )
    private List<Education> educations = new ArrayList<>();

    @OneToMany(mappedBy = "laureate")
    private List<Experiment> experiments = new ArrayList<>();

    public Laureate() {
    }

    public int getYearGraduation() {
        return yearGraduation;
    }

    public void setYearGraduation(int yearGraduation) {
        this.yearGraduation = yearGraduation;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Experiment> getExperiments() {
        return experiments;
    }

    public void setExperiments(List<Experiment> experiments) {
        this.experiments = experiments;
    }
}
