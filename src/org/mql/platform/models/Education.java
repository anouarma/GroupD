package org.mql.platform.models;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

/**
 * @author chermehdi
 * @author anouarma
 */
@Entity
public class Education {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String label;

  private String place;

  private String city;

  private LocalDate start;

  private LocalDate end;

  @ManyToMany(mappedBy = "educations")
  private List<Laureate> laureates;

  public Education() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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

  public List<Laureate> getLaureates() {return laureates;}

  public void setLaureates(List<Laureate> laureates) {this.laureates = laureates;}
}
