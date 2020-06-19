package com.players;

/**
 * Main method use to run App
 *
 */
public class App {
  /**
   * create two player one initiator who send messages and anther player to replay with received
   * message and MSG counter
   * 
   */
  public static void main(String[] args) {
    final String initiatorName = "initiator";
    final String playerBName = "playerB";
    Player initiator = PlayerRegistry.getInstance(initiatorName);
    PlayerRegistry.getInstance(playerBName);
    initiator.sendMessage(playerBName, "Hello");

  }
}
