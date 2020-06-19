package com.players;

public class Player extends Subscriber {

  private int messageCount = 0;
  private String playerName;


  public Player(String playerName) {
    this.playerName = playerName;
  }

  /**
   * send message from one player to anther player
   * 
   * @param subscriberName
   * @param message
   */
  public void sendMessage(String subscriberName, String message) {
    System.out.print("#" + (messageCount + 1) + " " + this.playerName + " send MSG :" + message);
    System.out.print("\t\t\t");
    messageCount++;
    Player subscriber = getSubscriber(subscriberName);
    if (subscriber == null) {
      this.addSubscriber(subscriberName);
      subscriber = getSubscriber(subscriberName);
    }
    subscriber.receiveMessage(this.getPlayerName(), message);

  }

  /**
   * receive message from player and replay with received message and
   * message count
   * 
   * @param subscriberName
   * @param message
   */
  public void receiveMessage(String subscriberName, String message) {
    System.out.println(this.playerName + " received MSG :" + message);
    
    if (messageCount >= 10) {
      System.exit(0);
    }
    String newMessage = message + " " + (messageCount + 1);
    this.sendMessage(subscriberName, newMessage);
  }

  public int getMessageCount() {
    return messageCount;
  }

  public void setMessageCount(int messageCount) {
    this.messageCount = messageCount;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

}
