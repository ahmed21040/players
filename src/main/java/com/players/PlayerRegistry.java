package com.players;

import java.util.HashMap;
import java.util.Map;
/**
 * using Registry pattern
 * PlayerRegistry used to create new Instance or return reference of player  
 * @author AhmedFouad
 *
 */
public class PlayerRegistry {

  private static Map<String, Player> registry = new HashMap<String, Player>();

  private PlayerRegistry() {

  }

  /**
   * return player reference
   * @param playerName
   * @return
   */
  public static synchronized Player getInstance(String playerName) {

    Player instance = null;

    if (registry.containsKey(playerName)) {
      instance = registry.get(playerName);
    } else {
      instance = new Player(playerName);
      registry.put(playerName, instance);
    }

    return instance;
  }
}
