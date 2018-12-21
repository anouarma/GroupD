package org.mql.platform.models;

import javax.persistence.*;
import java.util.List;

/**
 * @author chermehdi
 * @author anouarma
 */
@Entity
public class Technology {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String label;

  @ManyToMany(mappedBy = "technologies")
  private List<Laureate> laureates;

  public Technology() {
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

  public List<Laureate> getLaureates() {return laureates;}

  public void setLaureates(List<Laureate> laureates) {this.laureates = laureates;}
}
