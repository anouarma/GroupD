package org.mql.platform.models;

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
 */

/**
 * @author Mesbahi Add Lombok project to generate for us getters and setters
 *         builder equals hashcode and so on used in order to make entity more
 *         visible
 */

@Data @ToString @Builder @AllArgsConstructor @NoArgsConstructor
@Entity
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String label;

	private String place;

	private String city;

	private LocalDate start;

	private LocalDate end;

}
