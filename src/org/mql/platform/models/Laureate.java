package org.mql.platform.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Mesbahi
 * Add Lombok project to generate for us getters and setters builder equals hashcode and so on
 * used in order to make entity more visible
 *
 */
@Entity
// also entity Student to disscus because alerady we don't need some fields and also it was icompatible with our reasoning
@EqualsAndHashCode(callSuper=true) @ToString(callSuper = true)
@NoArgsConstructor @Data(staticConstructor = "of")
public class Laureate extends User {
	
	private String yearGraduation;
	private String postOccuped;

	@Builder
	public Laureate(Long id, Set<Role> roles, String firstName, String lastName, String phoneNumber, String email,
			String password, Gender gender, Address address, String yearGraduation, String postOccuped, List<Technology> technologies,
			List<Education> educations, List<Document> attachments, List<Language> languages,
			List<Experiment> experiments) {
		super(id, roles, firstName, lastName, phoneNumber, email, password, gender, address);
		this.yearGraduation = yearGraduation;
		this.postOccuped = postOccuped;
		this.technologies = technologies;
		this.educations = educations;
		this.attachments = attachments;
		this.languages = languages;
		this.experiments = experiments;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "laureate_technology", joinColumns = @JoinColumn(name = "laureate_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "technology_id", referencedColumnName = "id"))
	private List<Technology> technologies = new ArrayList<>();
	
	// to discuss
	@OneToMany
//	@JoinTable(name = "laureate_education", joinColumns = @JoinColumn(name = "laureate_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "education_id", referencedColumnName = "id"))
	private List<Education> educations = new ArrayList<>();
	
	@OneToMany
	private List<Document> attachments = new ArrayList<>();
	
	@ElementCollection(targetClass = Language.class) 
	@CollectionTable(name = "languages",
	    joinColumns = @JoinColumn(name = "laureateId"))
	@Column(name = "language")
	@Enumerated(EnumType.STRING)
	private List<Language> languages;
	
	@OneToMany(mappedBy = "laureate")
	private List<Experiment> experiments = new ArrayList<>();

}
