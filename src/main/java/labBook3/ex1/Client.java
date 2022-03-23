package labBook3.ex1;

import labBook3.ex1.entity.GreetMethods;

public class Client {

	public static void main(String[] args) {

		String message = "Some Random Text";

		Greet greet = new Greet(1);
		greet.setMessage(message);
		System.out.println(greet.getMessage());

		GreetMethods gm = new GreetMethods();

		gm.addMessage(greet);
//		gm.updateMessage(greet);

//		gm.deleteMessage(102);
//		System.out.println("Message Deleted");
//
//		System.out.println(gm.findMessage().getMessage());
	}
}
