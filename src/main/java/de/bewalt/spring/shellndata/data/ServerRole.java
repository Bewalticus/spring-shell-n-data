package de.bewalt.spring.shellndata.data;

import org.springframework.data.annotation.Id;

public class ServerRole {
  
  @Id
  public Integer id;
  public Integer ServerId;
  public Integer RoleId;
}
