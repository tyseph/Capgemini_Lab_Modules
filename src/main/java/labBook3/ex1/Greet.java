package labBook3.ex1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greet")
public class Greet {

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "eid")
	private int messageId;
	@Column(name = "msg")
	private String message;

	Greet() {

	}

	public Greet(int messageId) {
		this.messageId = messageId;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
