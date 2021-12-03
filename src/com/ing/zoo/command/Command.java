package com.ing.zoo.command;

public interface Command {
    String getName();
    void execute(String[] args);
}
