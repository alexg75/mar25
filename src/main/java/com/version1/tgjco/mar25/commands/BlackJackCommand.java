package com.version1.tgjco.mar25.commands;

import org.springframework.shell.command.CommandContext;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class BlackJackCommand {

    @ShellMethod(key = "hit", value = "Say")
    public String hit() {
        return "Hello, world! - hit";
    }

    @ShellMethod(key = "stand", value = "hello")
    public String stand() {
        return "Hello, world! - stand";
    }

    @Command
    public void example(CommandContext ctx) {
        ctx.getTerminal().writer().println("hi");
        ctx.getTerminal().writer().flush();
    }
}
