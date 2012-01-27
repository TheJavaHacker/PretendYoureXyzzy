// This file is automatically generated. Do not edit.
package net.socialgamer.cah.handlers;

import java.util.HashMap;
import java.util.Map;


public class Handlers {
  public final static Map<String, Class<? extends Handler>> LIST;

  static {
    LIST = new HashMap<String, Class<? extends Handler>>();
    LIST.put(ChatHandler.OP, ChatHandler.class);
    LIST.put(CreateGameHandler.OP, CreateGameHandler.class);
    LIST.put(FirstLoadHandler.OP, FirstLoadHandler.class);
    LIST.put(GameListHandler.OP, GameListHandler.class);
    LIST.put(GetCardsHandler.OP, GetCardsHandler.class);
    LIST.put(GetGameInfoHandler.OP, GetGameInfoHandler.class);
    LIST.put(JoinGameHandler.OP, JoinGameHandler.class);
    LIST.put(LeaveGameHandler.OP, LeaveGameHandler.class);
    LIST.put(LogoutHandler.OP, LogoutHandler.class);
    LIST.put(NamesHandler.OP, NamesHandler.class);
    LIST.put(PlayCardHandler.OP, PlayCardHandler.class);
    LIST.put(RegisterHandler.OP, RegisterHandler.class);
    LIST.put(StartGameHandler.OP, StartGameHandler.class);
  }
}
