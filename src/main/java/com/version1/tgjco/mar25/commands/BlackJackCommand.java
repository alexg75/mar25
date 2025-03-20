package com.version1.tgjco.mar25.commands;

import com.version1.tgjco.mar25.service.DealerService;
import org.springframework.shell.command.CommandContext;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class BlackJackCommand {

    private final DealerService dealerService;
    private final static String NEXT_MOVE = "Hit or Stay?";

    public BlackJackCommand(DealerService dealerService) {
        this.dealerService = dealerService;
    }

    @ShellMethod(key = "start", value = "Start the game")
    public String start() {
        dealerService.startGame();
        return NEXT_MOVE;
    }

    @ShellMethod(key = "end", value = "End the game")
    public void end() {
        System.out.println("Good bye!");
        System.exit(0);
    }

    @ShellMethod(key = "hit", value = "One more card please!")
    public String hit() {
        dealerService.getCard(DealerService.Players.PLAYER);
        return NEXT_MOVE;
    }

    @ShellMethod(key = "stand", value = "I am OK")
    public String stand() {
        return "Thank you";
    }
}
