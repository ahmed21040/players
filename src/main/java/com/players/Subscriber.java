package com.players;

import java.util.HashMap;
import java.util.Map;

/**
 * Subscriber class used to add and get subscribers for certain Player.
 * 
 * @author AhmedFouad
 *
 */
public class Subscriber {

  private Map<String, Player> subscribers = new HashMap<String, Player>();

  /**
   * create new Subscriber (like open session between users)
   * @param subscriberName
   */
  public void addSubscriber(String subscriberName) {
    if (!subscribers.containsKey(subscriberName)) {
      this.subscribers.put(subscriberName, PlayerRegistry.getInstance(subscriberName));
    }
  }
/**
 * get Subscriber of player.
 * @param subscriberName
 * @return
 */
  public Player getSubscriber(String subscriberName) {
    return subscribers.get(subscriberName);
  }
  
  /**
   * remove Subscriber
   * @param subscriberName
   */
  public void removeSubscriber(String subscriberName) {
    if (!subscribers.containsKey(subscriberName)) {
      this.subscribers.remove(subscriberName);
    }
  }
}
