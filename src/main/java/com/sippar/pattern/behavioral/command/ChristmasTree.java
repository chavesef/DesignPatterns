package com.sippar.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void christmasTree() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public List<Command> getCommands() {
        return commands;
    }
}
