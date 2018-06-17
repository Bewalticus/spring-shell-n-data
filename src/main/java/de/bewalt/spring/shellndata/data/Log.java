package de.bewalt.spring.shellndata.data;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

public class Log {
  
  @Id
  public Integer id;
  public Integer serverId;
  public Integer actionId;
  public Integer status;
  public String errorText;
  public Timestamp created;
  
  public final static Integer STATUS_SUCCESSFULL = 0;
  public final static Integer STATUS_ERROR = 1;
}
