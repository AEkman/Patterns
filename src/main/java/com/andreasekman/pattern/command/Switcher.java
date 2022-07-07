package com.andreasekman.pattern.command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switcher {

  private final List<Command> commands;

  public Switcher() {
    this.commands = new ArrayList<>();
  }

  public void addCommand(Command command) {
    this.commands.add(command);
  }

  public void executeCommands() {
    commands.forEach(Command::execute);
  }

}
