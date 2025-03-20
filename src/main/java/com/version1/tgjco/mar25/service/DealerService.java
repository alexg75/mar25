package com.version1.tgjco.mar25.service;

import com.version1.tgjco.mar25.client.ConsumerService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DealerService {

    ConsumerService consumerService;
    List<String> playerCards;
    List<String> dealerCards;

    //not the perfect place
    public enum Players {
        DEALER,
        PLAYER
    }

    public DealerService(ConsumerService consumerService) {
        this.consumerService = consumerService;
        playerCards = new ArrayList<>();
    }

    public String getCard(Players player) {
        var card = consumerService.getCard();
        System.out.println(card);


        if (player.equals(Players.PLAYER)) {
            //add to the player stack
        } else {
            //add to the dealer stack

            //ideally this shout throw an exception if the input is not valid
        }
        return "TODO";
    }

    public void startGame() {
        playerCards = new ArrayList<>();
        consumerService.getShuffleResponse();
    }

    //ideally we should keep the state a bit better
    private void calculate(Players player) {
        List<String> cards = (player.equals(Players.PLAYER)?playerCards:dealerCards);

        //TODO:


    }


}
