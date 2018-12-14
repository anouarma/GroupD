package org.mql.platform.postMql.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chermehdi
 * @author anouarma
 *
 *         <pr> PS: maybe the name experience is a reserved word in hibernate it
 *         caused problems, so we needed to change the name of the table
 *         explicitely </pr>
 */

/**
 * @author Mesbahi so i leave Intership class because experience not always an
 *         intership it may be a challenge or something else
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Experiment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	private LocalDate start;
	private LocalDate end;
	private String postOccuped;
	private String city;
	private String activitySector;
	private String postDescription;
	private String contry;
}
