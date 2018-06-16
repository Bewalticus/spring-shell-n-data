package de.bewalt.spring.shellndata.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ServerCommands {
  
  @ShellMethod("Lists all the defined servers")
  public String ListServers() {
    return "List of servers defined";
  }
    
}
