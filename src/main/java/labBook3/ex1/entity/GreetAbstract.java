package labBook3.ex1.entity;

import labBook3.ex1.Greet;

public interface GreetAbstract {

	public abstract Greet addMessage(Greet greet);

	public abstract Greet updateMessage(Greet greet);

	public abstract void deleteMessage(int id);

	public abstract Greet findMessage(int id);

}
