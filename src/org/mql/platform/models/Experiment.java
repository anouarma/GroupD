package org.mql.platform.models;

import java.time.LocalDate;
import javax.persistence.*;

/**
 * @author chermehdi
 * @author anouarma
 *
 * <pr>
 * PS: maybe the name experience is a reserved word in hibernate it caused problems, so we needed to
 * change the name of the table explicitely
 * </pr>
 */
@Entity
public class Experiment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Integer id;

  private String description;

  private LocalDate start;

  private LocalDate end;

  @ManyToOne
  private Enterprise entreprise;

  @ManyToOne
  private Laureate laureate;

  public Experiment() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  public Enterprise getEntreprise() {return entreprise;}

  public void setEntreprise(Enterprise entreprise) {this.entreprise = entreprise;}

  public Laureate getLaureate() {return laureate;}

  public void setLaureate(Laureate laureate) {this.laureate = laureate; }
}
