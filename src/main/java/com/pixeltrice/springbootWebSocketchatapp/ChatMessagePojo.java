package com.pixeltrice.springbootWebSocketchatapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessagePojo {

  private String username;
  private String nomeUsuario;
  private String mensagem;
  private Integer idProposta;

}
