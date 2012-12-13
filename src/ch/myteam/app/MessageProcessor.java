package ch.myteam.app;

public class MessageProcessor {

  public void send(Message message) {
    message.validate();
    message.log();
    message.archive();
  }
}
