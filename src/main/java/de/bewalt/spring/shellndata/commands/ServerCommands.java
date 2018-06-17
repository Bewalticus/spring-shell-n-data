package de.bewalt.spring.shellndata.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import de.bewalt.spring.shellndata.data.Server;
import de.bewalt.spring.shellndata.data.ServerRepository;

@ShellComponent
public class ServerCommands {
  
  @Autowired
  public ServerRepository repository;
  
  @ShellMethod("Lists all the defined servers")
  public String listServers() {
    return repository.findAll().toString();
  }
  
  @ShellMethod("Defines a server")
  public String addServer(@ShellOption String hostName, @ShellOption String[] roles) {
    for (String role: roles) {
      System.out.println(role);
    }
    Server server = new Server();
    server.hostName = hostName;
    repository.save(server);
    
    return "OK";
  }
  
  @ShellMethod("huchle")
  public String huchle() throws Exception {
    throw new Exception("huchle");
  }
    
}
