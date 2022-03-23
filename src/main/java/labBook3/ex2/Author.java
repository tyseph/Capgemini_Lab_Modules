package labBook3.ex2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author_data")
public class Author {

	@Id
	@Column(name = "author_id")
	private int authorId;
	@Column(name = "first_name")
	private String firstname;
	@Column(name = "middle_name")
	private String middlename;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "phone_no")
	private long phoneNo;

	Author() {

	}

	public Author(int authorId, String firstName, String middleName, String lastName, long phoneNo) {
		super();
		this.authorId = authorId;
		this.firstname = firstName;
		this.middlename = middleName;
		this.lastname = lastName;
		this.phoneNo = phoneNo;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getMiddleName() {
		return middlename;
	}

	public void setMiddleName(String middleName) {
		this.middlename = middleName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstname + ", middleName=" + middlename
				+ ", lastName=" + lastname + ", phoneNo=" + phoneNo + "]";
	}

}
