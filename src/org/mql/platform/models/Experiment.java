package org.mql.platform.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author chermehdi
 * @author anouarma
 *
 *         <pr> PS: maybe the name experience is a reserved word in hibernate it
 *         caused problems, so we needed to change the name of the table
 *         explicitely </pr>
 */

/**
 * @author Mesbahi
 *	so i leave Longership class because experience not always an Longership it may be a challenge or something else
 */
@Entity
public class Experiment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	private LocalDate start;
	private LocalDate end;
	private String postOccuped;
	@OneToMany
	private Enterprise enterprise;
	private String city;
	private String contry;
	private String activitySector;
	private String postDescription;
	
	public Experiment(LocalDate start, LocalDate end, String postOccuped, Enterprise enterprise, String city,
			String contry, String activitySector, String postDescription) {
		super();
		this.start = start;
		this.end = end;
		this.postOccuped = postOccuped;
		this.enterprise = enterprise;
		this.city = city;
		this.contry = contry;
		this.activitySector = activitySector;
		this.postDescription = postDescription;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public Experiment() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	public String getPostOccuped() {
		return postOccuped;
	}

	public void setPostOccuped(String postOccuped) {
		this.postOccuped = postOccuped;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getActivitySector() {
		return activitySector;
	}

	public void setActivitySector(String activitySector) {
		this.activitySector = activitySector;
	}

	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	@Override
	public String toString() {
		return "Experiment [id=" + id + ", start=" + start + ", end=" + end + ", postOccuped=" + postOccuped + ", city="
				+ city + ", activitySector=" + activitySector + ", postDescription=" + postDescription + ", contry="
				+ contry + "]";
	}
}
