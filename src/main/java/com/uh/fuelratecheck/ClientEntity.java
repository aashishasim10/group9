package com.uh.fuelratecheck;

import javax.persistence.*;

@Entity
public class ClientEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String username;

  private String password;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return username;
  }

  public void setName(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  
}