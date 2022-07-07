package com.andreasekman.pattern.command;

public class Main {

  public static void main(String[] args) {
    Light light = new Light();
    TurnOnCommand onCommand = new TurnOnCommand(light);
    TurnOffCommand offCommand = new TurnOffCommand(light);

    Switcher switcher = new Switcher();
    switcher.addCommand(onCommand);
    switcher.addCommand(offCommand);
    switcher.executeCommands();
  }
}
