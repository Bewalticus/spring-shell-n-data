package de.bewalt.spring.shellndata.data;

import org.springframework.data.annotation.Id;

public class Server {
  
  @Id
  public Integer id;
  public String hostName;
  
  @Override
  public String toString() {
    return "[" + id + ":" + hostName + "]";
  }
  
}
