package facadedesignpattern;

import com.bridgelabz.utility.Util;

public class HelperFacadeAddressBook {
	public static void generateAddressBook()
	{
		Addressbook1 book1 = new Addressbook1();
		AddressBook2  book2 = new AddressBook2 ();
		int ch=0;
		while (ch!=2) {
			System.out.println("Enter your choice ");
			System.out.println("1 to read book");
			System.out.println("2 exit");
			ch = Util.inputInteger();
			switch (ch) {
			case 1:
				while (ch != 3) {
					System.out.println("Enter your choice to read book");
					System.out.println("Enter 1 to read book1 ");
					System.out.println("Enter 2 to read book2 ");
					System.out.println("Enter 3 to exit");
					ch = Util.inputInteger();
					
					switch (ch) {
					case 1:
						String b = book1.readbook();
						//System.out.println("Book 1 ->"+b);
					 	book1.displayBook();
						break;
					case 2:
						String bb = book2.readbook();
					//	System.out.println("Book 1 ->"+bb);
						book2.displayBook();
						System.out.println();
						break;

					default:
						System.out.println("invaid choice");
						System.out.println();
						break;
					}
				}
				
				break;

			default:
				break;
			}
		}
	}
}
