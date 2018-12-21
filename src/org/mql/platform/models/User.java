package org.mql.platform.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class User {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;

  @ManyToMany
  @JoinTable(
      name = "user_role",
      joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
  )
  private Set<Role> roles;

  private String firstName;

  private String lastName;

  private String phoneNumber;

  private String email;

  private String password;

  @Enumerated
  private Gender gender;

  @OneToOne
  private Address address;
}
