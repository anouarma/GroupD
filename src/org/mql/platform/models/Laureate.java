package org.mql.platform.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * @author Mesbahi
 *
 */
@Entity
// also entity Student to disscus because alerady we don't need some fields and
// also it was icompatible with our reasoning
public class Laureate extends User {
	private String yearGraduation;
	private String postOccuped;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "laureate_technology", joinColumns = @JoinColumn(name = "laureate_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "technology_id", referencedColumnName = "id"))
	private List<Technology> technologies = new ArrayList<>();

	// to discuss
	// @JoinTable(name = "laureate_education", joinColumns = @JoinColumn(name =
	// "laureate_id", referencedColumnName = "id"), inverseJoinColumns =
	// @JoinColumn(name = "education_id", referencedColumnName = "id"))
	@OneToMany
	private List<Education> educations = new ArrayList<>();

	@OneToMany
	private List<Document> attachments = new ArrayList<>();

	@ElementCollection(targetClass = Language.class)
	@CollectionTable(name = "languages", joinColumns = @JoinColumn(name = "laureateId"))
	@Column(name = "language")
	@Enumerated(EnumType.STRING)
	private List<Language> languages;
	@OneToMany
	private List<Experiment> experiments = new ArrayList<>();

	public String getYearGraduation() {
		return yearGraduation;
	}

	public void setYearGraduation(String yearGraduation) {
		this.yearGraduation = yearGraduation;
	}


	public Laureate() {
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

	public String getPostOccuped() {
		return postOccuped;
	}

	public void setPostOccuped(String postOccuped) {
		this.postOccuped = postOccuped;
	}
}
