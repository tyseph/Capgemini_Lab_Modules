package labBook3.ex2;

public class Client {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Full Name: ");
//		String name = sc.nextLine();
//		System.out.print("Phone Number: ");
//		long phone = sc.nextLong();
//		sc.close();

		String name = "Sajal Deepak Ganjewala";
		long phone = 123456789;

		Author author = new Author(1, name.split(" ")[0], name.split(" ")[1], name.split(" ")[2], phone);

		AuthorMethods meth = new AuthorMethods();

		meth.addAuthor(author);
		System.out.println(author.toString());
		System.out.println("Done");
	}
}
